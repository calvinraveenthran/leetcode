package main.test;
import main.java.RandomizedSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizedSetTest {

    @Test
    public void test1(){
        RandomizedSet rs = new RandomizedSet();
        assertTrue(rs.insert(1));
        assertFalse(rs.remove(2));
        assertTrue(rs.insert(2));
        assertTrue(rs.getRandom() > 0);
        assertTrue(rs.remove(1));
        assertFalse(rs.insert(2));
        assertEquals(rs.getRandom(), 2);
    }

}
