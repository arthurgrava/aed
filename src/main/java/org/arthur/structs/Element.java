package org.arthur.structs;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class Element {

    private Integer info;
    private Element next;

    public Element() { }

    public Element(Integer info) {
        this.info = info;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }
}
