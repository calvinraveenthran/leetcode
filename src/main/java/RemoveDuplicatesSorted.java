package main.java;

public class RemoveDuplicatesSorted {

    public int removeDuplicateSorted(int[] nums) {

        int i = 1;
        int k = i;

        if(nums.length == 1) {
            return 1;
        }

        while(k < nums.length) {

            if(nums[i] > nums[i-1]) {
                i++;
                k++;
            } else {
                while(k < nums.length && nums[k]<= nums[i-1]) {
                    k++;
                }

                if(k < nums.length) {
                    nums[i] = nums[k];
                    i++;
                }

            }

        }
        return i;
    }
}
