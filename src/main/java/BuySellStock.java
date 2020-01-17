package main.java;

public class BuySellStock {

     public int maxProfit(int[] prices) {
         int lbuy =0, lsell = 0, lprofit = 0, gprofit = 0;
         int i = 1;

         while(i < prices.length) {
             lsell = i;
             lprofit = prices[lsell] - prices[lbuy];
             if(lprofit < 0) {
                 lbuy = lsell;
             } else if (lprofit > gprofit) {
                 gprofit = lprofit;
             }
             i = i+1;
         }
         return gprofit;
     }
}
