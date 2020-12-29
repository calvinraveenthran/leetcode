package main.java;
import java.util.ArrayList;

public class AddTwoNumbers {

    static public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = null;
        ListNode lAp =  null;
        ListNode l1p = l1;
        ListNode l2p = l2;
        int carryover = 0;

        while(l1p != null && l2p !=null){
            int value = (l1p.val + l2p.val + carryover) % 10;
            carryover = (l1p.val + l2p.val + carryover) / 10;

            if(lAp==null){
                answer = new ListNode(value);
                lAp = answer;
            } else{
                lAp.next = new ListNode(value);
                lAp= lAp.next;
            }

            l1p = l1p.next;
            l2p = l2p.next;
        }

        ListNode it = l2p != null ? l2p : l1p;

        while(it != null) {
            int value = (it.val+ carryover) % 10;
            carryover = (it.val+ carryover) / 10;

            if(lAp==null){
                answer = new ListNode(value);
                lAp = answer;
            } else{
                lAp.next = new ListNode(value);
                lAp= lAp.next;
            }

            it = it.next;
        }

        if(carryover != 0){
            lAp.next = new ListNode(carryover);
        }

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
