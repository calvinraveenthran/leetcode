package main.test;
import main.java.MergeIntervals;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeIntervalsTest {

    @Test
    public void test1(){
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};

        int[][] answer = mi.merge(intervals);

        for(int i =0; i < expected.length; i++){
            assertEquals(expected[i][0], answer[i][0]);
            assertEquals(expected[i][1], answer[i][1]);
        }
    }

    @Test
    public void test2(){
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{1,4},{4,5}};
        int[][] expected = {{1,5}};

        int[][] answer = mi.merge(intervals);

        for(int i =0; i < expected.length; i++){
            assertEquals(expected[i][0], answer[i][0]);
            assertEquals(expected[i][1], answer[i][1]);
        }
    }

    @Test
    public void test3(){
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] expected = {{1,10}};

        int[][] answer = mi.merge(intervals);

        for(int i =0; i < expected.length; i++){
            assertEquals(expected[i][0], answer[i][0]);
            assertEquals(expected[i][1], answer[i][1]);
        }
    }

}
