package main.test;

import main.java.InOrderSuccessorBST;
import main.java.InOrderSuccessorBST.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InOrderSuccessorBSTTest {

    @Test
    public void test1(){
        InOrderSuccessorBST bt = new InOrderSuccessorBST();
        int[] expected = {4,2,5,1,3};


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        assertEquals(root.right.left, bt.inorderSuccessor(root, root));
        assertNull(bt.inorderSuccessor(root, root.right.right));
        assertEquals(root.right, bt.inorderSuccessor(root, root.right.left));

    }
}
