package main.test;
import main.java.FriendCircles;
import org.junit.Test;
import static org.junit.Assert.*;

public class FriendCirclesTest {

    @Test
    public void test1(){
        FriendCircles fc = new FriendCircles();
        int [][] input = {{1,0,0},{0,1,0},{0,0,1}};
        assertEquals(3, fc.findCircleNum(input));
    }

}
