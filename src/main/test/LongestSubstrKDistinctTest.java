package main.test;
import main.java.LongestSubstrKDistinct;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestSubstrKDistinctTest {

    @Test
    public void test1(){
        LongestSubstrKDistinct l = new LongestSubstrKDistinct();
        String input = "eceba";
        assertEquals(3, l.lengthOfLongestSubstringKDistinct(input, 2));
    }

    @Test
    public void test2(){
        LongestSubstrKDistinct l = new LongestSubstrKDistinct();
        String input = "aaaaaaaaaaaaab";
        assertEquals(13, l.lengthOfLongestSubstringKDistinct(input, 1));
    }

    @Test
    public void test3(){
        LongestSubstrKDistinct l = new LongestSubstrKDistinct();
        String input = "aaaaaaaabaaaaa";
        assertEquals(8, l.lengthOfLongestSubstringKDistinct(input, 1));
    }

    @Test
    public void test4(){
        LongestSubstrKDistinct l = new LongestSubstrKDistinct();
        String input = "a";
        assertEquals(1, l.lengthOfLongestSubstringKDistinct(input, 2));
    }
}
