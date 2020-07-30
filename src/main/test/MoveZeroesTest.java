package main.test;

import main.java.MoveZeroes;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void test1() {
        MoveZeroes mx = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        int[] answer = {1,3,12,0,0};
        mx.moveZeroes(nums);
        assertArrayEquals(answer, nums);
    }

    @Test
    public void test2() {
        MoveZeroes mx = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        int[] answer = {1,3,12,0,0};
        mx.moveZeroes2(nums);
        assertArrayEquals(answer, nums);
    }

}
