package main.java;

public class PopulateNextRightPointer {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        populateNextRightPointer(root, null);
        return root;
    }

    public void populateNextRightPointer(Node current, Node rightPointer){

        if(current == null){
            return;
        }

        current.next = rightPointer;

        populateNextRightPointer(current.left, current.right);
        populateNextRightPointer(current.right, rightPointer !=null ? rightPointer.left : null);
    }
}
