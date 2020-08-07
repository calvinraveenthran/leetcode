package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.ReverseInteger;

public class ReverseIntegerTest {

    @Test
    public void test1(){
        ReverseInteger ri = new ReverseInteger();
        int input = 123;
        int output = 321;
        assertEquals(output, ri.reverse(input));
    }

    @Test
    public void test2(){
        ReverseInteger ri = new ReverseInteger();
        int input = -123;
        int output = -321;
        assertEquals(output, ri.reverse(input));
    }

    @Test
    public void test3(){
        ReverseInteger ri = new ReverseInteger();
        int input = 120;
        int output = 21;
        assertEquals(output, ri.reverse(input));
    }
}
