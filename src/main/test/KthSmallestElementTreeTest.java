package main.test;

import main.java.KthSmallestElementTree;
import main.java.KthSmallestElementTree.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class KthSmallestElementTreeTest {

    @Test
    public void test1(){
        KthSmallestElementTree bt = new KthSmallestElementTree();


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        assertEquals(1, bt.kthSmallest(root, 1));
        assertEquals(2, bt.kthSmallest(root, 2));
        assertEquals(3, bt.kthSmallest(root, 3));
        assertEquals(4, bt.kthSmallest(root, 4));
        assertEquals(5, bt.kthSmallest(root, 5));
        assertEquals(6, bt.kthSmallest(root, 6));
        assertEquals(7, bt.kthSmallest(root, 7));

    }
}
