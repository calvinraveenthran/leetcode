package main.java;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        if(nums.length ==0){
            return 1;
        }

        Arrays.sort(nums);

        int min = 1;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == min){
                min = min +1;
            }
        }

        return min;
    }
}
