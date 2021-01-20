package main.java;

public class SearchRotatedSortedArray {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        if(nums[0] <= nums[nums.length -1])
            return 0;

        while(start <= end) {

            int mid = start + ((end - start) /2);
            if(mid != 0 && nums[mid] < nums[mid-1]) {
                return mid;
            }
            if(nums[mid] > nums[end]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {

        while(start <= end) {

            int mid = start + ((end - start) /2);
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int min = this.findMin(nums);
        if(nums[min] <= target  && target <= nums[nums.length -1])
            return this.binarySearch(nums, target, min, nums.length -1);
        else if (min != 0 && nums[0] <= target  && target <= nums[min-1])
            return this.binarySearch(nums,target, 0, min-1);
        else
            return -1;
    }
}
