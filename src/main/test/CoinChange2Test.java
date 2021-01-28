package main.test;
import main.java.CoinChange2;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoinChange2Test {

    @Test
    public void test1(){
        int[] coins = {1,2,5};
        int amount = 11;
        CoinChange2 c = new CoinChange2();
        assertEquals(3, c.coinChange(coins, amount));
    }

    @Test
    public void test2(){
        int[] coins = {2};
        int amount = 3;
        CoinChange2 c = new CoinChange2();
        assertEquals(-1, c.coinChange(coins, amount));
    }

    @Test
    public void test3(){
        int[] coins = {1};
        int amount = 0;
        CoinChange2 c = new CoinChange2();
        assertEquals(0, c.coinChange(coins, amount));
    }

    @Test
    public void test4(){
        int[] coins = {1};
        int amount = 2;
        CoinChange2 c = new CoinChange2();
        assertEquals(2, c.coinChange(coins, amount));
    }

    @Test
    public void test5(){
        int[] coins = {1,3,5};
        int amount = 8;
        CoinChange2 c = new CoinChange2();
        assertEquals(2, c.coinChange(coins, amount));
    }

    @Test
    public void test6(){
        int[] coins = {186,419,83,408};
        int amount = 6249;
        CoinChange2 c = new CoinChange2();
        assertEquals(20, c.coinChange(coins, amount));
    }

}