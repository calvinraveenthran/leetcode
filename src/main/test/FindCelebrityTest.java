package main.test;
import main.java.FindCelebrity;
import org.junit.Test;
import static org.junit.Assert.*;


public class FindCelebrityTest {

    @Test
    public void test1(){
        int[][] helper = {{1,1,0},{0,1,0},{1,1,1}};
        FindCelebrity f = new FindCelebrity(helper);
        assertEquals(1, f.findCelebrity(3));
    }

    @Test
    public void test2(){
        int[][] helper = {{1,0,1},{1,1,0},{0,1,1}};
        FindCelebrity f = new FindCelebrity(helper);
        assertEquals(-1, f.findCelebrity(3));
    }
}
