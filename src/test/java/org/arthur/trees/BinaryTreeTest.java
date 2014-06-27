package org.arthur.trees;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Arthur Grava (arthur at luizalabs.com).
 */
public class BinaryTreeTest {

    private BinaryNode root;
    private final BinaryTree tree = new BinaryTree();

    @Before
    public void before() {
        root = createTree();
    }

    @Test
    public void testPrintOrders() {
        Assert.assertNotNull(root);
        System.out.println("========= IN ORDER =========");
        tree.printInOrder(root);
        System.out.println("========= POS ORDER =========");
        tree.printPreOrder(root);
        System.out.println("========= PRE ORDER =========");
        tree.printPosOrder(root);
    }

    @Test
    public void testProperties() {
        Assert.assertEquals(13, tree.treeSize(root));
        Assert.assertEquals(6, tree.countLeafs(root));
        Assert.assertEquals(4, tree.height(root));
        for(int i = 0 ; i < 6 ; i++ ) {
            System.out.println("========= LEVEL (" + i + ") =========");
            tree.printLevel(root, i);
        }

        Assert.assertEquals(new Integer(3), tree.minimum(root).getInfo());
        Assert.assertEquals(new Integer(29), tree.minimum(root.getRight()).getInfo());
        Assert.assertEquals(new Integer(30), tree.minimum(root.getRight().getRight()).getInfo());

        Assert.assertEquals(new Integer(29), tree.sucessor(root).getInfo());
        Assert.assertEquals(new Integer(12), tree.sucessor(root.getLeft()).getInfo());
        Assert.assertEquals(new Integer(31), tree.sucessor(root.getRight().getRight().getLeft()).getInfo());
    }

    @Test
    public void testSearch() {
        BinaryNode got1 = tree.searchRecursive(root, 15);

        Assert.assertNotNull(got1);
        Assert.assertEquals(new Integer(15), got1.getInfo());
        Assert.assertEquals(new Integer(12), got1.getLeft().getInfo());
        Assert.assertEquals(new Integer(16), got1.getRight().getInfo());

        BinaryNode got2 = tree.searchInteractive(root, 15);

        Assert.assertNotNull(got2);
        Assert.assertEquals(new Integer(15), got2.getInfo());
        Assert.assertEquals(new Integer(12), got2.getLeft().getInfo());
        Assert.assertEquals(new Integer(16), got2.getRight().getInfo());

        Assert.assertEquals(got1, got2);
    }

    private BinaryNode createTree() {
        BinaryNode node = new BinaryNode();
        tree.insert(node, 20);
        tree.insert(node, 10);
        tree.insert(node, 15);
        tree.insert(node, 7);
        tree.insert(node, 9);
        tree.insert(node, 29);
        tree.insert(node, 32);
        tree.insert(node, 30);
        tree.insert(node, 31);
        tree.insert(node, 37);
        tree.insert(node, 3);
        tree.insert(node, 12);
        tree.insert(node, 16);

        return node;
    }
}
