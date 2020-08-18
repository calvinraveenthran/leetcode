package main.java;

import java.util.ArrayList;

public class PalindromeLinkedList {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode reverseHead = null, front = null, forward = head, reverse = null, iterator = head;
        int size = 0;


        while(iterator != null) {
            reverseHead = new ListNode(iterator.val, front);
            front = reverseHead;
            size++;
            iterator = iterator.next;
        }

        reverse = reverseHead;

        for(int i =0; i < size/2; i++) {
            if(forward.val != reverse.val) {
                return false;
            }

            forward = forward.next;
            reverse = reverse.next;
        }

        return true;
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
