package main.java;

public class MaximumProductSubarray {

    public int maximumProductSubarray(int[] nums) {

        int currentMaxProduct = nums[0],
                currentMinProduct = nums[0],
                previousMaxProduct = nums[0],
                previousMinProduct = nums[0],
                ans = nums[0];

        for (int i = 1; i < nums.length; i = i + 1) {
            currentMaxProduct = Math.max(Math.max(previousMaxProduct * nums[i], previousMinProduct * nums[i]), nums[i]);
            currentMinProduct = Math.min(Math.min(previousMaxProduct * nums[i], previousMinProduct * nums[i]), nums[i]);
            ans = Math.max(currentMaxProduct, ans);
            previousMaxProduct = currentMaxProduct;
            previousMinProduct = currentMinProduct;
        }
        return ans;
    }
}
