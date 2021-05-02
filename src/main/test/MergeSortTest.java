package main.test;
import main.java.MergeSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void test1(){

        MergeSort ms = new MergeSort();
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        ms.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }
}
