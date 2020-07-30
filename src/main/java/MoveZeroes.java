package main.java;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int i =0, j = 0;
        int[] answer_array = new int[nums.length];
        Arrays.fill(answer_array,0);

        while(i < nums.length) {

            if(nums[i] != 0) {
                answer_array[j] = nums[i];
                j = j+1;
            }

            i = i+1;
        }

        System.arraycopy(answer_array, 0, nums, 0, nums.length);
    }

    public void moveZeroes2(int[] nums) {

        int current_zero_pos = nums.length -1, i = 0;

        while(i < current_zero_pos) {

            if(nums[i] != 0) {
                i = i +1;
                continue;
            }

            int j = i;
            while(j <current_zero_pos) {

                int tmp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = tmp;
                j = j+1;
            }

            current_zero_pos = current_zero_pos-1;
        }
    }
}
