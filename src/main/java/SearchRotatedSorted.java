package main.java;

public class SearchRotatedSorted {
    public int searchMinPosition(int[] nums) {
        int start= 0, end = nums.length-1;

        while(start<end) {
            int mid = (start + end) / 2;

            if(nums[mid] > nums[nums.length-1]) {
                start = mid + 1;
            } else if (mid == 0 || nums[mid] < nums[mid -1]) {
                return mid;
            } else {
                end = mid -1;
            }
        }

        return start;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        while(start<=end) {
            int mid = (start + end)/2;

            if(nums[mid] == target)
                return mid;

            if(target > nums[mid])
                start = mid+1;
            else
                end= mid-1;
        }
        return -1;
    }

    public int searchRotatedSorted(int[] nums, int target) {
        int min = this.searchMinPosition(nums);
        if(nums[min] <= target  && target <= nums[nums.length -1])
            return this.binarySearch(nums, min, nums.length -1, target);
        else
            return this.binarySearch(nums,0, min-1, target);
    }
}
