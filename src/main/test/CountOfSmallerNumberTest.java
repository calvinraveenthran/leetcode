package main.test;
import main.java.CountOfSmallerNumber;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CountOfSmallerNumberTest {

    @Test
    public void test1() {
        CountOfSmallerNumber c = new CountOfSmallerNumber();
        int[] input = {5,2,6,1};
        List<Integer> answer = c.countSmaller(input);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(1);
        expected.add(0);

        for(int i =0; i < answer.size(); i++) {
            assertEquals(expected.get(i), answer.get(i));
        }
    }

    @Test
    public void test2() {
        CountOfSmallerNumber c = new CountOfSmallerNumber();
        int[] input = {-1};
        List<Integer> answer = c.countSmaller(input);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        for(int i =0; i < answer.size(); i++) {
            assertEquals(expected.get(i), answer.get(i));
        }
    }

    @Test
    public void test3() {
        CountOfSmallerNumber c = new CountOfSmallerNumber();
        int[] input = {-1, -1};
        List<Integer> answer = c.countSmaller(input);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);

        for(int i =0; i < answer.size(); i++) {
            assertEquals(expected.get(i), answer.get(i));
        }
    }

    @Test
    public void test4() {
        CountOfSmallerNumber c = new CountOfSmallerNumber();
        int[] input = {2,0,1};
        List<Integer> answer = c.countSmaller(input);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(0);
        expected.add(0);

        for(int i =0; i < answer.size(); i++) {
            assertEquals(expected.get(i), answer.get(i));
        }
    }
}
