package main.java;
        import java.util.*;

public class JumpGame {


    public boolean canJump(int[] nums) {

        char[]nums_char = new char[nums.length];
        nums_char[0] = 'G';

        for(int i=0; i< nums.length; i++) {

            int j = 1;
            while(j <= nums[i] && i + j < nums.length) {
                if(nums_char[i+j] == 'G') {
                    j = j +1;
                    continue;
                }

                if(nums_char[i] == 'G'){
                    nums_char[i+j] = 'G';
                } else {
                    nums_char[i+j] = 'B';
                }
                j = j +1;
            }

        }
        return nums_char[nums.length-1] == 'G';
    }
}
