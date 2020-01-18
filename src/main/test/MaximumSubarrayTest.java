package main.test;
import main.java.MaximumSubarray;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void maximumSubarrayTest() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, maximumSubarray.maximumSubarray(nums));
    }
}
