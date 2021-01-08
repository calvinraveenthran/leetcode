package main.test;
import main.java.NumberOfIslands;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    @Test
    public void test1(){
        NumberOfIslands nI = new NumberOfIslands();
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        assertEquals(1, nI.numIslands(grid));
    }

    @Test
    public void test2(){
        NumberOfIslands nI = new NumberOfIslands();
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        assertEquals(3, nI.numIslands(grid));
    }

    @Test
    public void test3(){
        NumberOfIslands nI = new NumberOfIslands();
        char[][] grid = {{'1'},{'1'}};
        assertEquals(1, nI.numIslands(grid));
    }


}
