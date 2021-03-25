package main.java;

import java.util.*;

public class MergeKLists {

    public static class ListNode {
          public int val;
          public ListNode next;
          public ListNode() {}
          public ListNode(int val) { this.val = val; }
          public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class ListNodeComparator implements Comparator<ListNode> {
        public int compare(ListNode a, ListNode b) {
            if (a.val > b.val)
                return 1;
            else if (a.val < b.val)
                return -1;
            return 0;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0) {
            return null;
        }

        if(lists.length == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> heap = new PriorityQueue<>(lists.length, new ListNodeComparator());
        List<ListNode> al = Arrays.asList(lists);

        for(ListNode a : lists) {
            if(a != null){
                heap.add(a);
            }
        }
        
        ListNode head = null;
        ListNode current = null;

        while(!heap.isEmpty()){

            if(head == null) {
                head = heap.poll();
                current = head;
            } else {
                current.next = heap.poll();
                current = current.next;
            }

            if(current.next != null) {
                heap.add(current.next);
            }
        }

        return head;
    }

}
