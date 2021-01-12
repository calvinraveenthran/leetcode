package main.test;
import java.util.*;
import main.java.GenerateParentheses;
import org.junit.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Test.*;

public class GenerateParenthesesTest {

    @Test
    public void test1(){
        GenerateParentheses gp = new GenerateParentheses();
        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        List<String> answer = gp.generateParenthesis(3);

        assertTrue(expected.containsAll(answer));
        assertTrue(answer.containsAll(expected));
    }
}
