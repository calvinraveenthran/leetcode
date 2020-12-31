package main.test;
import main.java.OddEvenLinkedList;
import main.java.OddEvenLinkedList.ListNode;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class OddEvenLinkedListTest {

    @Test
    public void test1(){

        OddEvenLinkedList rll = new OddEvenLinkedList();

        int[] value = {1,2,3,4,5,6,7,8,9,10};
        int[] answer = {1,3,5,7,9,2,4,6,8,10};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(rll.returnArray(head), value);
        head = rll.oddEvenList(head);
        assertArrayEquals(rll.returnArray(head), answer);
    }

    @Test
    public void test2(){

        OddEvenLinkedList rll = new OddEvenLinkedList();

        int[] value = {1,2,3,4,5,6,7,8,9,10,11};
        int[] answer = {1,3,5,7,9,11,2,4,6,8,10};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(rll.returnArray(head), value);
        head = rll.oddEvenList(head);
        assertArrayEquals(rll.returnArray(head), answer);
    }

    @Test
    public void test3(){

        OddEvenLinkedList rll = new OddEvenLinkedList();

        int[] value = {1};
        int[] answer = {1};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(rll.returnArray(head), value);
        head = rll.oddEvenList(head);
        assertArrayEquals(rll.returnArray(head), answer);
    }
}
