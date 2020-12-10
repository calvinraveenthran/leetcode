package main.test;
import main.java.RomanToInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void test1() {
        RomanToInteger rti = new RomanToInteger();
        assertEquals(rti.romanToInt("MMMCMXCIX"), 3999);
    }

    @Test
    public void test2() {
        RomanToInteger rti = new RomanToInteger();
        assertEquals(rti.romanToInt("MMMCDXLIV"), 3444);
    }

    @Test
    public void test3() {
        RomanToInteger rti = new RomanToInteger();
        assertEquals(rti.romanToInt("MMMDLV"), 3555);
    }
}
