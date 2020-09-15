package main.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ValidBST {

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

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> int_list = new ArrayList<>();
        buildArrayInOrderFromTree(root, int_list);

        if(int_list.size()<= 1)
            return true;

        Iterator<Integer> iter = int_list.iterator();
        Integer current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.compareTo(current) >= 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public void buildArrayInOrderFromTree(TreeNode node, ArrayList<Integer> int_list) {
        if (node == null) {
            return;
        }
        buildArrayInOrderFromTree(node.left, int_list);
        int_list.add(node.val);
        buildArrayInOrderFromTree(node.right, int_list);
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

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
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
