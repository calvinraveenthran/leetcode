package main.java;
import java.util.*;

public class CopyListRandomPointer {

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Node ansHead = null;
        Node firP = head;
        Node secP = null;
        HashMap<Node, Node> nodeMap = new HashMap<>();

        while(firP != null){
            if(ansHead == null) {
                ansHead = new Node(firP.val);
                secP = ansHead;
            } else {
                secP.next = new Node(firP.val);
                secP = secP.next;
                secP.next = null;
                secP.random = null;
            }

            nodeMap.put(firP, secP);
            firP = firP.next;
        }

        firP = head;
        secP = ansHead;

        while(firP != null) {
            if(firP.random != null) {
                secP.random = nodeMap.get(firP.random);
            }
            firP = firP.next;
            secP = secP.next;
        }

        return ansHead;
    }
}
