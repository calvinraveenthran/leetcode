package main.test;
import main.java.BuySellStock;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuySellStockTest {

    @Test
    public void buySellStockTest() {

        BuySellStock buySellStock = new BuySellStock();
        int[] prices = {7,1,5,3,6,4};
        assertEquals(5, buySellStock.maxProfit(prices));
    }

}
