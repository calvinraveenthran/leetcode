package main.test;
import main.java.FourSum2;
import org.junit.Test;
import static org.junit.Assert.*;

public class FourSum2Test {

    @Test
    public void test1() {
        int[] a = {1,2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        FourSum2 f = new FourSum2();

        assertEquals(2, f.fourSumCount(a,b,c,d));
    }

}
