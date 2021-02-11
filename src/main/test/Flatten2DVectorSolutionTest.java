package main.test;
import main.java.Flatten2DVectorSolution;
import org.junit.Test;
import static org.junit.Assert.*;

public class Flatten2DVectorSolutionTest {

    @Test
    public void test1(){
        int[][] input = {{1,2,3}, {4,5,6}, {7,8,9}};
        Flatten2DVectorSolution f = new Flatten2DVectorSolution(input);
        assertEquals(1, f.next());
        assertEquals(2, f.next());
        assertEquals(3, f.next());
        assertEquals(4, f.next());
        assertEquals(5, f.next());
        assertEquals(6, f.next());
        assertEquals(7, f.next());
        assertEquals(8, f.next());
        assertEquals(9, f.next());
    }

    @Test
    public void test2(){
        int[][] input = {{}};
        Flatten2DVectorSolution f = new Flatten2DVectorSolution(input);
        assertFalse(f.hasNext());
    }

}
