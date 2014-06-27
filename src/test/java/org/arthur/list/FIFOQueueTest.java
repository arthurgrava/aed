package org.arthur.list;

import org.arthur.structs.Element;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class FIFOQueueTest {

    private FIFOQueue queue = null;

    @Before
    public void init() {
        queue = new FIFOQueue(50);
        queue.insert(10);
        queue.insert(14);
        queue.insert(12);
        queue.insert(232);
        queue.insert(60);
        queue.insert(1);
    }

    @Test
    public void test() {
        Element result = queue.remove();

        Assert.assertEquals(10, result.getElement().intValue());

        result = queue.first();

        Assert.assertEquals(14, result.getElement().intValue());

        Assert.assertFalse(queue.isEmpty());

        Assert.assertTrue(new FIFOQueue(1).isEmpty());
    }

}
