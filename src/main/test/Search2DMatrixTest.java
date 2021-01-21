package main.test;
import main.java.Search2DMatrix;
import org.junit.Test;
import static org.junit.Assert.*;


public class Search2DMatrixTest {

    @Test
    public void test1(){
        Search2DMatrix s = new Search2DMatrix();
        int[][] input = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        assertTrue(s.searchMatrix(input, 5));
    }

    @Test
    public void test2(){
        Search2DMatrix s = new Search2DMatrix();
        int[][] input = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        assertFalse(s.searchMatrix(input, 20));
    }
}
