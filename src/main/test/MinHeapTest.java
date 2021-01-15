package main.test;

import main.java.MinHeap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {

    @Test
    public void test1(){
        MinHeap m = new MinHeap(15);
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

        assertEquals(1, m.extractMin());
        assertEquals(2, m.extractMin());
        assertEquals(4, m.extractMin());
        assertEquals(5, m.extractMin());
        assertEquals(6, m.extractMin());
        assertEquals(7, m.extractMin());
        assertEquals(8, m.extractMin());
        assertEquals(9, m.extractMin());
        assertEquals(10, m.extractMin());
        assertEquals(13, m.extractMin());
        assertEquals(17, m.extractMin());
    }
}
