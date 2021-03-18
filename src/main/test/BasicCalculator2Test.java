package main.test;
import main.java.BasicCalculator2;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicCalculator2Test {

    @Test
    public void test1(){
        String s = "3+2*2";
        BasicCalculator2 b = new BasicCalculator2();
        assertEquals(7, b.calculate(s));
    }

    @Test
    public void test2(){
        String s = " 3/2 ";
        BasicCalculator2 b = new BasicCalculator2();
        assertEquals(1, b.calculate(s));
    }

    @Test
    public void test3(){
        String s = " 3+5 / 2 ";
        BasicCalculator2 b = new BasicCalculator2();
        assertEquals(5, b.calculate(s));
    }
}
