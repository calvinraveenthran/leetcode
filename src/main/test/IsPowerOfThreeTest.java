package main.test;
import main.java.IsPowerOfThree;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsPowerOfThreeTest {

    @Test
    public void test1() {
        IsPowerOfThree cp = new IsPowerOfThree();
        assertTrue(cp.isPowerOfThree(27));
    }
}
