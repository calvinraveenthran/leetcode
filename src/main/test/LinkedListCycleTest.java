package main.test;

import main.java.LinkedListCycle;
import main.java.LinkedListCycle.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void test1(){

        LinkedListCycle llc  = new LinkedListCycle();

        int[] value = {1,2,3,4,5,6,7,8,9,10,11,12};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(llc.returnArray(head), value);
        node_iter.next = head;
        assertTrue(llc.hasCycle(head));
    }
}
