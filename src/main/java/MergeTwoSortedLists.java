package main.java;

import java.util.ArrayList;

public class MergeTwoSortedLists {

    public static class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null)
            return null;

        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode iter1 = l1, iter2 = l2, answer = null, answer_iter = null, next = null;

        while(iter1 != null && iter2 != null) {
            if(iter1.val < iter2.val) {
                next = iter1;
                iter1 = iter1.next;
            } else {
                next = iter2;
                iter2 = iter2.next;
            }

            if(answer == null) {
                answer = next;
                answer_iter = next;
            } else {
                answer_iter.next = next;
                answer_iter = answer_iter.next;
            }
        }

        if(iter2 == null)
            next = iter1;
        else
            next = iter2;
        answer_iter.next = next;

        return answer;
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
