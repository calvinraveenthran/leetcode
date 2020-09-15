package main.test;
import main.java.MaxDepthOfBinaryTree;
import main.java.MaxDepthOfBinaryTree.TreeNode;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class MaxDepthOfBinaryTreeTest {

    @Test
    public void test1(){
        MaxDepthOfBinaryTree mdbt = new MaxDepthOfBinaryTree();
        int[] int_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        TreeNode node = mdbt.buildTreeFromArrayList(int_array, 0, 15);
        mdbt.inOrder(node);
        assertEquals(mdbt.maxDepth(node), 5);
    }
}
