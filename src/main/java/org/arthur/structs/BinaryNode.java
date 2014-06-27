package org.arthur.structs;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class BinaryNode {

    private BinaryNode parent;
    private BinaryNode left;
    private BinaryNode right;
    private Integer info;

    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}
