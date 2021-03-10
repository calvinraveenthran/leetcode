package main.test;
import main.java.FindDuplicate;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicateTest {

    @Test
    public void test1(){
        FindDuplicate f = new FindDuplicate();
        int[] input = {1,3,4,2,2};
        assertEquals(2, f.findDuplicate(input));
    }
}
