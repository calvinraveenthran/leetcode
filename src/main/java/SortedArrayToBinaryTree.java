package main.java;

import java.util.ArrayList;

public class SortedArrayToBinaryTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTreeFromArray(nums, 0, nums.length -1);
    }

    public TreeNode buildTreeFromArray(int[] treeAsArray, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(treeAsArray[mid]);
        node.left = buildTreeFromArray(treeAsArray, start, mid - 1);
        node.right = buildTreeFromArray(treeAsArray, mid + 1, end);
        return node;
    }

    public void inOrder(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null) {
            return;
        }
        inOrder(node.left, arrayList);
        arrayList.add(node.val);
        inOrder(node.right, arrayList);
    }
}
