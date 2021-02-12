package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class SerDesTree {

    int startPo;

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class TreeNodeStr {
        public String val;
        public TreeNodeStr left;
        public TreeNodeStr right;

        public TreeNodeStr(String val, TreeNodeStr left, TreeNodeStr right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNodeStr copy(TreeNode current, HashMap<Integer, Integer> occurence){
        TreeNodeStr left = null;
        TreeNodeStr right = null;

        if(current.left !=null){
            left = copy(current.left, occurence);
        }
        if(current.right !=null) {
            right = copy(current.right, occurence);
        }

        int count = occurence.get(current.val) != null ? occurence.get(current.val) + 1 : 1;
        occurence.put(current.val, count);
        return new TreeNodeStr(current.val +"^"+ count, left, right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null){
            return null;
        }

        HashMap<Integer, Integer> occurence = new HashMap<>();
        TreeNodeStr rootStr = copy(root, occurence);


        StringBuilder answer = new StringBuilder();
        TreeNodeStr current = rootStr;
        Stack<TreeNodeStr> stack = new Stack<>();

        //In Order
        while(current !=null || !stack.isEmpty()){
            while(current !=null){
                stack.add(current);
                current = current.left;
            }

            current = stack.pop();
            answer.append(current.val);
            answer.append(",");
            current = current.right;
        }

        current = rootStr;
        stack.clear();

        // Pre Order
        while(current !=null || !stack.isEmpty()){

            while(current !=null){
                answer.append(current.val);
                answer.append(",");
                stack.add(current);
                current = current.left;
            }

            current = stack.pop();
            current = current.right;
        }

        return answer.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if(data == null) {
            return null;
        }
        String[] arrSplit = data.split(",");

        String[] inOrder = new String[arrSplit.length/2];
        String[] preOrder = new String[arrSplit.length/2];

        System.arraycopy(arrSplit, 0, inOrder, 0, inOrder.length);
        System.arraycopy(arrSplit, preOrder.length, preOrder, 0, preOrder.length);
        return buildTree(0, inOrder.length -1, preOrder, inOrder);
    }

    public TreeNode buildTree(int startIo, int endIo, String[] preorder,String[] inorder){

        if(startIo > endIo){
            return null;
        }

        int i = startIo;
        for(; i <=endIo; i++){
            if(inorder[i].equals(preorder[startPo])){
                break;
            }
        }

        TreeNode current = new TreeNode(Integer.parseInt(inorder[i].substring(0, inorder[i].indexOf('^'))));
        startPo=startPo+1;
        current.left = buildTree(startIo, i-1, preorder, inorder);
        current.right = buildTree(i+1, endIo, preorder, inorder);

        return current;
    }
}
