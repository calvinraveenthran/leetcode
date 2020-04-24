package main.test;
import main.java.RotateArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void rorateArray1() {

        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5};
        int[] ans = {4,5,1,2,3};
        int k = 2;
        assertArrayEquals(ans, rotateArray.rotateArray(nums,k));
    }

    @Test
    public void rorateArray2() {

        RotateArray rotateArray = new RotateArray();
        int[] nums = {1};
        int[] ans = {1};
        int k = 2;
        assertArrayEquals(ans, rotateArray.rotateArray(nums,k));
    }

}
