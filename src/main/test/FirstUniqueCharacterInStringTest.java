package main.test;
import main.java.FirstUniqueCharacterInString;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstUniqueCharacterInStringTest {

    @Test
    public void test1() {
        FirstUniqueCharacterInString fs = new FirstUniqueCharacterInString();
        String input = "loveleetcode";
        assertEquals(2, fs.firstUniqChar(input));
    }

    @Test
    public void test2() {
        FirstUniqueCharacterInString fs = new FirstUniqueCharacterInString();
        String input = "leetcode";
        assertEquals(0, fs.firstUniqChar(input));
    }
}
