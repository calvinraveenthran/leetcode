package main.test;
import main.java.FirstMissingPositive;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstMissingPositiveTest {

    @Test
    public void test1() {
        FirstMissingPositive f = new FirstMissingPositive();
        int[] input = {3,4,-1,1};
        assertEquals(2, f.firstMissingPositive(input));
    }
}
