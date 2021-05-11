package main.test;
import main.java.MaximumSubarray2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarray2Test {

    @Test
    public void maximumSubarrayTest() {
        MaximumSubarray2 maximumSubarray = new MaximumSubarray2();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));
    }
}
