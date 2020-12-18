package main.test;
import main.java.HammingWeight;
import org.junit.Test;
import static org.junit.Assert.*;

public class HammingWeightTest {

    @Test
    public void test1() {
        HammingWeight hw = new HammingWeight();
        int test = 0b00000000000000000000000000001011;
        assertEquals(3, hw.hammingWeight(test));
    }
}
