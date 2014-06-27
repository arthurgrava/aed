package org.arthur.structs;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class Element {

    private Integer element;

    public Element(Integer element) {
        this.element = element;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.toString();
    }
}
