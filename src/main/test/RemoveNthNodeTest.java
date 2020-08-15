package main.test;
import main.java.RemoveNthNode;
import main.java.RemoveNthNode.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveNthNodeTest {

    @Test
    public void test1(){

        RemoveNthNode dn = new RemoveNthNode();

        int[] value = {1,2,3,4,5};
        int[] answer = {1,2,3,5};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(dn.returnArray(head), value);
        head = dn.removeNthFromEnd(head, 2);
        assertArrayEquals(dn.returnArray(head), answer);
    }
}
