package main.java;

public class ProductExceptSelf2 {

    public int[] productExceptSelf(int[] nums) {

        int [] right = new int[nums.length];
        int [] left = new int[nums.length];
        int [] answer = new int[nums.length];


        right[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            right[i] = nums[i-1] *right[i-1];
        }

        left[nums.length-1] = 1;
        for(int i = nums.length-2; i>=0; i--){
            left[i] = left[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            answer[i] = right[i] * left[i];
        }
        return answer;
    }

}
