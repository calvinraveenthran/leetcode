package main.test;
import main.java.SearchRange;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchRangeTest {

    @Test
    public void test1(){
        SearchRange s = new SearchRange();
        int[] nums = {5,7,7,8,8,10};
        int[] answer = {3,4};
        assertArrayEquals(answer, s.searchRange(nums, 8));
    }

    @Test
    public void test2(){
        SearchRange s = new SearchRange();
        int[] nums = {5,7,7,8,8,10};
        int[] answer = {1,2};
        assertArrayEquals(answer, s.searchRange(nums, 7));
    }

    @Test
    public void test3(){
        SearchRange s = new SearchRange();
        int[] nums = {5,7,7,8,8,10};
        int[] answer = {0,0};
        assertArrayEquals(answer, s.searchRange(nums, 5));
    }

    @Test
    public void test4(){
        SearchRange s = new SearchRange();
        int[] nums = {5,7,7,8,8,10};
        int[] answer = {5,5};
        assertArrayEquals(answer, s.searchRange(nums, 10));
    }

    @Test
    public void test5(){
        SearchRange s = new SearchRange();
        int[] nums = {5,7,7,8,8,10};
        int[] answer = {-1,-1};
        assertArrayEquals(answer, s.searchRange(nums, 6));
    }

    @Test
    public void test6(){
        SearchRange s = new SearchRange();
        int[] nums = {};
        int[] answer = {-1,-1};
        assertArrayEquals(answer, s.searchRange(nums, 6));
    }
}
