package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.IncreasingTripletSubsequence;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void test(){
        IncreasingTripletSubsequence its = new IncreasingTripletSubsequence();
        int[] input = {9,6,8,5,7,4,1,2,3};
        assertTrue(its.increasingTriplet(input));
    }
}
