package main.test;
import main.java.MergeSortedArray;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void test1() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] answer = {1,2,2,3,5,6};
        msa.merge(nums1, 3, nums2, 3);
        assertArrayEquals(answer, nums1);
    }

    @Test
    public void test2() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        int[] answer = {1,2,3,4,5,6};
        msa.merge(nums1, 3, nums2, 3);
        assertArrayEquals(answer, nums1);
    }

    @Test
    public void test3() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int[] answer = {1,2,3,4,5,6};
        msa.merge(nums1, 3, nums2, 3);
        assertArrayEquals(answer, nums1);
    }
}
