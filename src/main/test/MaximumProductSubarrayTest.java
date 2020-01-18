package main.test;
import main.java.MaximumProductSubarray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    public void maximumSubarrayTest() {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        int[] nums = {2,3,-2,4};
        assertEquals(6, maximumProductSubarray.maximumProductSubarray(nums));
    }
}
