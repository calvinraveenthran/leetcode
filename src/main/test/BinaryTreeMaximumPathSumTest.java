package main.test;
import main.java.BinaryTreeMaximumPathSum;
import main.java.BinaryTreeMaximumPathSum.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeMaximumPathSumTest {
    
    @Test
    public void test1(){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();

        int answer = b.maxPathSum(root);
        assertEquals(6, answer);
    }

    @Test
    public void test2(){

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();

        int answer = b.maxPathSum(root);
        assertEquals(42, answer);
    }

    @Test
    public void test3(){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();

        int answer = b.maxPathSum(root);
        assertEquals(54, answer);
    }

    @Test
    public void test4(){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();

        int answer = b.maxPathSum(root);
        assertEquals(3, answer);
    }


    
    
}
