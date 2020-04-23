package main.test;
import main.java.RemoveDuplicatesSorted;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveDuplicatedSortedTest {

    @Test
    public void demoveDuplicateSortedTest() {

        RemoveDuplicatesSorted removeDuplicateSorted = new RemoveDuplicatesSorted();
        int[] nums = {1,1,2,2,3,3,4,4,5};
        assertEquals(5, removeDuplicateSorted.removeDuplicateSorted(nums));
        int[] nums2 = {1,2};
        assertEquals(2, removeDuplicateSorted.removeDuplicateSorted(nums2));
    }

}
