package main.java;

import java.util.HashSet;

public class SingleNumber {

    public int singleNumber(int[] array) {

        HashSet<Integer> answerSet = new HashSet<>();
        int i = 0;
        while(i < array.length) {
            if (answerSet.contains(array[i]))
                    answerSet.remove(array[i]);
            else
                answerSet.add(array[i]);
            i=i+1;
        }
        return Integer.valueOf(answerSet.toArray()[0].toString());
    }
}
