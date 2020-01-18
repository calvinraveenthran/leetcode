package main.java;

public class MaximumSubarray {

    public int maximumSubarray(int [] nums) {
        int i =0, max = nums[0], sum = 0;

        while(i < nums.length) {
            sum = sum + nums[i];

            if (sum < nums[i]) {
                sum = nums[i];
            }

            if(sum > max) {
                max = sum;
            }

            i = i + 1;
        }
        return max;
    }
}
