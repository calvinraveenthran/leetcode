package main.test;
import main.java.ValidParenthesis;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesisTest {

    @Test
    public void test1() {
        ValidParenthesis vp = new ValidParenthesis();
        assertTrue(vp.isValid("()"));
    }

    @Test
    public void test2() {
        ValidParenthesis vp = new ValidParenthesis();
        assertTrue(vp.isValid("{[]}"));
    }

}
