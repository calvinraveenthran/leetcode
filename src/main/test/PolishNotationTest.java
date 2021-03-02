package main.test;
import main.java.PolishNotation;
import org.junit.Test;
import static org.junit.Assert.*;

public class PolishNotationTest {

    @Test
    public void test1(){
        PolishNotation p = new PolishNotation();
        String[] input = {"2", "1", "+", "3", "*"};
        assertEquals(9, p.evalRPN(input));
    }

    @Test
    public void test2(){
        PolishNotation p = new PolishNotation();
        String[] input = {"4", "13", "5", "/", "+"};
        assertEquals(6, p.evalRPN(input));
    }

    @Test
    public void test3(){
        PolishNotation p = new PolishNotation();
        String[] input = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, p.evalRPN(input));
    }

    @Test
    public void test4(){
        PolishNotation p = new PolishNotation();
        String[] input = {"18"};
        assertEquals(18, p.evalRPN(input));
    }

    @Test
    public void test5(){
        PolishNotation p = new PolishNotation();
        String[] input = {"3","11","+","5","-"};
        assertEquals(9, p.evalRPN(input));
    }

    @Test
    public void test6(){
        PolishNotation p = new PolishNotation();
        String[] input = {"4","-2","/","2","-3","-","-"};
        assertEquals(-7, p.evalRPN(input));
    }
}
