package org.arthur.sort.impl;

import org.arthur.sort.Sort;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 *
 * Implementation of Heapsort, it sorts the array by creating max-heaps and putting
 * the max value (position 0) at the end of the array, marking it as sorted and decreasing
 * the value of the array size. It does it (n - 1) times getting a performance of O(n * log n)
 *
 */
public class Heapsort implements Sort {

    @Override
    public void sort(int[] array) {
        heapify(array);
        int i = array.length - 1;
        int size = array.length;
        while(i > 0) {
            swap(array, 0, i);
            maxHeapify(array, 0, --size);
            i--;
        }
    }

    private void heapify(int[] array) {
        int size = array.length;
        int i = size / 2;
        while(i > -1) {
            maxHeapify(array, i, size);
            i--;
        }
    }

    private int left(int pos) {
        return (2 * pos) + 1;
    }

    private int right(int pos) {
        return (2 * pos) + 2;
    }

    private void maxHeapify(int[] array, int pos, int size) {
        int l = left(pos);
        int r = right(pos);
        int minIndex = -1;

        if (l < size && array[l] > array[pos])
            minIndex = l;
        else
            minIndex = pos;

        if (r < size && array[r] > array[minIndex])
            minIndex = r;

        if (minIndex != pos) {
            swap(array, pos, minIndex);
            maxHeapify(array, minIndex, size);
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
