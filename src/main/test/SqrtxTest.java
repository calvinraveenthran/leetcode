package main.test;
import org.junit.Test;
import main.java.Sqrtx;
import static org.junit.Assert.*;

public class SqrtxTest {

    @Test
    public void test1() {
        Sqrtx s = new Sqrtx();
        assertEquals(2, s.mySqrt(4));
        assertEquals(4, s.mySqrt(16));
        assertEquals(8, s.mySqrt(64));
    }
}
