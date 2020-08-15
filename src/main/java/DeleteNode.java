package main.java;


import java.util.ArrayList;

public class DeleteNode {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {

        ListNode node_iter = node;

        while(node_iter.next.next != null){
            node_iter.val=node_iter.next.val;
            node_iter = node_iter.next;
        }
        node_iter.val=node_iter.next.val;
        node_iter.next = null;
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
