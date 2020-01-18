package main.java;

import java.util.Arrays;
import java.util.HashMap;

public class ProductExceptSelf {

    private HashMap<Integer, Integer> returnMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap <>();

        // Right Sum
        int i = nums.length - 1;
        int j = 0;
        int sumRight = 1;
        int sumLeft = 1;
        while(i > 0) {

            sumRight = sumRight*nums[i];
            map.put(i,sumRight);

            sumLeft = sumLeft*nums[j];
            map.put(-j,sumLeft);

            i = i-1;
            j = j+1;
        }

        return map;
    }

    public int[] productExceptSelf2(int[] nums) {

        int[] answer = new int[nums.length];
        answer[0] = 1;

        int multiple = 1;
        for(int i = 0; i < nums.length-1; i =i+1) {
            multiple = multiple * nums[i];
            answer[i+1] = multiple;
        }

        multiple = 1;
        for(int i = nums.length-1; i >0; i =i-1) {
            multiple = multiple * nums[i];
            answer[i-1] =  multiple * answer[i-1];
        }

        return answer;
    }

    public int[] productExceptSelf(int[] nums) {

        HashMap<Integer, Integer> map = this.returnMap(nums);
        int[] answer = new int[nums.length];
        answer[0] = map.get(1);
        answer[nums.length-1] = map.get(-(nums.length-2));
        for(int i=1; i < nums.length-1; i = i+1){
            answer[i] = map.get(-(i-1)) * map.get((i+1));
        }
        return answer;
    }
}
