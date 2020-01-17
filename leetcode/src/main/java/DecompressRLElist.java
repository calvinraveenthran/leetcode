package main.java;

import java.util.Arrays;

public class DecompressRLElist {

    public int[] decompressArray(int[] nums) {

        int[] answer = {0};
        int i = 0;

        while(i < nums.length) {
            int length = nums[i];
            int value = nums[i+1];
            int[] current = new int[length];
            Arrays.fill(current, value);
            int[] intermediate = new int[answer.length + current.length];
            System.arraycopy(answer, 0, intermediate, 0, answer.length);
            System.arraycopy(current, 0, intermediate, answer.length, current.length);
            answer = intermediate;
            i = i+2;
        }

        return Arrays.copyOfRange(answer, 1, answer.length);
    }
}
