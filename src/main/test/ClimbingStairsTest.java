package main.test;
import main.java.ClimbingStairs;
import org.junit.Test;
import static org.junit.Assert.*;


public class ClimbingStairsTest {

    @Test
    public void climbingStairsTest() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(8, climbingStairs.climbStairs(5));
    }


}
