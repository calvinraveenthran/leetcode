package main.test;
import main.java.JumpGame;
import org.junit.Test;
import static org.junit.Assert.*;

public class JumpGameTest {

    @Test
    public void test1(){
        int[] nums = {2,3,1,1,4};
        JumpGame j = new JumpGame();
        assertTrue(j.canJump(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,2,1,0,4};
        JumpGame j = new JumpGame();
        assertFalse(j.canJump(nums));
    }

    @Test
    public void test3(){
        int[] nums = {0};
        JumpGame j = new JumpGame();
        assertTrue(j.canJump(nums));
    }

}
