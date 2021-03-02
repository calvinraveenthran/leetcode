package main.java;

import java.util.Arrays;

public class MajorityElement {


    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int cur_dig = nums[0];
        int count = 1;
        int majority = nums[0];

        for(int i = 1 ; i < nums.length; i++){

            if(cur_dig == nums[i]){
                count++;
                if(count > (nums.length/2)) {
                    majority = cur_dig;
                    break;
                }
            } else{
                cur_dig = nums[i];
                count = 1;
            }
        }
        return majority;
    }

}
