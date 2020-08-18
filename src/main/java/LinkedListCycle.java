package main.java;

import java.util.ArrayList;

public class LinkedListCycle {

    static public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode tortoise = head, hare = head;


        while(hare != null && hare.next != null) {

            hare = hare.next.next;
            tortoise = tortoise.next;

            if(hare == tortoise) {
                return true;
            }
        }

        return false;
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
