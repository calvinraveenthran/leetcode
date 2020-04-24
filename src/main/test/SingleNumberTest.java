package main.test;
import static org.junit.Assert.assertEquals;
import main.java.SingleNumber;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void singleNumberTest() {

        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {1,1,2,2,3,3,4};
        assertEquals(4, singleNumber.singleNumber(nums));
    }
}
