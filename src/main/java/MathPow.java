package main.java;

public class MathPow {
    public double myPow(double x, int n) {
        double base = x;
        double answer = 1.0;

        if(n == 0){
            return answer;
        }


        if(n > 0) {
            for(int i = 1; i <= n; i++ ){
                answer = answer*base;
            }
        }

        if(n < 0) {
            n = n*-1;
            for(int i = 1; i <= n; i ++ ){
                answer = answer/base;
            }
        }

        return answer;

    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow2(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }
}
