package main.test;
import main.java.UniquePaths;
import org.junit.Test;
import static org.junit.Assert.*;

public class UniquePathsTest {

    @Test
    public void test1(){
        UniquePaths u = new UniquePaths();
        assertEquals(6, u.uniquePaths(3,3));
    }
}
