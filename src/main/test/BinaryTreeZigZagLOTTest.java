package main.test;

import main.java.BinaryTreeZigZagLOT;
import main.java.BinaryTreeZigZagLOT.TreeNode;
import java.util.*;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeZigZagLOTTest {

    @Test
    public void test1(){
        BinaryTreeZigZagLOT bt = new BinaryTreeZigZagLOT();
        int[] expected0 = {1};
        int[] expected1 = {3,2};
        int[] expected2 = {4,5,6,7};
        int[] expected3 = {15,14,13,12,11,10,9,8};


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

        List<List<Integer>> answer = bt.zigzagLevelOrder(root);

        assertArrayEquals(expected0, answer.get(0).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected1, answer.get(1).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected2, answer.get(2).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected3, answer.get(3).stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void test2(){
        BinaryTreeZigZagLOT bt = new BinaryTreeZigZagLOT();
        int[] expected0 = {3};
        int[] expected1 = {20,9};
        int[] expected2 = {15,7};


        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> answer = bt.zigzagLevelOrder(root);

        assertArrayEquals(expected0, answer.get(0).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected1, answer.get(1).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(expected2, answer.get(2).stream().mapToInt(i -> i).toArray());
    }
}
