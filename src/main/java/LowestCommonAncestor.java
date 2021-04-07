package main.java;

import java.util.*;

public class LowestCommonAncestor {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public boolean binarySearchTree(TreeNode current, TreeNode target, Stack<TreeNode> parents) {

        if(current == null) {
            return false;
        }

        if(current == target) {
            parents.push(current);
            return true;
        }


        boolean find = binarySearchTree(current.left, target, parents);
        if(find){
            parents.push(current);
            return true;
        }
        find = binarySearchTree(current.right, target, parents);
        if(find){
            parents.push(current);
            return true;
        }

        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> sP = new Stack<>();
        Stack<TreeNode> sQ = new Stack<>();

        binarySearchTree(root, p, sP);
        binarySearchTree(root, q, sQ);

        int length = Math.min(sP.size(), sQ.size());

        for(int i = 0; i < length; i++){
             TreeNode p1 = sP.pop();
             TreeNode q1 = sQ.pop();

             if(sP.isEmpty() || sQ.isEmpty() ||  sP.peek() != sQ.peek()){
                 return p1;
             }
        }
        return null;
    }

}
