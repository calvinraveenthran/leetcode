package main.java;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 1;
        List<List<Integer>> levelList = new ArrayList<>();
        buildList(levelList, level, root);
        return levelList;
    }

    public void buildList(List<List<Integer>> levelList, int level, TreeNode node) {

        if(node == null)
            return;

        if(levelList.size() < level) {
            List<Integer> newList = new ArrayList<>();
            levelList.add(newList);
        }

        List<Integer> listToAdd = levelList.get(level-1);
        listToAdd.add(node.val);

        buildList(levelList, level+1, node.left);
        buildList(levelList, level+1, node.right);
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
}
