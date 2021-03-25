package main.test;
import main.java.MergeKLists;
import main.java.MergeKLists.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeKListsTest {

    @Test
    public void test1() {
        MergeKLists m = new MergeKLists();

        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(5, null);

        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4, null);

        ListNode c = new ListNode(2);
        c.next = new ListNode(6, null);

        ListNode[] lists = {a, b, c};

        ListNode answer = m.mergeKLists(lists);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next.next = new ListNode(5);
        expected.next.next.next.next.next.next.next = new ListNode(6);


        ListNode expe_curr = expected;
        ListNode ans_curr = answer;

        while(expe_curr != null) {
            assertEquals(expe_curr.val, ans_curr.val);
            expe_curr = expe_curr.next;
            ans_curr = ans_curr.next;
        }


    }
}
