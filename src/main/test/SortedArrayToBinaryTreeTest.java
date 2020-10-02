package main.test;

import main.java.SortedArrayToBinaryTree;
import main.java.SortedArrayToBinaryTree.TreeNode;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;


public class SortedArrayToBinaryTreeTest {

    @Test
    public void test1(){
        SortedArrayToBinaryTree st = new SortedArrayToBinaryTree();
        int[] int_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        TreeNode node = st.buildTreeFromArray(int_array, 0, 15);
        ArrayList<Integer> arrayList = new ArrayList<>();
        st.inOrder(node, arrayList);


        int[] firstAns = new int[arrayList.size()];
        for (int i = 0; i < firstAns.length; i++) {
            firstAns[i] = arrayList.get(i);
        }


        assertArrayEquals(int_array, firstAns);
    }
}
