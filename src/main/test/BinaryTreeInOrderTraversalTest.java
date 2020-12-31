package main.test;
import main.java.BinaryTreeInOrderTraversal;
import main.java.BinaryTreeInOrderTraversal.TreeNode;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeInOrderTraversalTest {

    @Test
    public void test1(){
        BinaryTreeInOrderTraversal bt = new BinaryTreeInOrderTraversal();
        int[] expected = {4,2,5,1,3};


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);


        assertArrayEquals(expected, bt.inorderTraversalIterative(root).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected, bt.inorderTraversalRecursive(root).stream().mapToInt(i -> i).toArray());

    }
}
