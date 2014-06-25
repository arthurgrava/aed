package org.arthur.sort;

import org.arthur.sort.impl.Heapsort;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class SortTest {

    private Sort sort = null;
    private int[] array = {9,5,6,2,3,1,8,7,4};
    private int[] sorted = {1,2,3,4,5,6,7,8,9};

    @Test
    public void testHeapsort() {
        sort = new Heapsort();
        int[] result = array.clone();
        sort.sort(result);

        Assert.assertEquals(result.length, sorted.length);
        for(int i = 0 ; i < result.length ; i++) {
            Assert.assertTrue(result[i] == sorted[i]);
        }
        System.out.println("Heapsort implemented properly");
        sort = null;
    }

}
