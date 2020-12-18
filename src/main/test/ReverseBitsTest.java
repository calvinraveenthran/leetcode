package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.ReverseBits;

public class ReverseBitsTest {

    @Test
    public void test1() {
        ReverseBits rb = new ReverseBits();
        assertEquals(rb.reverseBits(0b00000010100101000001111010011100), 0b00111001011110000010100101000000);

    }
}
