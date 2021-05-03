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

    public List<Integer> countSmaller(int[] nums) {
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
        int l = 0;
        int r = 0;

        Int2[] temp = new Int2[list.length];
        System.arraycopy(list, 0, temp, 0, list.length);

        while(lS +l <= lE && rS+ r <= rE) {

            if(temp[lS + l].id <= temp[rS + r].id) {
                list[p] = temp[lS + l];
                if(temp[lS + l].initPos < p )
                    ans[temp[lS + l].initPos] += p - temp[lS + l].initPos;
                temp[lS + l].initPos = p;
                l++;
            } else {
                list[p] = temp[rS + r];
                if(temp[rS + r].initPos < p )
                    ans[temp[rS + r].initPos] += p - temp[rS + r].initPos;
                temp[rS + r].initPos = p;
                r++;
            }
            p++;
        }

        while(lS + l <= lE) {
            list[p] = temp[lS + l];
            if(temp[lS + l].initPos < p )
                ans[temp[lS + l].initPos] += p - temp[lS + l].initPos;
            temp[lS + l].initPos = p;
            l++;
            p++;
        }

        while(rS + r <= rE){
            list[p] = temp[rS + r];
            if(temp[rS + r].initPos < p)
                ans[temp[rS + r].initPos] += p - temp[rS + r].initPos;
            temp[rS + r].initPos = p;
            r++;
            p++;
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
}
