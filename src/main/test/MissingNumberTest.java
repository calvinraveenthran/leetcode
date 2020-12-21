package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.MissingNumber;

public class MissingNumberTest {

    @Test
    public void test1() {

        MissingNumber mn = new MissingNumber();
        int[] input = {3,0,1};
        assertEquals(2, mn.missingNumber(input));
    }
}
