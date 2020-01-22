package main.test;
import main.java.CoinChange;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoinChangeTest {


    @Test
    public void coinChangeTest() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1,2,5};
        int amount = 11;
        assertEquals(3, coinChange.coinChange(coins, amount));
    }


}
