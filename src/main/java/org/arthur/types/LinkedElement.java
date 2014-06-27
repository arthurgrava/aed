package org.arthur.types;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class LinkedElement {

    private Integer info;
    private LinkedElement next;

    public LinkedElement() { }

    public LinkedElement(Integer info) {
        this.info = info;
    }

    public LinkedElement getNext() {
        return next;
    }

    public void setNext(LinkedElement next) {
        this.next = next;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }
}
