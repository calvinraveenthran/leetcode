package main.test;
import main.java.PalindromeLinkedList;
import main.java.PalindromeLinkedList.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalindromeLinkedListTest {

    @Test
    public void test1(){

        PalindromeLinkedList pll  = new PalindromeLinkedList();

        int[] value = {1,2,3,4,5,4,3,2,1};
        ListNode head = new ListNode(1);
        ListNode node_iter = head;

        for(int i = 1; i < value.length; i++) {
            node_iter.next= new ListNode(value[i]);
            node_iter = node_iter.next;
        }
        assertArrayEquals(pll.returnArray(head), value);
        assertTrue(pll.isPalindrome(head));
    }





}
