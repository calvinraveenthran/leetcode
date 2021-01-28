package main.java;

import java.util.Arrays;

public class CoinChange2 {
    public int coinChange(int[] coins, int amount) {
        int[] amount_array = new int[amount + 1];
        Arrays.fill(amount_array, -1);
        Arrays.sort(coins);
        amount_array[0] = 0;
        for (int camount = 1; camount <= amount; camount++) {
            for (int coin : coins) {
                if (coin > camount) {
                    continue;
                }

                int iterator = camount / coin;
                for (int k = iterator; k >0; k--) {
                    if (amount_array[camount - (k * coin)] != -1) {
                        int local_min = k + amount_array[camount - k * coin];
                        amount_array[camount] = amount_array[camount] == -1 ? local_min :
                                Math.min(amount_array[camount], local_min);
                    }
                }
            }
        }
        return amount_array[amount];
    }
}
