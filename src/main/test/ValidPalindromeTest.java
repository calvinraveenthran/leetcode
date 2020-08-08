package main.test;
import main.java.ValidPalindrome;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        ValidPalindrome vp = new ValidPalindrome();
        String s ="A man, a plan, a canal: Panama";
        assertTrue(vp.isPalindrome(s));
    }

    @Test
    public void test2() {
        ValidPalindrome vp = new ValidPalindrome();
        String s ="race a car";
        assertFalse(vp.isPalindrome(s));
    }
}
