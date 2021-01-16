package main.java;

public class FindPeakElem {
    public int findPeakElement(int[] nums) {

        if(nums.length == 1 || nums[0] > nums[1])
            return 0;

        if(nums[nums.length-1] > nums[nums.length-2])
            return nums.length-1;

        int answer = 0;
        for(int i = 1 ; i < nums.length-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
