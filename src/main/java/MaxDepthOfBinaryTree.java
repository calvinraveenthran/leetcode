package main.java;


import java.util.ArrayList;

public class MaxDepthOfBinaryTree {

    int max_depth = 0;

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

    public int maxDepth(TreeNode root) {

         TreeNode iterator = root;
         int depth = 0;

        recurMaxDepth(iterator, depth);

        return max_depth;
    }

    public void recurMaxDepth(TreeNode iterator, int cur_depth) {

         if(iterator == null)
             return;

        cur_depth = cur_depth + 1;

         if(cur_depth > max_depth) {
             max_depth = cur_depth;
         }

        recurMaxDepth(iterator.left, cur_depth);
        recurMaxDepth(iterator.right, cur_depth);
    }


    public TreeNode buildTreeFromArrayList(int[] treeAsArray, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(treeAsArray[mid]);
        node.left = buildTreeFromArrayList(treeAsArray, start, mid - 1);
        node.right = buildTreeFromArrayList(treeAsArray, mid + 1, end);
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
