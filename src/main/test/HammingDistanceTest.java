package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.HammingDistance;

public class HammingDistanceTest {

    @Test
    public void test1() {
        HammingDistance hd = new HammingDistance();
        assertEquals(hd.hammingDistance(0b100, 0b10), 2);

    }
}
