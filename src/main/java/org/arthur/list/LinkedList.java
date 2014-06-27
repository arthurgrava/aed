package org.arthur.list;

import org.arthur.structs.Element;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class LinkedList {

    public Element get(Element root, int info) {
        if(root == null)
            return null;
        else {
            Element next = root;

            while(next != null && next.getInfo() != info) {
                next = next.getNext();
            }

            return next;
        }
    }

    public void insert(Element root, int info) {
        Element element = new Element(info);

        if(root == null || root.getInfo() == null) {
            root.setInfo(element.getInfo());
        } else {
            Element next = root;
            while(next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(element);
        }
    }

    public Element remove(Element root, int info) {
        if(root == null)
            return null;
        else if (root.getInfo() == info) {
            Element next = root;
            root = null;
            return next;
        } else {
            Element next = root;

            while(next.getNext() != null && info != next.getNext().getInfo()) {
                next = next.getNext();
            }

            if(next.getNext() != null) {
                Element found = next.getNext();
                next.setNext(null);
                return found;
            }

            return next;
        }
    }

    public boolean isEmpty(Element root) {
        if(root != null && root.getInfo() != null)
            return false;
        return true;
    }

}
