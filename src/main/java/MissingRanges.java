package main.java;
import java.util.*;

public class MissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> answer = new ArrayList<>();

        if(nums.length ==0 ){
            if(upper == lower) {
                answer.add(String.format("%d",upper));
            } else if(upper - lower > 0){
                answer.add(String.format("%d->%d",lower, upper));
            }
            return answer;
        }

        if(nums[0] - lower == 1) {
            answer.add(String.format("%d",lower));
        } else if(nums[0] - lower > 1){
            answer.add(String.format("%d->%d",lower, nums[0]-1));
        }

        for(int i =1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] == 2){
                answer.add(String.format("%d",nums[i]-1));
            } else if(nums[i] - nums[i-1] >2) {
                answer.add(String.format("%d->%d",nums[i-1]+1, nums[i]-1));
            }
        }

        if(nums[nums.length -1] == upper) {
            return answer;
        }

        if(upper - nums[nums.length -1] == 1) {
            answer.add(String.format("%d",upper));
        } else if(upper - nums[nums.length -1] > 1){
            answer.add(String.format("%d->%d",nums[nums.length -1] +1, upper));
        }

        return answer;
    }
}
