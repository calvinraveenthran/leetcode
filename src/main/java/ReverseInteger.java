package main.java;

public class ReverseInteger {

    public int reverse(int x) {

        long answer = 0, input = x;
        if(input < 0)
            input = input*-1;

        while(input != 0) {
            answer = (answer*10) + (input%10);
            input = input /10;
        }

        if(x < 0)
            answer = answer*-1;

        if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE)
            return 0;

        return (int) answer;
    }
}
