package main.test;
import main.java.CountPrimes;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountPrimesTest {

    @Test
    public void test1() {
        CountPrimes cp = new CountPrimes();
        assertEquals(cp.countPrimes(10), 4);
    }

    @Test
    public void test2() {
        CountPrimes cp = new CountPrimes();
        assertEquals(cp.countPrimes(5000000), 348513);
    }

}
