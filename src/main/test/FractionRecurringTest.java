package main.test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.java.FractionRecurring;


public class FractionRecurringTest {

    @Test
    public void test1(){
        FractionRecurring f = new FractionRecurring();
        assertEquals("2", f.fractionToDecimal(2,1));
    }

    @Test
    public void test2(){
        FractionRecurring f = new FractionRecurring();
        assertEquals("0.(6)", f.fractionToDecimal(2,3));
    }

    @Test
    public void test3(){
        FractionRecurring f = new FractionRecurring();
        assertEquals("0.2", f.fractionToDecimal(1,5));
    }

    @Test
    public void test4(){
        FractionRecurring f = new FractionRecurring();
        assertEquals("0.(0012)", f.fractionToDecimal(4,3333));
    }
}
