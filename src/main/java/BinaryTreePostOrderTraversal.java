package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {

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

    public List<Integer> postorderTraversalIterative(TreeNode root) {

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode current = root;
        List<Integer> answer = new ArrayList<Integer>();


        while(current != null || !treeStack.isEmpty()){

            if(current != null){
                if(current.right != null){
                    treeStack.push(current.right);
                }
                treeStack.push(current);
                current = current.left;
            } else {
                current = treeStack.pop();
                if(current.right != null && !treeStack.isEmpty() &&current.right == treeStack.peek()){
                    TreeNode parent = current;
                    current = treeStack.pop();
                    treeStack.push(parent);
                } else{
                    answer.add(current.val);
                    current = null;
                }
            }
        }

        return answer;
    }

    public List<Integer> postorderTraversalIterative2(TreeNode root){

        Stack<TreeNode> treeStack = new Stack<>();
        Stack<TreeNode> treeStack2 = new Stack<>();
        TreeNode current = root;
        List<Integer> answer = new ArrayList<Integer>();

        treeStack.push(current);

        while(!treeStack.isEmpty()) {
            current = treeStack.pop();

            treeStack2.push(current);

            if(current.left != null){
                treeStack.push(current.left);
            }

            if(current.right != null){
                treeStack.push(current.right);
            }

        }

        while(!treeStack2.isEmpty()) {
            current = treeStack2.pop();
            answer.add(current.val);
        }

        return answer;

    }

    public List<Integer> postorderTraversalRecursive(TreeNode root) {

        List<Integer> answer = new ArrayList<Integer>();
        TreeNode current = root;

        appendToList(current, answer);

        return answer;
    }

    public void appendToList(TreeNode current, List<Integer> answer) {

        if(current == null){
            return;
        }

        appendToList(current.left,  answer);
        appendToList(current.right,  answer);
        answer.add(current.val);
    }
}
