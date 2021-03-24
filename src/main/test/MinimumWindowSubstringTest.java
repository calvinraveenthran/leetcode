package main.test;
import main.java.MinimumWindowSubstring;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {

    @Test
    public void test1(){
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        assertEquals("BANC", m.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void test2(){
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        assertEquals("a", m.minWindow("a", "a"));
    }

    @Test
    public void test3(){
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        assertEquals("a", m.minWindow("ab", "a"));
    }

    @Test
    public void test4(){
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        assertEquals("aa", m.minWindow("aa", "aa"));
    }
}
