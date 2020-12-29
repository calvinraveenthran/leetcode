package main.java;
import java.util.*;

public class IncreasingTripletSubsequence {
    public boolean increasingTripletBruteForce(int[] nums) {
        for(int i=0; i < nums.length -2; i++) {
            for(int j = i +1; j< nums.length-1; j++) {

                if(nums[j] <= nums[i]){
                    continue;
                }

                for(int k = j+1; k < nums.length; k++) {
                    if(nums[k] > nums[j]) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public boolean increasingTriplet(int[] nums) {

        int minOne= Integer.MAX_VALUE;
        int minTwo= Integer.MAX_VALUE;

        for(int num: nums) {
            if(num < minOne) {
                minOne = num;
            }

            if(num > minOne) {
                minTwo = Math.min(num, minTwo);
            }

            if(num > minTwo) {
                return true;
            }
        }
        return false;
    }
}
