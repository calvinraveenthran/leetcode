package main.java;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        int three = 3;
        int five = 5;
        ArrayList<String> result = new ArrayList<>();

        for(int i = 1; i <=n; i++) {
            if(i == three && i == five) {
                result.add("FizzBuzz");
                three +=3;
                five +=5;
            } else if (i == three) {
                result.add("Fizz");
                three +=3;
            } else if (i == five) {
                result.add("Buzz");
                five +=5;
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
