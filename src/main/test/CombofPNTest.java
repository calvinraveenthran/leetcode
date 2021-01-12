package main.test;
import main.java.CombOfPN;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CombofPNTest {

    @Test
    public void test1(){
        String digits = "23";
        CombOfPN pn = new CombOfPN();
        List<String> expected =  new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");

        List<String> answer = pn.letterCombinations(digits);

        assertTrue(expected.containsAll(answer));
        assertTrue(answer.containsAll(expected));

    }
}
