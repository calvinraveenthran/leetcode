package main.test;
import main.java.Strstr;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrstrTest {

  @Test
  public void test1() {
      Strstr str = new Strstr();
      assertEquals(2, str.strStr("hello", "ll"));
  }

    @Test
    public void test2() {
        Strstr str = new Strstr();
        assertEquals(-1, str.strStr("aaaaa", "bba"));
    }


}
