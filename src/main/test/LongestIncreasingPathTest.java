package main.test;
import main.java.LongestIncreasingPath;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestIncreasingPathTest {

    @Test
    public void test1() {
        int [][] input = {{9,9,4},{6,6,8},{2,1,1}};
        LongestIncreasingPath l = new LongestIncreasingPath();
        assertEquals(4, l.longestIncreasingPath(input));
    }

    @Test
    public void test2() {
        int [][] input = {{3,4,5},{3,2,6},{2,2,1}};
        LongestIncreasingPath l = new LongestIncreasingPath();
        assertEquals(4, l.longestIncreasingPath(input));
    }

}
