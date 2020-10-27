package main.java;

public class HouseRobber {

    public int rob(int[] nums) {

        int [] w_n_wo = new int [nums.length];

        if(nums.length == 0)
            return 0;

        if(nums.length == 1)
            return nums[0];

        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        w_n_wo[0] = nums[0];
        w_n_wo[1] = nums[1];
        w_n_wo[2] = Math.max(w_n_wo[1], w_n_wo[0] + nums[2]);


        for(int i = 3; i < nums.length; i = i +1) {
            w_n_wo[i] = Math.max(Math.max(w_n_wo[i-1], w_n_wo[i-2] + nums[i]), w_n_wo[i-3] + nums[i]);
        }

        return w_n_wo[nums.length-1];
    }
}
