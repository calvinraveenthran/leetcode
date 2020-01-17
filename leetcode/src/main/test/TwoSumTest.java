package main.test;
import main.java.TwoSum;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 22;
        int[] answer = {1,3};

        assertArrayEquals(twoSum.twoSum(nums, target), answer);
    }
}
