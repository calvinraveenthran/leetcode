package main.test;
import main.java.FindPeakElem;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindPeakElemTest {

    @Test
    public void test(){
        int[] arr = {1,2,3,1};
        assertEquals(2, new FindPeakElem().findPeakElement(arr));
    }
}
