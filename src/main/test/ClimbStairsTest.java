package main.test;
import main.java.ClimbStairs;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClimbStairsTest {

    @Test
    public void coinChangeTest() {
        ClimbStairs climbStairs = new ClimbStairs();
        assertEquals(1836311903, climbStairs.climbStairs(45));
    }
}
