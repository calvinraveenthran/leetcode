package main.test;
import main.java.HappyNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void test(){
        HappyNumber h = new HappyNumber();
        assertTrue(h.isHappy(19));
    }
}
