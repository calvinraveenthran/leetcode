package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void test1() {
        PascalsTriangle pt = new PascalsTriangle();

        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);


        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);

        List<Integer> third = new ArrayList<>();
        third.add(1);
        third.add(2);
        third.add(1);

        List<Integer> fourth = new ArrayList<>();
        fourth.add(1);
        fourth.add(3);
        fourth.add(3);
        fourth.add(1);

        expected.add(first);
        expected.add(second);
        expected.add(third);
        expected.add(fourth);

        List<List<Integer>> result = pt.generate(4);


        for(int i=0; i< 4; i++) {
            assertArrayEquals(expected.get(i).toArray(), result.get(i).toArray());
        }
    }
}
