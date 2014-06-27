package org.arthur.list;

import org.arthur.structs.Element;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 *
 * FIFO (First in first out)
 */
public class FIFOQueue {

    private final int max;
    private int start;
    private int end;

    private Element[] array;

    public FIFOQueue(int max) {
        this.max = max;
        this.start = -1;
        this.end = -1;
        this.array = new Element[max];
    }

    public void insert(int elem) {
        end = (end % max) + 1;
        array[end] = new Element(elem);
    }

    public Element remove() {
        start = (start % max) + 1;
        return array[start];
    }

    public Element first() {
        return array[(start % max) + 1];
    }

    public boolean isEmpty() {
        if(start == end)
            return true;
        return false;
    }

}
