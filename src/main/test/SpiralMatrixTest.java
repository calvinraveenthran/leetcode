package main.test;
import main.java.SpiralMatrix;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class SpiralMatrixTest {

    @Test
    public void test1() {
        int[][] input = {{1,2,3},{8,9,4},{7,6,5}};
        int[] expected = {1,2,3,4,5,6,7,8,9};

        SpiralMatrix s = new SpiralMatrix();
        List<Integer> answer = s.spiralOrder(input);

        assertArrayEquals(expected, answer.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void test2() {
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] expected = {1,2,3,4,8,12,11,10,9,5,6,7};

        SpiralMatrix s = new SpiralMatrix();
        List<Integer> answer = s.spiralOrder(input);

        assertArrayEquals(expected, answer.stream().mapToInt(i -> i).toArray());
    }
}
