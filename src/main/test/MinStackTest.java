package main.test;
import main.java.MinStack;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void test1() {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(2);
        ms.push(5);
        ms.push(4);
        ms.push(1);
        assertEquals(ms.getMin(), 1);
        assertEquals(ms.top(), 1);
        ms.pop();
        assertEquals(ms.getMin(), 2);
    }
}
