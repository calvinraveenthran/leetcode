package main.test;
import main.java.ThreeSum2;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;


public class ThreeSum2Test {

    @Test
    public void test1(){
        ThreeSum2 ts2 = new ThreeSum2();
        int[] array = {-1,0,1,2,-1,-4,2};

        int[] first = {-4,2,2};
        int[] second = {-1,-1,2};
        int[] third = {-1, 0, 1};

        List<List<Integer>> answer = ts2.threeSum(array);

        assertArrayEquals(answer.get(0).stream().mapToInt(i -> i).toArray(), first);
        assertArrayEquals(answer.get(1).stream().mapToInt(i -> i).toArray(), second);
        assertArrayEquals(answer.get(2).stream().mapToInt(i -> i).toArray(), third);
    }
}
