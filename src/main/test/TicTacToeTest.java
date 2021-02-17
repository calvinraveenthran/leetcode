package main.test;
import main.java.TicTacToe;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void test1(){
        TicTacToe t = new TicTacToe(3);

        assertEquals(t.move(0,0,1), 0);
        assertEquals(t.move(0,2,2), 0);
        assertEquals(t.move(2,2,1), 0);
        assertEquals(t.move(1,1,2), 0);
        assertEquals(t.move(2,0,1), 0);
        assertEquals(t.move(1,0,2), 0);
        assertEquals(t.move(2,1,1), 1);
    }
}
