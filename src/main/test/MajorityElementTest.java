package main.test;
import main.java.MajorityElement;
import org.junit.Test;
import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void test1(){
        MajorityElement m = new MajorityElement();
        int[] input = {2,2,1,1,1,2,2};
        assertEquals(2, m.majorityElement(input));
    }

}
