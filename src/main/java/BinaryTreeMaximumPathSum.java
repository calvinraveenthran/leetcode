package main.java;

public class BinaryTreeMaximumPathSum {

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

    public int maxPathSum(TreeNode root) {
        // 0=maxValue, 1=currentValue, 2=isLocal
        int[] record = {Integer.MIN_VALUE, 0};
        int[] answer = countSubTree(root, record);
        return answer[0];
    }

    public int[] countSubTree(TreeNode current, int[] record) {

        if(current == null) {
            return new int[]{};
        }

        int[] val = {record[0], record[1]};

        int[] valLeft =  countSubTree(current.left, val);

        int[] valRight = countSubTree(current.right, val);

        int currLeft = valLeft.length == 0 ? current.val : valLeft[1] + current.val;
        int currRight = valRight.length == 0 ? current.val  : valRight[1]+ current.val ;

        int currentSum = Math.max(Math.max(currLeft, currRight), current.val);
        int maxVal = Math.max(record[0], Math.max(currentSum, currLeft + currRight - current.val));

        if(valLeft.length != 0) {
            maxVal = Math.max(maxVal, valLeft[0]);
        }

        if(valRight.length != 0) {
            maxVal = Math.max(maxVal, valRight[0]);
        }

        return new int[]{maxVal, currentSum};
    }
}
