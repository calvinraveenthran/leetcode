package main.test;
import main.java.SlidingWindowMaximum;
import org.junit.Test;
import org.junit.Test.*;
import static org.junit.Assert.*;

public class SlidingWindowMaximumTest {

    @Test
    public void test1() {
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        int[] input = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] answer = {3,3,5,5,6,7};
        assertArrayEquals(answer, s.maxSlidingWindow(input, k));
    }

    @Test
    public void test2() {
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        int[] input = {4,-2};
        int k = 2;
        int[] answer = {4};
        assertArrayEquals(answer, s.maxSlidingWindow(input, k));
    }

    @Test
    public void test3() {
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        int[] input = {1,3,-1,-3,5,3,6,7};
        int k = 1;
        int[] answer = {1,3,-1,-3,5,3,6,7};
        assertArrayEquals(answer, s.maxSlidingWindow(input, k));
    }

    @Test
    public void test4() {
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        int[] input = {-7,-8,7,5,7,1,6,0};
        int k = 4;
        int[] answer = {7,7,7,7,7};
        assertArrayEquals(answer, s.maxSlidingWindow(input, k));
    }
}
