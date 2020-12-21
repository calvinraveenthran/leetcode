package main.java;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        double n = (double) nums.length;
        double sum = (n/2)*(n+1);

        for (int i=0; i < nums.length; i++) {
            sum = sum - nums[i];
        }

        return (int) sum;
    }
}
