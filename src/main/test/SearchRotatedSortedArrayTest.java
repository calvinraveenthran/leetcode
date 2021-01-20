package main.test;
import main.java.SearchRotatedSortedArray;
import org.junit.Test;
import static org.junit.Assert.*;


public class SearchRotatedSortedArrayTest {

    @Test
    public void test1(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {10,11,12,13,14,15,16,17,19,19,0,1,2,3,4,5,6,7,8};
        int answer = s.findMin(input);
        assertEquals(10, answer);
    }

    @Test
    public void test2(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {19,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int answer = s.findMin(input);
        assertEquals(1, answer);
    }

    @Test
    public void test3(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,0};
        int answer = s.findMin(input);
        assertEquals(19, answer);
    }

    @Test
    public void test4(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int answer = s.binarySearch(input,0, 0, 19);
        assertEquals(0, answer);
        answer = s.binarySearch(input,19, 0, 19);
        assertEquals(19, answer);
        answer = s.binarySearch(input,14, 0, 19);
        assertEquals(14, answer);
        answer = s.binarySearch(input,6, 0, 19);
        assertEquals(6, answer);
        answer = s.binarySearch(input,2, 0, 19);
        assertEquals(2, answer);
    }

    @Test
    public void test5(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {3,1};
        int answer = s.search(input,0);
        assertEquals(-1, answer);
    }

    @Test
    public void test6(){
        SearchRotatedSortedArray s = new SearchRotatedSortedArray();
        int[] input = {4,5,6,7,0,1,2};
        int answer = s.search(input,0);
        assertEquals(4, answer);
    }
}
