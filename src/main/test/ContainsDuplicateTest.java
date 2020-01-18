package main.test;
import main.java.ContainsDuplicate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        assertTrue(containsDuplicate.containsDuplicate(nums));
        int[] nums2 = {1};
        assertFalse(containsDuplicate.containsDuplicate(nums2));
    }
}
