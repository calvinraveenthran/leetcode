package main.test;
import main.java.HouseRobber;
import org.junit.Test;
import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void test1(){
        HouseRobber hr = new HouseRobber();
        int [] nums = {1,2,3,1};
        assertEquals(4, hr.rob(nums));
    }

    @Test
    public void test2(){
        HouseRobber hr = new HouseRobber();
        int [] nums = {2,7,9,3,1};
        assertEquals(12, hr.rob(nums));
    }

    @Test
    public void test3(){
        HouseRobber hr = new HouseRobber();
        int [] nums = {2,1,1,2};
        assertEquals(4, hr.rob(nums));
    }
}
