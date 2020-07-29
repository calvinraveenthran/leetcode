package main.test;

import main.java.IntersectionOfTwoArrays2;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoArrays2Test {

    @Test
    public void test1() {

        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] answer = {2,2};
        int[] result = intersectionOfTwoArrays2.intersect1(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(answer, result);
    }

    @Test
    public void test2() {

        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] answer = {4,9};
        int[] result = intersectionOfTwoArrays2.intersect1(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(answer, result);
    }

    @Test
    public void test3() {

        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] answer = {2,2};
        int[] result = intersectionOfTwoArrays2.intersect2(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(answer, result);
    }

    @Test
    public void test4() {

        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] answer = {4,9};
        int[] result = intersectionOfTwoArrays2.intersect2(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(answer, result);
    }

    @Test
    public void test5() {

        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};

        int[] answer = {4,6};
        int[] result = intersectionOfTwoArrays2.intersect2(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(answer, result);
    }
}
