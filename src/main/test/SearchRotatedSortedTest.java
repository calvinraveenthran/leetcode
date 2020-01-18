package main.test;
import static org.junit.Assert.assertEquals;
import main.java.SearchRotatedSorted;
import org.junit.Test;

public class SearchRotatedSortedTest {

    @Test
    public void returnMinimumTest() {
        SearchRotatedSorted searchRotatedSorted = new SearchRotatedSorted();
        int[] nums = {5,6,7,8,9,10,1,2,3,4};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {0,1,2,4,5,6,7};
        int[] nums4 = {1,2,4,5,6,7,0};
        assertEquals(6, searchRotatedSorted.searchMinPosition(nums));
        assertEquals(4, searchRotatedSorted.searchMinPosition(nums2));
        assertEquals(0, searchRotatedSorted.searchMinPosition(nums3));
        assertEquals(6, searchRotatedSorted.searchMinPosition(nums4));
    }


    @Test
    public void binarySearchTest(){
        SearchRotatedSorted searchRotatedSorted = new SearchRotatedSorted();
        int[] nums = {5,6,7,8,9,10,1,2,3,4};
        assertEquals(9, searchRotatedSorted.binarySearch(nums, 6, 9, 4));
        assertEquals(6, searchRotatedSorted.binarySearch(nums, 6, 9, 1));
        assertEquals(8, searchRotatedSorted.binarySearch(nums, 6, 9, 3));
        assertEquals(-1, searchRotatedSorted.binarySearch(nums, 6, 9, 5));
        assertEquals(4, searchRotatedSorted.binarySearch(nums, 0, 5, 9));
    }

    @Test
    public void minimumRotatedArraySearchValueTest() {
        SearchRotatedSorted searchRotatedSorted = new SearchRotatedSorted();
        int[] nums = {4,5,6,7,0,1,2};
        assertEquals(0, searchRotatedSorted.searchRotatedSorted(nums, 4));
        assertEquals(1, searchRotatedSorted.searchRotatedSorted(nums, 5));
        assertEquals(2, searchRotatedSorted.searchRotatedSorted(nums, 6));
        assertEquals(3, searchRotatedSorted.searchRotatedSorted(nums, 7));
        assertEquals(4, searchRotatedSorted.searchRotatedSorted(nums, 0));
        assertEquals(5, searchRotatedSorted.searchRotatedSorted(nums, 1));
        assertEquals(6, searchRotatedSorted.searchRotatedSorted(nums, 2));
        assertEquals(-1, searchRotatedSorted.searchRotatedSorted(nums, 3));

        int[] nums2 = {0,1,2,4,5,6,7};
        assertEquals(0, searchRotatedSorted.searchRotatedSorted(nums2, 0));
        assertEquals(1, searchRotatedSorted.searchRotatedSorted(nums2, 1));
        assertEquals(2, searchRotatedSorted.searchRotatedSorted(nums2, 2));
        assertEquals(3, searchRotatedSorted.searchRotatedSorted(nums2, 4));
        assertEquals(4, searchRotatedSorted.searchRotatedSorted(nums2, 5));
        assertEquals(5, searchRotatedSorted.searchRotatedSorted(nums2, 6));
        assertEquals(6, searchRotatedSorted.searchRotatedSorted(nums2, 7));
        assertEquals(-1, searchRotatedSorted.searchRotatedSorted(nums2, 3));

        int[] nums3 = {1,2,4,5,6,7,0};
        assertEquals(6, searchRotatedSorted.searchRotatedSorted(nums3, 0));
        assertEquals(0, searchRotatedSorted.searchRotatedSorted(nums3, 1));
        assertEquals(1, searchRotatedSorted.searchRotatedSorted(nums3, 2));
        assertEquals(2, searchRotatedSorted.searchRotatedSorted(nums3, 4));
        assertEquals(3, searchRotatedSorted.searchRotatedSorted(nums3, 5));
        assertEquals(4, searchRotatedSorted.searchRotatedSorted(nums3, 6));
        assertEquals(5, searchRotatedSorted.searchRotatedSorted(nums3, 7));
        assertEquals(-1, searchRotatedSorted.searchRotatedSorted(nums3, 3));
    }
}
