package main.test;
import main.java.LongestCommonPrefix;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void test1(){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] test = {"flower","flow","flight"};
        assertEquals("fl", lcp.longestCommonPrefix(test));
    }

    @Test
    public void test2(){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] test = {"dog","racecar","car"};
        assertEquals("", lcp.longestCommonPrefix(test));
    }

}
