package main.java;

public class IntersectionOfTwoLinkedLists {

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int headALength = 0;
        ListNode headAP = headA;

        while(headAP != null){
            headALength++;
            headAP = headAP.next;
        }
        headAP = headA;

        int headBLength = 0;
        ListNode headBP = headB;

        while(headBP != null){
            headBLength++;
            headBP = headBP.next;
        }
        headBP = headB;

        if(headALength > headBLength) {
            for(int i = headALength - headBLength; i > 0; i--){
                headAP = headAP.next;
            }
        }

        if(headBLength > headALength) {
            for(int i = headBLength - headALength; i > 0; i--){
                headBP = headBP.next;
            }
        }

        while(headAP != null && headBP != null){
            if(headAP == headBP) {
                return headAP;
            }

            headAP = headAP.next;
            headBP = headBP.next;
        }

        return null;
    }
}
