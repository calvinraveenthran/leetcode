package main.test;
import main.java.ThreeSum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;


public class ThreeSumTest {

    @Test
    public void updateTwoSumTest1() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-4,-1,-1,0,1,2};
        List<List<Integer>> result = new ArrayList<>();
        threeSum.updateTwoSum(result, nums, 1, 0);
        List<List<Integer>> list = asList(
                asList( -1, 0, 1),
                asList( -1,-1, 2)
        );
        assertEquals(list.size(), result.size());
        assertEquals(list.get(0), result.get(0));
        assertEquals(list.get(1), result.get(1));
    }

    @Test
    public void updateTwoSumTest2() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-4,-1,-1,-1,-1,0,1,1,1,1,1,1,1,2};
        List<List<Integer>> result = new ArrayList<>();
        threeSum.updateTwoSum(result, nums, 1, 0);
        List<List<Integer>> list = asList(
                asList( -1, 0, 1),
                asList( -1,-1, 2)
        );
        assertEquals(list.size(), result.size());
        assertEquals(list.get(0), result.get(0));
        assertEquals(list.get(1), result.get(1));
    }

    @Test
    public void updateTwoSumTest3() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-2,-2,-2,-1,-1,-1,-1,0,0,0,1,1,1,1,1,1,1,2,2,2,2,2};
        List<List<Integer>> result = new ArrayList<>();
        threeSum.updateTwoSum(result, nums, 0, 0);
        List<List<Integer>> list = asList(
                asList( -2, 1, 1),
                asList(-2,0,2)
        );
        assertEquals(list.size(), result.size());
        assertEquals(list.get(0), result.get(0));
        assertEquals(list.get(1), result.get(1));

        result = new ArrayList<>();
        threeSum.updateTwoSum(result, nums, 3, 0);
        list = asList(
                asList(-1,0,1),
                asList( -1,-1, 2)
        );
        assertEquals(list.size(), result.size());
        assertEquals(list.get(0), result.get(0));
        assertEquals(list.get(1), result.get(1));
    }


    @Test
    public void updateThreeSumTest() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-2,-2,-2,-1,-1,-1,-1,0,0,0,1,1,1,1,1,1,1,2,2,2,2,2};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> list = asList(
                asList( -2, 1, 1),
                asList(-2,0,2),
                asList(-1,0,1),
                asList(-1,-1,2),
                asList(0,0,0)
        );
        assertEquals(list.size(), result.size());
    }
}
