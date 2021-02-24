package main.java;

public class Sqrtx {
    public int mySqrt(int x) {
        if (x < 2) return x;

        //e^(1/2 * log x)  = sqrt(x)

        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;
        return (long)right * right > x ? left : right;
    }
}
