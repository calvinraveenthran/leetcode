package main.test;

import main.java.BinaryTreeBFTraversal;
import main.java.BinaryTreeBFTraversal.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeBFTraversalTest {

    @Test
    public void test1(){
        BinaryTreeBFTraversal bt = new BinaryTreeBFTraversal();
        int[] expected = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        assertArrayEquals(expected, bt.bfTraversalIterative(root).stream().mapToInt(i -> i).toArray());
    }
}
