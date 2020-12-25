package main.java;
import java.util.*;

public class ThreeSum2 {

    public void appendToList(int start, int[] nums,
                             List<List<Integer>> result,
                             int target,
                             HashMap<Integer, Integer> valuePos) {

        int firstRemainder = target - nums[start];
        int next = start + 1;

        while(next < nums.length -1) {
            int secondRemainder = firstRemainder - nums[next];

            if(secondRemainder < nums[next]) {
                break;
            }

            Integer thirdPos = valuePos.get(secondRemainder);
            if(thirdPos != null && thirdPos > next) {
                ArrayList<Integer> answer = new ArrayList<>();
                answer.add(nums[start]);
                answer.add(nums[next]);
                answer.add(nums[thirdPos]);
                result.add(answer);
            }

            int previous = next;
            do{
                next++;
            } while (nums[next] == nums[previous] && next < nums.length -1);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> valuePos = new HashMap<Integer, Integer>();
        int start = 0;
        int target = 0;

        for(int i =0; i < nums.length; i ++){
            valuePos.put(nums[i], i);
        }


        while(start < nums.length -2 && nums[start] <= target){
            appendToList(start, nums, result, target, valuePos);
            int previous = start;
            do{
                start++;
            } while (nums[start] == nums[previous] && start < nums.length -2);
        }

        return result;
    }
}
