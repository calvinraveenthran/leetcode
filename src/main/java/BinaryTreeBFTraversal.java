package main.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class BinaryTreeBFTraversal {

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

    public List<Integer> bfTraversalIterative(TreeNode root) {

        Queue<TreeNode> treeQueue = new LinkedList<>();
        TreeNode current = null;
        List<Integer> answer = new ArrayList<Integer>();


        treeQueue.add(root);

        while(!treeQueue.isEmpty()){
            current = treeQueue.remove();
            answer.add(current.val);

            if(current.left != null){
                treeQueue.add(current.left);
            }

            if(current.right != null){
                treeQueue.add(current.right);
            }
        }

        return answer;
    }
}
