package main.java;

import java.util.*;

public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Long> seenThis = new HashSet<>();
        long value = n;

        while(value != 1 && !seenThis.contains(value)) {
            seenThis.add(value);
            long start = value;
            long currentValue = 0;

            while(start!= 0){
                long multiplier = start%10;
                start = start/10;
                currentValue = (long) (currentValue + Math.pow(multiplier, 2));
            }

            value = currentValue;
        }

        return value ==1;
    }
}
