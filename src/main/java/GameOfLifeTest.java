package main.java;
import main.java.GameOfLife;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void test1() {
        int[][] input = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] answer = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        GameOfLife g = new GameOfLife();
        g.gameOfLife(input);


        for(int i =0; i < input.length; i++) {
            assertArrayEquals(answer[i], input[i]);
        }
    }
}
