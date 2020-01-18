package main.test;
import main.java.MinimumRotatedArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumRotatedArrayTest {

    @Test
    public void minimumRotatedArrayTest() {
        MinimumRotatedArray minimumRotatedArray = new MinimumRotatedArray();
        int[] nums = {3,4,5,1,2};
        assertEquals(1, minimumRotatedArray.minimumRotatedArray(nums));
        int[] nums2 = {4,5,6,7,0,1,2};
        assertEquals(0, minimumRotatedArray.minimumRotatedArray(nums2));
        int[] nums3 = {0,1,2,4,5,6,7};
        assertEquals(0, minimumRotatedArray.minimumRotatedArray(nums3));
        int[] nums4 = {1,2,4,5,6,7,0};
        assertEquals(0, minimumRotatedArray.minimumRotatedArray(nums3));
    }

    @Test
    public void minimumRotatedArray2Test() {
        MinimumRotatedArray minimumRotatedArray = new MinimumRotatedArray();
        int[] nums = {3,4,5,1,2};
        assertEquals(1, minimumRotatedArray.searchNoRecursion(nums));
        int[] nums2 = {4,5,6,7,0,1,2};
        assertEquals(0, minimumRotatedArray.searchNoRecursion(nums2));
        int[] nums3 = {0,1,2,4,5,6,7};
        assertEquals(0, minimumRotatedArray.searchNoRecursion(nums3));
        int[] nums4 = {1,2,4,5,6,7,0};
        assertEquals(0, minimumRotatedArray.searchNoRecursion(nums3));
    }
}
