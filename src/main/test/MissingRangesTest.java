package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import main.java.MissingRanges;

public class MissingRangesTest {

    @Test
    public void test(){
        MissingRanges mr = new MissingRanges();
        int[] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        List<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("4->49");
        expected.add("51->74");
        expected.add("76->99");
        List<String> answer = mr.findMissingRanges(nums, lower, upper);

        assertTrue(answer.containsAll(expected));
        assertTrue(expected.containsAll(answer));

    }

    @Test
    public void test2(){
        MissingRanges mr = new MissingRanges();
        int[] nums = {0,1,3,50,75,99};
        int lower = 0;
        int upper = 99;
        List<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("4->49");
        expected.add("51->74");
        expected.add("76->98");
        List<String> answer = mr.findMissingRanges(nums, lower, upper);

        assertTrue(answer.containsAll(expected));
        assertTrue(expected.containsAll(answer));

    }

    @Test
    public void test3(){
        MissingRanges mr = new MissingRanges();
        int[] nums = {3,50,75,99};
        int lower = 0;
        int upper = 99;
        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->49");
        expected.add("51->74");
        expected.add("76->98");
        List<String> answer = mr.findMissingRanges(nums, lower, upper);

        assertTrue(answer.containsAll(expected));
        assertTrue(expected.containsAll(answer));
    }
}
