package main.java;

import java.util.*;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new ArrayDeque<>();
        int[] answer = new int[nums.length-k+1];


        for(int i = 0 ; i < nums.length; i++){

            if(!q.isEmpty() && q.peekFirst() == i-k) {
                q.pollFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }

            q.offerLast(i);

            if(i-k +1 >=0) {
                answer[i-k +1] = nums[q.peekFirst()];
            }
        }

        return answer;
    }
}
