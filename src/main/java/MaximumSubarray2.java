package main.java;

public class MaximumSubarray2 {

    public int maxSubArray(int[] nums) {
        return divideAndConquer(nums, 0, nums.length-1);
    }

    public int maxCenter(int[] nums, int s, int sm, int em, int e) {

        int lmax = Integer.MIN_VALUE;
        int lsum = 0;
        for(int i = sm; i >= s; i--) {
            lsum += nums[i];

            if(lsum >lmax) {
                lmax = lsum;
            }
        }

        int rmax = Integer.MIN_VALUE;
        int rsum = 0;
        for(int j = em; j <= e; j++) {
            rsum += nums[j];

            if(rsum >rmax) {
                rmax = rsum;
            }
        }

        return lmax + rmax;
    }

    public int divideAndConquer(int[] nums, int s, int e) {

        if(s == e){
            return nums[s];
        }

        int mid = s + ((e -s) /2);
        int mL = divideAndConquer(nums, s, mid);
        int mR = divideAndConquer(nums, mid+1, e);
        int mC = maxCenter(nums, s, mid, mid+1, e);

        return Math.max(Math.max(mL, mR), mC);
    }
}
