package main.java;

public class ClimbingStairs {


    public int climbStairs(int n) {

        int i = n;
        if(n < 4) {
            i =4;
        }

        int[] dp = new int[i+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(i = 4; i < n +1; i= i+1) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

}
