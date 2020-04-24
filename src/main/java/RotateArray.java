package main.java;


public class RotateArray {
    public int[] rotateArray(int[] nums, int k) {

        if(k > nums.length) {
            k = k % nums.length;
        }

        int[] dest = new int[nums.length];
        System.arraycopy(nums, 0, dest, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, dest, 0, k);
        return dest;
    }
}
