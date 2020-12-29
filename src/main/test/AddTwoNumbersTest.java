package main.test;

import main.java.AddTwoNumbers;
import main.java.AddTwoNumbers.ListNode;
import main.java.LinkedListCycle;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void test(){
        int[] value1 = {2,4,3};
        int[] value2 = {5,6,4};
        int[] answerArr = {7,0,8};

        ListNode l1 = new ListNode(2);
        ListNode node_iter = l1;

        for(int i = 1; i < value1.length; i++) {
            node_iter.next= new ListNode(value1[i]);
            node_iter = node_iter.next;
        }

        ListNode l2 = new ListNode(5);
        node_iter = l2;

        for(int i = 1; i < value2.length; i++) {
            node_iter.next= new ListNode(value2[i]);
            node_iter = node_iter.next;
        }

        AddTwoNumbers atn = new AddTwoNumbers();
        assertArrayEquals(atn.returnArray(atn.addTwoNumbers(l1, l2)), answerArr);
    }
}
