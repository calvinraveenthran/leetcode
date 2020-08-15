package main.test;
import main.java.DeleteNode;
import main.java.DeleteNode.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteNodeTest {

    @Test
    public void test1(){

        DeleteNode dn = new DeleteNode();

        int[] value = {1,2,3,4,5};
        int[] answer = {2,3,4,5};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(dn.returnArray(head), value);
        dn.deleteNode(head);
        assertArrayEquals(dn.returnArray(head), answer);


    }




}
