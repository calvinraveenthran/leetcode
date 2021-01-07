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

    static int startPo;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int startIo = 0;
        int endIo = preorder.length-1;
        startPo = 0;

            TreeNode root = constructSubtree(startIo,
                    endIo,
                    preorder,
                    inorder);
            return root;
    }

    public TreeNode constructSubtree(int startIo,
                                     int endIo,
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
        startPo=startPo+1;
        current.left = constructSubtree(startIo, i-1, preorder, inorder);
        current.right = constructSubtree(i+1, endIo, preorder, inorder);

        return current;
    }

}
