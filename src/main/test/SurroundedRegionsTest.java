package main.test;
import main.java.SurroundedRegions;
import org.junit.Test;
import static org.junit.Assert.*;

public class SurroundedRegionsTest {

    @Test
    public void test1() {
        SurroundedRegions s = new SurroundedRegions();
        char[][] input = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] expected = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        s.solve(input);

        for(int i =0; i < input.length; i++){
            for(int j =0; j< input[0].length; j++) {
                assertEquals(expected[i][j], input[i][j]);
            }
        }
    }


}
