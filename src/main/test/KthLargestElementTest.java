package main.test;
import main.java.KthLargestElement;
import org.junit.Test;
import static org.junit.Assert.*;

public class KthLargestElementTest {
    @Test
    public void test1(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        KthLargestElement k = new KthLargestElement();
        assertEquals(4,k.findKthLargest(nums, 4) );
    }
}
