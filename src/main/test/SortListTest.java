package main.test;
import main.java.SortList.ListNode;
import main.java.SortList;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortListTest {

    @Test
    public void test1(){
        SortList s = new SortList();
        ListNode a = new ListNode(4);
        a.next = new ListNode(2);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(3,null);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4, null);



        ListNode expe_curr = expected;
        ListNode ans_curr = s.sortList(a);

        while(expe_curr != null) {
            assertEquals(expe_curr.val, ans_curr.val);
            expe_curr = expe_curr.next;
            ans_curr = ans_curr.next;
        }
    }

    @Test
    public void test2(){
        SortList s = new SortList();
        ListNode a = new ListNode(-1);
        a.next = new ListNode(5);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(0, null);

        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5, null);


        ListNode expe_curr = expected;
        ListNode ans_curr = s.sortList(a);

        while(expe_curr != null) {
            assertEquals(expe_curr.val, ans_curr.val);
            expe_curr = expe_curr.next;
            ans_curr = ans_curr.next;
        }
    }


}
