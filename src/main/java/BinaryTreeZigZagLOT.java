package main.java;
import java.util.*;

public class BinaryTreeZigZagLOT {
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


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        solution(root, 0, answer);
        return answer;
    }


    public void solution(TreeNode current, int level, List<List<Integer>> answer) {

        if(current == null) {
            return;
        }

        if(answer.size() <= level) {
            int target = level + 1;
            while(answer.size() < target) {
                answer.add(new ArrayList<>());
            }
        }

        if(level % 2 == 1) {
            answer.get(level).add(0,current.val);
        } else {
            answer.get(level).add(current.val);
        }

        solution(current.left, level+1, answer);
        solution(current.right, level+1, answer);
    }

}
