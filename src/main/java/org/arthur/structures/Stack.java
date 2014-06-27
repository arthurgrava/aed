package org.arthur.structures;

import org.arthur.types.Element;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class Stack {

    private final static int MAX = 50;
    private Element[] array;
    private int top = -1;

    public Stack() {
        array = new Element[MAX];
    }

    public void put(int elem) {
        Element e = new Element(elem);
        top++;
        array[top] = e;
    }

    public Element remove() {
        top--;
        return array[top + 1];
    }

    public Element top() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }


}
