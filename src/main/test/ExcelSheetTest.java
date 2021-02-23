package main.test;
import main.java.ExcelSheet;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExcelSheetTest {

    @Test
    public void test1() {
        ExcelSheet e = new ExcelSheet();
        assertEquals(26, e.titleToNumber("Z"));
    }

    @Test
    public void test2() {
        ExcelSheet e = new ExcelSheet();
        assertEquals(52, e.titleToNumber("AZ"));
    }

    @Test
    public void test3() {
        ExcelSheet e = new ExcelSheet();
        assertEquals(2147483647, e.titleToNumber("FXSHRXW"));
    }


}
