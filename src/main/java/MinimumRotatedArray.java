package main.java;

public class MinimumRotatedArray {

    public int search(int[] nums, int st, int en) {

        if(st == en)
            return nums[st];

        int mid = (st + en) / 2;

        if (nums[mid] > nums[nums.length-1]) {
            return search(nums, mid +1, en);
        }

        if(mid == 0 || nums[mid] < nums[mid-1]) {
            return nums[mid];
        }

        return search(nums, st, mid -1);
    }

    public int searchNoRecursion(int[] nums) {
        int start= 0, end = nums.length-1;

        while(start<end) {
            int mid = (start + end) / 2;

            if(nums[mid] > nums[nums.length-1]) {
                start = mid + 1;
            } else if (mid == 0 || nums[mid] < nums[mid -1]) {
                return nums[mid];
            } else {
                end = mid -1;
            }
        }

        return nums[start];
    }

    public int minimumRotatedArray(int[] nums) {
        return this.search(nums, 0, nums.length-1);
    }
}
