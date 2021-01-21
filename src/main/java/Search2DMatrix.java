package main.java;

public class Search2DMatrix {

    public boolean binarySearch(int[] array, int target) {

        int start =0;
        int end = array.length;

        while(start <= end) {

            int mid = start + ((end-start)/2);

            if(array[mid] == target) {
                return true;
            }

            if(array[mid] > target) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }

        return false;
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (ints[0] <= target && target <= ints[ints.length - 1]) {
                if (binarySearch(ints, target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
