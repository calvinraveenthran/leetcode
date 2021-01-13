package main.test;
import main.java.Permutations;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermutationsTest {


    @Test
    public void test1(){

        Permutations p = new Permutations();
        int[] test = {1,2,3};
        List<List<Integer>> answer = p.permute(test);

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> one_one = new ArrayList<>();
        one_one.add(1);
        one_one.add(2);
        one_one.add(3);
        expected.add(one_one);
        List<Integer> one_two = new ArrayList<>();
        one_two.add(1);
        one_two.add(3);
        one_two.add(2);
        expected.add(one_two);
        List<Integer> two_one = new ArrayList<>();
        two_one.add(2);
        two_one.add(1);
        two_one.add(3);
        expected.add(two_one);
        List<Integer> two_two = new ArrayList<>();
        two_two.add(2);
        two_two.add(3);
        two_two.add(1);
        expected.add(two_two);
        List<Integer> three_one = new ArrayList<>();
        three_one.add(3);
        three_one.add(1);
        three_one.add(2);
        expected.add(three_one);
        List<Integer> three_two = new ArrayList<>();
        three_two.add(3);
        three_two.add(2);
        three_two.add(1);
        expected.add(three_two);

        assertEquals(expected.size(), answer.size());
    }

}
