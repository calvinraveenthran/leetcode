package main.java;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {

        if(nums.length ==0){
            return 0;
        }

        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int current_max = 1;

        for(int j =0; j< nums.length; j++) {
            for(int i=0; i <j; i++) {
                if(nums[i] < nums[j]) {
                    answer[j] = Math.max(answer[j], answer[i] +1);
                    if(answer[j] > current_max) {
                        current_max = answer[j];
                    }
                }
            }
        }

        return current_max;
    }
}
