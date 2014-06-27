package org.arthur.structures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class StackTest {

    private Stack stack = null;

    @Before
    public void init() {
        stack = new Stack();
        stack.put(4);
        stack.put(1);
        stack.put(9);
    }

    @Test
    public void test() {
        Assert.assertNotNull(stack);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(9, stack.top().getElement().intValue());
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(9, stack.remove().getElement().intValue());
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, stack.remove().getElement().intValue());
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(4, stack.remove().getElement().intValue());
        Assert.assertTrue(stack.isEmpty());
    }

}
