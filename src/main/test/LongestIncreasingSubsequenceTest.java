package main.test;
import main.java.LongestIncreasingSubsequence;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void test1(){
        LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
        int[] input = {10,9,2,5,3,7,101,18};
        assertEquals(i.lengthOfLIS(input), 4);
    }

    @Test
    public void test2(){
        LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
        int[] input = {};
        assertEquals(i.lengthOfLIS(input), 0);
    }

    @Test
    public void test3(){
        LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
        int[] input = {4};
        assertEquals(i.lengthOfLIS(input), 1);
    }

    @Test
    public void test4(){
        LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
        int[] input = {3,3,3,3,3,3};
        assertEquals(i.lengthOfLIS(input), 1);
    }

}
