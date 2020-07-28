package main.test;
import main.java.PlusOne;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void plusOneTest1() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1,2,3,4};
        int[] answer = {1,2,3,5};
        Assert.assertArrayEquals(answer, plusOne.plusOne(digits));
    }

    @Test
    public void plusOneTest2() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1};
        int[] answer = {2};
        Assert.assertArrayEquals(answer, plusOne.plusOne(digits));
    }

    @Test
    public void plusOneTest3() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {9,9,9,9,9,9};
        int[] answer = {1,0,0,0,0,0,0};
        Assert.assertArrayEquals(answer, plusOne.plusOne(digits));
    }


}
