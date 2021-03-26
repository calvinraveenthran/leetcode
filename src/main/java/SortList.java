package main.java;

public class SortList {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode returnMiddle(ListNode head) {

        ListNode slow = head;
        ListNode behindSlow = null;
        ListNode fast = head;

        while(fast != null) {

            fast = fast.next;
            if(fast != null) {
                fast = fast.next;
            } else{
                break;
            }
            behindSlow = slow;
            slow = slow.next;
        }

        behindSlow.next = null;
        return slow;
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b){

        if(a == null) {
            return b;
        } else if (b == null) {
           return a;
        }

        ListNode start = null;
        ListNode end = null;

        if(a.val <= b.val) {
            start = a;
            a = a.next;
        } else {
            start = b;
            b = b.next;
        }

        start.next = null;
        end = start;

        while(a != null && b != null) {
            if(a.val <= b.val){
                    end.next = a;
                    a = a.next;
            } else {
                    end.next = b;
                    b = b.next;

            }
            end = end.next;
            end.next = null;
        }

        if(b == null) {
            end.next = a;
        } else {
            end.next = b;
        }

        return start;
    }

    public ListNode sortList(ListNode head) {

        if(head == null) {
            return null;
        } else if(head.next == null) {
            return head;
        }

        ListNode middle = returnMiddle(head);

        ListNode right = middle;
        ListNode left = head;


        ListNode a = sortList(left);
        ListNode b = sortList(right);

        return mergeTwoLists(a, b);
    }
}
