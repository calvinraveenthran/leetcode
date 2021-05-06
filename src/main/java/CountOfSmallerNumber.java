package main.java;
import java.util.*;

public class CountOfSmallerNumber {

    public static class Int2 {
        int id;
        int initPos;

        public Int2(int id, int initPos) {
            this.id = id;
            this.initPos = initPos;
        }
    }

    public List<Integer> countSmaller2(int[] nums) {
        Int2[] list = new Int2[nums.length];
        int[] ans = new int[nums.length];
        for(int i =0; i < nums.length; i++) {
            list[i] = new Int2(nums[i], i);
        }

        mergeSort(list, ans, 0, nums.length-1);
        List<Integer> ret = new ArrayList<>();
        for (int i: ans)
            ret.add(i);
        return ret;
    }

    public void merge(Int2[] list, int[] ans, int lS, int lE, int rS, int rE) {

        int p = lS;

        Int2[] lTemp = new Int2[lE - lS +1];
        System.arraycopy(list, lS, lTemp, 0, lE - lS +1);

        Int2[] rTemp = new Int2[rE - rS + 1];
        System.arraycopy(list, rS, rTemp, 0, rE - rS +1);


        int l = 0;
        int r = 0;

        while(l < lTemp.length &&  r < rTemp.length) {

            if(lTemp[l].id <= rTemp[r].id) {
                list[p++] = lTemp[l++];
            } else {
                int count = 0;
                while((r < rTemp.length) && (lTemp[l].id > rTemp[r].id)) {
                    list[p++] = rTemp[r++];
                    count++;
                }

                int i = l;
                while(i < lTemp.length) {
                    ans[lTemp[i++].initPos] += count;
                }
            }
        }

        while(l < lTemp.length) {
            list[p++] = lTemp[l++];
        }

        while(r < rTemp.length){
            list[p++] = rTemp[r++];
        }
    }

    public void mergeSort(Int2[] list, int[] ans, int start, int end) {

        if(start >= end) {
            return;
        }

        int mid = start + ((end - start)/2);

        mergeSort(list, ans, start, mid);
        mergeSort(list, ans, mid +1, end);

        merge(list, ans, start, mid, mid +1, end);
    }


    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] indices = new int[n]; // record the index. we are going to sort this array
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        // sort indices with their corresponding values in nums, i.e., nums[indices[i]]
        mergeSort(indices, 0, n, result, nums);
        // change int[] to List to return
        List<Integer> resultToReturn = new ArrayList<Integer>(n);
        for (int i : result) {
            resultToReturn.add(i);
        }
        return resultToReturn;
    }

    private void mergeSort(int[] indices, int left, int right, int[] result, int[] nums) {
        if (right - left <= 1) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(indices, left, mid, result, nums);
        mergeSort(indices, mid, right, result, nums);
        merge(indices, left, right, mid, result, nums);
    }

    private void merge(int[] indices, int left, int right, int mid, int[] result, int[] nums) {
        // merge [left, mid) and [mid, right)
        int i = left; // current index for the left array
        int j = mid; // current index for the right array
        // use temp to temporarily store sorted array
        List<Integer> temp = new ArrayList<Integer>(right - left);
        while (i < mid && j < right) {
            if (nums[indices[i]] <= nums[indices[j]]) {
                // j - mid numbers jump to the left side of indices[i]
                result[indices[i]] += j - mid;
                temp.add(indices[i]);
                i++;
            } else {
                temp.add(indices[j]);
                j++;
            }
        }
        // when one of the subarrays is empty
        while (i < mid) {
            // j - mid numbers jump to the left side of indices[i]
            result[indices[i]] += j - mid;
            temp.add(indices[i]);
            i++;
        }
        while (j < right) {
            temp.add(indices[j]);
            j++;
        }
        // restore from temp
        for (int k = left; k < right; k++) {
            indices[k] = temp.get(k - left);
        }
    }
}
