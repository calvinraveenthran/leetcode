package main.test;
import main.java.ValidAnagram;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void test1() {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram", t = "nagaram";
        assertTrue(va.isAnagram(s, t));
    }

    @Test
    public void test2() {
        ValidAnagram va = new ValidAnagram();
        String s = "car", t = "rat";
        assertFalse(va.isAnagram(s, t));
    }

}
