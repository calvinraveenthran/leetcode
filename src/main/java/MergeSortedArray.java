package main.java;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int m_end = m-1;
        int n_end = n-1;
        int a_end = m+n -1;

        while(n_end >= 0 && m_end >= 0) {

            if(nums1[m_end] > nums2[n_end]) {
                nums1[a_end] = nums1[m_end];
                m_end = m_end -1;
            } else {
                nums1[a_end] = nums2[n_end];
                n_end = n_end -1;
            }

            a_end = a_end -1;
        }

        if(n_end >=0){
            System.arraycopy(nums2,  0, nums1, 0, n_end +1);
        }
    }
}
