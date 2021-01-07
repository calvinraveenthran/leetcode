package main.test;

import main.java.BTFromArray;
import main.java.BTFromArray.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BTFromArrayTest {

    @Test
    public void test1(){
        BTFromArray bt = new BTFromArray();
        int[] inorder = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] preorder = {8,4,2,1,3,6,5,7,12,10,9,11,14,13,15};



        TreeNode root = bt.buildTree(preorder, inorder);
        assertEquals(8, root.val);
        assertEquals(4, root.left.val);
        assertEquals(2, root.left.left.val);
        assertEquals(1, root.left.left.left.val);
        assertEquals(3, root.left.left.right.val);
        assertEquals(6, root.left.right.val);
        assertEquals(5, root.left.right.left.val);
        assertEquals(7, root.left.right.right.val);
        assertEquals(12, root.right.val);
        assertEquals(10, root.right.left.val);
        assertEquals(9, root.right.left.left.val);
        assertEquals(11, root.right.left.right.val);
        assertEquals(14, root.right.right.val);
        assertEquals(13, root.right.right.left.val);
        assertEquals(15, root.right.right.right.val);
    }

    @Test
    public void test2(){
        BTFromArray bt = new BTFromArray();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};



        TreeNode root = bt.buildTree(preorder, inorder);
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}
