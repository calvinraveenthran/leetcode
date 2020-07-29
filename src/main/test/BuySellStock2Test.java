package main.test;

import main.java.BuySellStock2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuySellStock2Test {

    @Test
    public void buySellStockTestRandom() {

        BuySellStock2 buySellStock = new BuySellStock2();
        int[] prices = {7,1,5,3,6,4};
        assertEquals(7, buySellStock.maxProfit(prices));
    }

    @Test
    public void buySellStockTestIncremental() {

        BuySellStock2 buySellStock = new BuySellStock2();
        int[] prices = {1,2,3,4,5};
        assertEquals(4, buySellStock.maxProfit(prices));
    }

    @Test
    public void buySellStockTestDecreasing() {

        BuySellStock2 buySellStock = new BuySellStock2();
        int[] prices = {7,6,4,3,1};
        assertEquals(0, buySellStock.maxProfit(prices));
    }

}
