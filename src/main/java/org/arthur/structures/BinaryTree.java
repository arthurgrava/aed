package org.arthur.structures;

import org.arthur.types.BinaryNode;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class BinaryTree {

    public int treeSize(BinaryNode root) {
        if(root != null) {
            return 1 + treeSize(root.getLeft()) + treeSize(root.getRight());
        } else {
            return 0;
        }
    }

    public int countLeafs(BinaryNode root) {
        if(root == null) {
            return 0;
        } else if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        } else {
            return countLeafs(root.getLeft()) + countLeafs(root.getRight());
        }
    }

    public int height(BinaryNode root) {
        if(root == null) {
            return -1;
        } else {
            int left = height(root.getLeft());
            int right = height(root.getRight());
            return 1 + Math.max(left, right);
        }
    }

    public void printLevel(BinaryNode node, int level) {
        if(node != null) {
            if(level == 0) {
                System.out.println(node.getInfo());
            } else {
                printLevel(node.getLeft(), level - 1);
                printLevel(node.getRight(), level - 1);
            }
        }
    }

    public void printPreOrder(BinaryNode root) {
        if(root != null) {
            System.out.println(root.getInfo());
            printPreOrder(root.getLeft());
            printPreOrder(root.getRight());
        }
    }

    public void printPosOrder(BinaryNode root) {
        if(root != null) {
            printPosOrder(root.getLeft());
            printPosOrder(root.getRight());
            System.out.println(root.getInfo());
        }
    }

    public void printInOrder(BinaryNode root) {
        if(root != null) {
            printInOrder(root.getLeft());
            System.out.println(root.getInfo());
            printInOrder(root.getRight());
        }
    }

    public BinaryNode searchRecursive(BinaryNode root, int info) {
        if(root !=  null) {
            if(root.getInfo() == info) {
                return root;
            } else if (info > root.getInfo()) {
                return searchRecursive(root.getRight(), info);
            } else {
                return searchRecursive(root.getLeft(), info);
            }
        }
        return null;
    }

    public BinaryNode searchInteractive(BinaryNode root, int info) {
        BinaryNode aux = root;
        while(aux != null) {
            if(aux.getInfo() == info) {
                return aux;
            } else if (info > aux.getInfo()) {
                aux = aux.getRight();
            } else {
                aux = aux.getLeft();
            }
        }
        return null;
    }

    public BinaryNode minimum(BinaryNode root) {
        if(root == null) {
            return null;
        }

        BinaryNode aux = root;
        while(aux.getLeft() != null) {
            aux = aux.getLeft();
        }
        return aux;
    }

    public BinaryNode sucessor(BinaryNode node) {
        if(node != null) {
            if(node.getRight() != null) {
                return minimum(node.getRight());
            } else {
                BinaryNode parent = node.getParent();
                BinaryNode prev = node;
                while(parent != null && prev.equals(parent.getRight())) {
                    prev = parent;
                    parent = parent.getParent();
                }
                return parent;
            }
        }
        return null;
    }

    public void insert(BinaryNode root, int info) {
        BinaryNode parent = root;
        BinaryNode prev = null;
        while(parent != null && parent.getInfo() != null) {
            prev = parent;
            if(info < parent.getInfo()) {
                parent = parent.getLeft();
            } else {
                parent = parent.getRight();
            }
        }

        BinaryNode element = new BinaryNode();
        element.setInfo(info);

        if(prev == null) {
            root.setInfo(element.getInfo());
            return;
        } else if (info < prev.getInfo()) {
            prev.setLeft(element);
        } else {
            prev.setRight(element);
        }

        element.setParent(prev);
    }

}
