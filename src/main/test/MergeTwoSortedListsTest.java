package main.test;
import main.java.MergeTwoSortedLists;
import main.java.MergeTwoSortedLists.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    
    
    @Test
    public void test1() {

        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        int[] first_array = {1,3,5,7,9};
        ListNode first = new ListNode(first_array[0]);
        ListNode node_iter = first;

        for(int i = 1; i < first_array.length; i++) {
            node_iter.next= new ListNode(first_array[i]);
            node_iter = node_iter.next;
        }

        int[] second_array = {2,4,6,8,10};
        ListNode second = new ListNode(second_array[0]);
        node_iter = second;

        for(int i = 1; i < second_array.length; i++) {
            node_iter.next= new ListNode(second_array[i]);
            node_iter = node_iter.next;
        }

        int[] final_array = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(mtsl.returnArray(first), first_array);
        assertArrayEquals(mtsl.returnArray(second), second_array);

        ListNode answer = mtsl.mergeTwoLists(first, second);

        assertArrayEquals(mtsl.returnArray(answer), final_array);
    }


    @Test
    public void test2() {

        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        int[] first_array = {1,2,3,4,5};
        ListNode first = new ListNode(first_array[0]);
        ListNode node_iter = first;

        for(int i = 1; i < first_array.length; i++) {
            node_iter.next= new ListNode(first_array[i]);
            node_iter = node_iter.next;
        }

        int[] second_array = {6,7,8,9,10};
        ListNode second = new ListNode(second_array[0]);
        node_iter = second;

        for(int i = 1; i < second_array.length; i++) {
            node_iter.next= new ListNode(second_array[i]);
            node_iter = node_iter.next;
        }

        int[] final_array = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(mtsl.returnArray(first), first_array);
        assertArrayEquals(mtsl.returnArray(second), second_array);

        ListNode answer = mtsl.mergeTwoLists(first, second);

        assertArrayEquals(mtsl.returnArray(answer), final_array);
    }

    @Test
    public void test3() {

        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        int[] first_array = {1,2,3,4,5,6,7,8,9,10};
        ListNode first = new ListNode(first_array[0]);
        ListNode node_iter = first;

        for(int i = 1; i < first_array.length; i++) {
            node_iter.next= new ListNode(first_array[i]);
            node_iter = node_iter.next;
        }

        int[] final_array = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(mtsl.returnArray(first), first_array);

        ListNode answer = mtsl.mergeTwoLists(first, null);

        assertArrayEquals(mtsl.returnArray(answer), final_array);
    }
}
