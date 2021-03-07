package main.java;

import java.util.Arrays;
import java.util.HashMap;

public class FourSum2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int a, b;
        HashMap<Integer, Integer> firstMap =  new HashMap<>();
        HashMap<Integer, Integer> secondMap =  new HashMap<>();
        int answer = 0;

        for(a=0; a< A.length; a++){
            for(b=0; b < B.length; b++){
                firstMap.merge(A[a] + B[b], 1, Integer::sum);
                secondMap.merge(C[a] + D[b], 1, Integer::sum);
            }
        }

        for(Integer key : firstMap.keySet()) {
            if(secondMap.get(-key) != null) {
                int numComb = firstMap.get(key) * secondMap.get(-key);
                answer = answer + numComb;
            }
        }
        return answer;
    }

}
