package main.test;
import main.java.TopKFreqElements;
import org.junit.Test;
import static org.junit.Assert.*;

public class TopKFreqElementsTest {
    @Test
    public void test1() {
        int[] nums = {1,1,1,2,2,3};
        int[] expected = {1,2};
        TopKFreqElements t = new TopKFreqElements();
        assertArrayEquals(expected, t.topKFrequent(nums,2));
    }
}
