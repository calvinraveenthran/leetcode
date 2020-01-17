package main.test;
import main.java.DefangingIp;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefangingIpTest {

    @Test
    public void testConcatenate() {
        DefangingIp defangingIp = new DefangingIp();
        String result = defangingIp.replaceString("1.1.1.1", "[.]", '.');
        String result2 = defangingIp.replaceString("255.100.50.0", "[.]", '.');
        assertEquals("1[.]1[.]1[.]1", result);
        assertEquals("255[.]100[.]50[.]0", result2);
    }
}
