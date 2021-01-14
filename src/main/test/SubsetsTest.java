package main.test;
import main.java.Subsets;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubsetsTest {

    @Test
    public void test1(){
        int[] nums = {1,2,3,4,5,6};
        Subsets s = new Subsets();
        List<List<Integer>> answer = s.subsets(nums);
        assertEquals(64, answer.size());
    }
}
