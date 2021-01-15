package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.MaxHeap;

public class MaxHeapTest {

    @Test
    public void test1(){
        MaxHeap m = new MaxHeap(15);
        m.insert(10);
        m.insert(9);
        m.insert(8);
        m.insert(7);
        m.insert(6);
        m.insert(5);
        m.insert(4);
        m.insert(13);
        m.insert(2);
        m.insert(1);
        m.insert(17);

        assertEquals(17, m.extractMax());
        assertEquals(13, m.extractMax());
        assertEquals(10, m.extractMax());
        assertEquals(9, m.extractMax());
        assertEquals(8, m.extractMax());
        assertEquals(7, m.extractMax());
        assertEquals(6, m.extractMax());
        assertEquals(5, m.extractMax());
        assertEquals(4, m.extractMax());
        assertEquals(2, m.extractMax());
        assertEquals(1, m.extractMax());
    }


}
