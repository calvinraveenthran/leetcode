package main.test;

import main.java.ProductExceptSelf;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductExceptSelfTest {

    @Test
    public void productExceptSelfTest() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};
        assertArrayEquals(output, productExceptSelf.productExceptSelf(nums));

        int[] nums2 = {1,2};
        int[] output2 = {2,1};
        assertArrayEquals(output2, productExceptSelf.productExceptSelf(nums2));

    }

    @Test
    public void productExceptSelf2Test() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};
        assertArrayEquals(output, productExceptSelf.productExceptSelf2(nums));

        int[] nums2 = {1,2};
        int[] output2 = {2,1};
        assertArrayEquals(output2, productExceptSelf.productExceptSelf2(nums2));

    }
}
