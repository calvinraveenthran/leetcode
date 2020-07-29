package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {

    public int[] intersect1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> intersectMap = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i : nums1) {
            if(intersectMap.containsKey(i)) {
                intersectMap.put(i, intersectMap.get(i)+1);
            } else {
                intersectMap.put(i,1);
            }
        }

        for(int j : nums2) {
            if(intersectMap.containsKey(j)) {
                answer.add(j);
                intersectMap.put(j, intersectMap.get(j)-1);

                if(intersectMap.get(j) == 0)
                    intersectMap.remove(j);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public int[] intersect2(int[] nums1, int[] nums2) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int smalleri = 0, largeri=0;
        int[] larger = nums1.length >= nums2.length ? nums1 : nums2;
        int[] smaller = nums1.length >= nums2.length ? nums2 : nums1;


        while(smalleri < smaller.length) {

            if(largeri == larger.length){
                break;
            }

            if(smaller[smalleri] < larger[largeri]) {
                smalleri++;
            } else if (smaller[smalleri] > larger[largeri]) {
                largeri++;
            }else {
                answer.add(smaller[smalleri]);
                smalleri++;
                largeri++;
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
