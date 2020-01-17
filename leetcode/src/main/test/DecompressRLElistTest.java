package main.test;
import main.java.DecompressRLElist;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecompressRLElistTest {

    @Test
    public void testConcatenate() {
        DecompressRLElist decompressRLElist = new DecompressRLElist();
        int[] first = {1,2,3,4};
        int[] result = decompressRLElist.decompressArray(first);
        int[] answer = {2,4,4,4};
        assertArrayEquals(answer, result);
    }
}
