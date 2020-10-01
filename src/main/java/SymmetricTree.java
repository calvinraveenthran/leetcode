package main.java;

import java.util.ArrayList;

public class SymmetricTree {

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

    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> int_list = new ArrayList<>();

        return checkSyemmetry(root, root);
    }

    public boolean checkSyemmetry(TreeNode inOrderNode, TreeNode reverseOrderNode) {

        if(inOrderNode == null && reverseOrderNode == null) {
            return true;
        }

        if( (inOrderNode == null && reverseOrderNode != null) ||
                (inOrderNode != null && reverseOrderNode == null) ) {
            return false;
        }

        if(inOrderNode.val != reverseOrderNode.val) {
            return false;
        }

        if(!checkSyemmetry(inOrderNode.left, reverseOrderNode.right)) {
            return false;
        }

        if(!checkSyemmetry(inOrderNode.right, reverseOrderNode.left)) {
            return false;
        }

        return true;
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

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}
