package main.java;

public class SearchRange {

    public int[] searchRange(int[] nums, int target) {

        int left = getLeftSide(nums, target, 0, nums.length-1);
        int right = getRightSide(nums, target, 0, nums.length-1);
        int[] answer = {left, right};

        return answer;
    }

    public int getRightSide(int[] nums, int target, int start, int end) {
        while (start<= end) {
            int mid = start + ((end - start) /2);
            if((nums[mid] ==  target && mid == nums.length-1) ||
                    (nums[mid] ==  target && nums[mid+1] > target )) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int getLeftSide(int[] nums, int target, int start, int end) {
        while (start<= end) {
            int mid = start + ((end - start) /2);
            if((nums[mid] ==  target && mid == 0) ||
                    (nums[mid] ==  target && nums[mid-1] < target )) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
