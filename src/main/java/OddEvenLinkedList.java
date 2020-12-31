package main.java;

import java.util.ArrayList;

public class OddEvenLinkedList {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode evenArray = head.next;
        ListNode eap = evenArray;

        ListNode oddArray = head;
        ListNode oap = oddArray;


        while(eap.next != null && oap.next != null) {
            oap.next = eap.next;
            oap = oap.next;

            if(oap.next != null) {
                eap.next = oap.next;
                eap = eap.next;
            }
        }

        if(eap.next == oap) {
            eap.next = null;
        }

        oap.next = evenArray;

        return oddArray;
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
