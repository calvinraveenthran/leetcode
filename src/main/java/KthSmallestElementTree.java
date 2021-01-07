package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElementTree {

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

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode current = root;
        List<Integer> answer = new ArrayList<Integer>();


        while(current != null || !treeStack.isEmpty()){

            while(current != null){
                treeStack.push(current);
                current = current.left;
            }

            current = treeStack.pop();
            answer.add(current.val);
            if(answer.size() == k){
                return answer.get(answer.size() -1);
            }

            current = current.right;
        }

        return -1;
    }
}
