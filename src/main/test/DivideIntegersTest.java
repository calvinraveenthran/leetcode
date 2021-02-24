package main.test;
import main.java.DivideIntegers;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivideIntegersTest {
    @Test
    public void test(){
        DivideIntegers d = new DivideIntegers();
        assertEquals(d.divide(-2147483648, -1), 2147483647);
    }
}
