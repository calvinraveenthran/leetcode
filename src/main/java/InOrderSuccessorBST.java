package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderSuccessorBST {

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

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode current = root;
        List<TreeNode> answer = new ArrayList<>();


        while(current != null || !treeStack.isEmpty()){

            while(current != null){
                treeStack.push(current);
                current = current.left;
            }

            current = treeStack.pop();
            if(!answer.isEmpty() && answer.get(answer.size()-1)==p){
                return current;
            }
            answer.add(current);
            current = current.right;
        }

        return null;
    }
}
