package main.java;

public class BuySellStock2 {

     public int maxProfit(int[] prices) {

         int total_profit = 0, local_profit = 0, buy_here = 0, i = 1;

         while(i < prices.length) {

             if(prices[i] <=  prices[i-1]) {
                 buy_here = i;
                 total_profit = total_profit + local_profit;
                 local_profit = 0;
                 i = i + 1;
                 continue;
             }

             local_profit = prices[i] - prices[buy_here];
             i = i + 1;
         }

         return total_profit + local_profit;
     }
}
