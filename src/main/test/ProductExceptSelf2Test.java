package main.test;

import main.java.ProductExceptSelf2;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductExceptSelf2Test {

    @Test
    public void productExceptSelfTest() {
        ProductExceptSelf2 productExceptSelf2 = new ProductExceptSelf2();
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};
        assertArrayEquals(output, productExceptSelf2.productExceptSelf(nums));

        int[] nums2 = {1,2};
        int[] output2 = {2,1};
        assertArrayEquals(output2, productExceptSelf2.productExceptSelf(nums2));

    }

    @Test
    public void productExceptSelf2Test() {
        ProductExceptSelf2 productExceptSelf2 = new ProductExceptSelf2();
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};
        assertArrayEquals(output, productExceptSelf2.productExceptSelf(nums));

        int[] nums2 = {1,2};
        int[] output2 = {2,1};
        assertArrayEquals(output2, productExceptSelf2.productExceptSelf(nums2));

    }
}
