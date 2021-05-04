package main.test;
import main.java.MinAmplitude;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinAmplitudeTest {

    @Test
    public void test1() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {5,3,6,1,3};
        int K = 2;
        assertEquals(2, c.solution(A, K));
    }

    @Test
    public void test2() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {8,8,4,3};
        int K = 2;
        assertEquals(0, c.solution(A, K));
    }

    @Test
    public void test3() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {3,5,1,3,9,8};
        int K = 4;
        assertEquals(1, c.solution(A, K));
    }

    @Test
    public void test4() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {3,5,1,3,9,8};
        int K =5;
        assertEquals(0, c.solution(A, K));
    }

    @Test
    public void test5() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {5,3,6,1,1};
        int K = 3;
        assertEquals(0, c.solution(A, K));
    }

    @Test
    public void test6() {
        MinAmplitude c = new MinAmplitude();
        int[] A = {1,1,6,9,3};
        int K = 3;
        assertEquals(0, c.solution(A, K));
    }
}
