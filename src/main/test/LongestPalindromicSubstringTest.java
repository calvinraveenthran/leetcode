package main.test;
import main.java.LongestPalindromicSubstring;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void test1(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="edcbaabcdef";
        String answer = "edcbaabcde";
        assertEquals(answer, val.longestPalindrome(test));
    }

    @Test
    public void test2(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="edcbabcdef";
        String answer = "edcbabcde";
        assertEquals(answer, val.longestPalindrome(test));
    }

    @Test
    public void test3(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="babad";
        String answer = "bab";
        assertEquals(answer, val.longestPalindrome(test));
    }

    @Test
    public void test4(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="cbbd";
        String answer = "bb";
        assertEquals(answer, val.longestPalindrome(test));
    }

    @Test
    public void test5(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="a";
        String answer = "a";
        assertEquals(answer, val.longestPalindrome(test));
    }

    @Test
    public void test6(){
        LongestPalindromicSubstring val = new LongestPalindromicSubstring();
        String test ="ac";
        String answer = "a";
        assertEquals(answer, val.longestPalindrome(test));
    }

}