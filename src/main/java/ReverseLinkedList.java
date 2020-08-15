package main.java;

import java.util.ArrayList;

public class ReverseLinkedList {

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {

        if(head == null)
            return null;

        ListNode front = head.next;
        ListNode current = head;
        ListNode previous = null;

        while(front != null) {

            current.next = previous;
            previous = current;
            current = front;
            front = front.next;
        }

        current.next = previous;
        return current;
    }

    public ListNode reverseList2(ListNode head) {

        if(head == null)
            return null;
        
        return reverseLinkedListRecursively(head, head, null);
    }

    public ListNode reverseLinkedListRecursively(ListNode head, ListNode current, ListNode previous) {

        if(current.next != null){
            head = reverseLinkedListRecursively(head, current.next, current);
        } else {
            head = current;
        }

        current.next = previous;
        return head;
    }

    public int[] returnArray(ListNode node) {

        ArrayList<Integer> result = new ArrayList<>();
        ListNode node_iter = node;

        while(node_iter != null) {
            result.add(node_iter.val);
            node_iter = node_iter.next;
        }

        int[] ret = new int[result.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
