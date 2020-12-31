package main.test;

import main.java.IntersectionOfTwoLinkedLists;
import main.java.IntersectionOfTwoLinkedLists.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void test1(){

        IntersectionOfTwoLinkedLists rll = new IntersectionOfTwoLinkedLists();

        int[] first = {1,9,1,2,4};
        int[] second = {3,2,4};
        ListNode headFirst = new ListNode(1);
        ListNode node_iter_first = headFirst;
        ListNode headSecond = new ListNode(3);
        ListNode node_iter_second = headSecond;

        for(int i = 1; i < first.length; i++) {
            node_iter_first.next= new ListNode(first[i]);
            node_iter_first = node_iter_first.next;
        }

        for(int i = 1; i < second.length; i++) {
            node_iter_second.next= new ListNode(second[i]);
            node_iter_second = node_iter_second.next;
        }


        headFirst.next.next.next = headSecond.next;

        ListNode answer = rll.getIntersectionNode(headFirst, headSecond);
        assertEquals(headSecond.next, answer);
    }
}
