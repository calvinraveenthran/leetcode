package main.test;
import main.java.SortColors;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortColorsTest {
    @Test
    public void test1(){
        int[] expected = {0,0,1,1,2,2};
        int [] nums = {2,0,2,1,1,0};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

}
