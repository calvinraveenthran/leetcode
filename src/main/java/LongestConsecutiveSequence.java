package main.java;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        int max = 1;

        Arrays.sort(nums);

        int localMax = 1;

        for(int i =1 ; i < nums.length; i++){

            if(nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i] - nums[i-1] == 1) {
                localMax = localMax + 1;
                continue;
            }

            if(localMax > max) {
                max = localMax;
            }

            localMax = 1;
        }

        if (localMax > max){
            return localMax;
        }
        return max;
    }
}
