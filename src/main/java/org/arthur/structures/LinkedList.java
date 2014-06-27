package org.arthur.structures;

import org.arthur.types.LinkedElement;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class LinkedList {

    public LinkedElement get(LinkedElement root, int info) {
        if(root == null)
            return null;
        else {
            LinkedElement next = root;

            while(next != null && next.getInfo() != info) {
                next = next.getNext();
            }

            return next;
        }
    }

    public void insert(LinkedElement root, int info) {
        LinkedElement linkedElement = new LinkedElement(info);

        if(root == null || root.getInfo() == null) {
            root.setInfo(linkedElement.getInfo());
        } else {
            LinkedElement next = root;
            while(next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(linkedElement);
        }
    }

    public LinkedElement remove(LinkedElement root, int info) {
        if(root == null)
            return null;
        else if (root.getInfo() == info) {
            LinkedElement next = root;
            root = null;
            return next;
        } else {
            LinkedElement next = root;

            while(next.getNext() != null && info != next.getNext().getInfo()) {
                next = next.getNext();
            }

            if(next.getNext() != null) {
                LinkedElement found = next.getNext();
                next.setNext(null);
                return found;
            }

            return next;
        }
    }

    public boolean isEmpty(LinkedElement root) {
        if(root != null && root.getInfo() != null)
            return false;
        return true;
    }

}
