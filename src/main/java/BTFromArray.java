package main.java;

public class BTFromArray {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int startIo = 0;
        int endIo = preorder.length-1;
        int startPo = 0;

            TreeNode root = constructSubtree(startIo,
                    endIo,
                    startPo,
                    preorder,
                    inorder);
            return root;
    }

    public TreeNode constructSubtree(int startIo,
                                     int endIo,
                                     int startPo,
                                     int[] preorder,
                                     int[] inorder){

        if(startIo > endIo){
            return null;
        }

        int i = startIo;
        for(; i <=endIo; i++){
            if(inorder[i] == preorder[startPo]){
                break;
            }
        }

        TreeNode current = new TreeNode(inorder[i]);
        current.left = constructSubtree(startIo, i-1, startPo+1, preorder, inorder);
        current.right = constructSubtree(i+1, endIo, i+1, preorder, inorder);

        return current;
    }

}
