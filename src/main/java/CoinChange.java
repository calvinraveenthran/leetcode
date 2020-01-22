package main.java;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        int[] bottomUp = new int[amount+1];
        Arrays.fill(bottomUp, amount + 1);
        bottomUp[0] = 0;

        for(int i = 1; i <= amount; i = i + 1) {

            int bottomUpAmt = i;

            for(int j = 0; j < coins.length; j = j + 1) {
                int remainder = bottomUpAmt - coins[j];
                if(remainder >= 0)
                    bottomUp[bottomUpAmt] =
                            Math.min(bottomUp[remainder] + 1, bottomUp[bottomUpAmt]);
            }
        }

        if(bottomUp[amount] < amount + 1)
            return bottomUp[amount];

        return -1;
    }
}
