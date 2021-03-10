package main.test;
import main.java.LongestConsecutiveSequence;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void test1(){
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int[] input = {0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, l.longestConsecutive(input));
    }

    @Test
    public void test2(){
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        int[] input = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        assertEquals(4, l.longestConsecutive(input));
    }
}
