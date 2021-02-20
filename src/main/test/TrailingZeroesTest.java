package main.test;
import main.java.TrailingZeroes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrailingZeroesTest {

    @Test
    public void test1(){
        TrailingZeroes tz = new TrailingZeroes();
        assertEquals(0, tz.trailingZeroes(3));
    }

    @Test
    public void test2(){
        TrailingZeroes tz = new TrailingZeroes();
        assertEquals(249, tz.trailingZeroes(1000));
    }

    @Test
    public void test3(){
        TrailingZeroes tz = new TrailingZeroes();
        assertEquals(2499, tz.trailingZeroes(10000));
    }

    @Test
    public void test4(){
        TrailingZeroes tz = new TrailingZeroes();
        assertEquals(698, tz.trailingZeroes(2803));
    }
}
