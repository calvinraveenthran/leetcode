package main.java;
import java.util.*;

public class MinAmplitude {

    public int solution(int[] A, int K) {
        int minAmplitude = Integer.MAX_VALUE;

        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = K; i < A.length; i++) {
            minQ.add(A[i]);
            maxQ.add(A[i]);
        }

        for (int i = 0; i+K-1 < A.length; i++) {

            if(i>0){
                minQ.add(A[i-1]);
                maxQ.add(A[i-1]);

                maxQ.remove(A[i+K-1]);
                minQ.remove(A[i+K-1]);
            }

            if (!maxQ.isEmpty() && !minQ.isEmpty() && (minAmplitude > (maxQ.peek() - minQ.peek()))) {
                minAmplitude = maxQ.peek() - minQ.peek();
            }
        }

        return minAmplitude;
    }
}
