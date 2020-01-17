package main.java;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueIndex = new HashMap<>();
        int[] answer = {0,0};
        int i = 0;

        while(i < nums.length) {
            Integer index = valueIndex.get(target - nums[i]);
            if(index != null) {
                answer[0] = index;
                answer[1] = i;
                break;
            } else {
                valueIndex.put(nums[i], i);
            }
            i = i+1;
        }
        return answer;
    }
}
