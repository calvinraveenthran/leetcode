package main.java;

import java.util.Arrays;

public class FindDuplicate {

    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        if(nums.length == 2) {
            return nums[0];
        }

        int answer = nums[0];

        for(int i = 1; i <= nums.length-2; i ++){
            if(nums[i] == nums[i-1] || nums[i] == nums[i+1]){
                answer = nums[i];
            }
        }

        return answer;
    }
}
