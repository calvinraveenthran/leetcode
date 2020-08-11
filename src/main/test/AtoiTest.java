package main.test;
import main.java.Atoi;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtoiTest {

    @Test
    public void test1() {
        Atoi atoi = new Atoi();
        assertEquals(42, atoi.myAtoi("42"));
    }

    @Test
    public void test2() {
        Atoi atoi = new Atoi();
        assertEquals(-42, atoi.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        Atoi atoi = new Atoi();
        assertEquals(4193, atoi.myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        Atoi atoi = new Atoi();
        assertEquals(0, atoi.myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        Atoi atoi = new Atoi();
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
    }
}
