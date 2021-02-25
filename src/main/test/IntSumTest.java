package main.test;
import main.java.IntSum;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntSumTest {

    @Test
    public void test1(){
        IntSum i = new IntSum();
        assertEquals(3, i.getSum(1,2));
    }
}
