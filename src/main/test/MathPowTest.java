package main.test;
import main.java.MathPow;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathPowTest {

    @Test
    public void test1(){
        MathPow m = new MathPow();
        assertEquals(1024.00000, m.myPow(2.0000, 10), 0);
    }

    @Test
    public void test2(){
        MathPow m = new MathPow();
        assertEquals(0.25000, m.myPow(2.0000, -2), 0);
    }
}
