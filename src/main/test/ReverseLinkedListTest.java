package main.test;
import main.java.ReverseLinkedList;
import main.java.ReverseLinkedList.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void test1(){

        ReverseLinkedList rll = new ReverseLinkedList();

        int[] value = {1,2,3,4,5};
        int[] answer = {5,4,3,2,1};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(rll.returnArray(head), value);
        head = rll.reverseList(head);
        assertArrayEquals(rll.returnArray(head), answer);
    }

    @Test
    public void test2(){

        ReverseLinkedList rll = new ReverseLinkedList();

        int[] value = {1,2,3,4,5};
        int[] answer = {5,4,3,2,1};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(rll.returnArray(head), value);
        head = rll.reverseList2(head);
        assertArrayEquals(rll.returnArray(head), answer);
    }





}
