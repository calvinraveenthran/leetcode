package main.test;
import main.java.LongestSubstringWoRepeatingCharacters;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class LongestSubstringWoRepeatingCharactersTest {

    @Test
    public void test(){
        LongestSubstringWoRepeatingCharacters val = new LongestSubstringWoRepeatingCharacters();
        String test ="abcdefghijdefghijklmnopqrstuvwxyz";
        String test2 = "abcabcbb";
        assertEquals(23, val.lengthOfLongestSubstring(test));
        assertEquals(3, val.lengthOfLongestSubstring(test2));
    }

}
