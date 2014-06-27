package org.arthur.list;

import org.arthur.structs.LinkedElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class LinkedListTest {

    private final LinkedList list = new LinkedList();
    private LinkedElement root;

    @Before
    public void init() {
        root = new LinkedElement();
        list.insert(root, 5);
        list.insert(root, 7);
        list.insert(root, 9);
        list.insert(root, 1);
        list.insert(root, 3);
        list.insert(root, 12);
        list.insert(root, 2);
    }

    @Test
    public void testGet() {
        LinkedElement result = list.get(root, 9);

        Assert.assertNotNull(result);
        Assert.assertEquals(new Integer(9), result.getInfo());

        result = list.get(root, 999);

        Assert.assertNull(result);
    }

    @Test
    public void testRemove() {
        LinkedElement result = list.remove(root, 9);

        Assert.assertNotNull(result);
        Assert.assertEquals(new Integer(9), result.getInfo());

        result = list.get(root, 9);

        Assert.assertNull(result);
    }

    @Test
    public void testIsEmpty() {
        boolean empty = list.isEmpty(root);

        Assert.assertFalse(empty);

        empty = list.isEmpty(new LinkedElement());

        Assert.assertTrue(empty);

        empty = list.isEmpty(null);

        Assert.assertTrue(empty);
    }

}
