package main.test;
import main.java.SetMatrixZeroes;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SetMatrixZeroesTest {

    @Test
    public void test1() {
        int[][] test = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] answer = {{1,0,1},{0,0,0},{1,0,1}};
        SetMatrixZeroes smz = new SetMatrixZeroes();
        smz.setZeroes2(test);

        assertArrayEquals(answer[0], test[0]);
        assertArrayEquals(answer[1], test[1]);
        assertArrayEquals(answer[2], test[2]);
    }
}
