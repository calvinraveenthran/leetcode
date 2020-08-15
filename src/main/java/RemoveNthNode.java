package main.java;
import java.util.ArrayList;

public class RemoveNthNode {

    public static class ListNode {
      public int val;
      public ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node_iter_lead = head;
        ListNode delete = head;

        for(int i = 1; i < n; i++){
            node_iter_lead = node_iter_lead.next;
        }

        while(node_iter_lead.next != null) {
            delete = delete.next;
            node_iter_lead = node_iter_lead.next;
        }

        return deleteNode(head, delete);
    }

    public ListNode deleteNode(ListNode head, ListNode node) {

        ListNode node_iter = head;

        if(head.equals(node)) {
            return head.next;
        }

        while(node_iter.next != node){
            node_iter = node_iter.next;
        }

        node_iter.next=node.next;
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
