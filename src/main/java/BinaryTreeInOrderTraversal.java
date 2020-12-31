package main.java;
import java.util.*;

public class BinaryTreeInOrderTraversal {

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

    public List<Integer> inorderTraversalIterative(TreeNode root) {

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

            current = current.right;
        }

        return answer;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root) {

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
        answer.add(current.val);
        appendToList(current.right,  answer);
    }
}
