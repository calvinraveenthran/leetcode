package main.java;

public class SortColors {
    public void sortColors(int[] nums) {

        int[] countSort = {0,0,0};
        for(int i =0 ; i < nums.length; i++){
            countSort[nums[i]] = countSort[nums[i]] +1;
        }

        int pos = 0;
        for(int j=0; j<3; j++) {
            while(countSort[j] !=0) {
                nums[pos] = j;
                pos = pos +1;
                countSort[j] = countSort[j] -1;
            }
        }
    }
}
