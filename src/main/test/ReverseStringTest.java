package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.ReverseString;

public class ReverseStringTest {

    @Test
    public void test1() {

        ReverseString rs = new ReverseString();
        char[] input = {'h','e','l','l','o'};
        char[] output = {'o','l','l','e','h'};
        rs.reverseString(input);
        assertArrayEquals(output, input);
    }

}
