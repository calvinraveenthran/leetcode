package main.test;
import main.java.CountAndSay;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountAndSayTest {


    @Test
    public void test1() {
        CountAndSay cas = new CountAndSay();
        assertEquals("312211", cas.countAndSay(6));
    }

    @Test
    public void test2() {
        CountAndSay cas = new CountAndSay();
        assertEquals("13112221", cas.countAndSay(7));
    }

    @Test
    public void test3() {
        CountAndSay cas = new CountAndSay();
        assertEquals("1113213211", cas.countAndSay(8));
    }

}
