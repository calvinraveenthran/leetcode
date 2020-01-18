package main.java;

import java.util.*;

public class ThreeSum {

    public void updateTwoSum(List<List<Integer>> result, int[] nums, int i, int target) {

        int firstValue = nums[i];
        i = i + 1;
        int remainder = target - firstValue;
        HashSet<Integer> remainderSet = new HashSet<>();

        while(i < nums.length) {
            int twoSumRemainder = remainder - nums[i];
            if(remainderSet.contains(twoSumRemainder)) {
                List<Integer> solution = new ArrayList<>();
                solution.add(0, firstValue);
                solution.add(1, twoSumRemainder);
                solution.add(nums[i]);
                result.add(solution);

                int j = i;
                remainderSet.add(nums[i]);
                do {
                    i = i + 1;
                } while(i < nums.length && nums[j] == nums[i]);
                continue;
            }
            remainderSet.add(nums[i]);
            i = i + 1;
        }
    }


    public List<List<Integer>> threeSum(int[] nums) {

        int i = 0;
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        while(i < nums.length && nums[i] <= target) {
            this.updateTwoSum(result, nums, i, 0);
            int j = i;
            do {
                i = i + 1;
            } while(i < nums.length && nums[j] == nums[i]);
        }

        return result;
    }

}
