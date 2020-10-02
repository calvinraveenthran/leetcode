package main.test;

import main.java.BinaryTreeLevelOrderTraversal;
import main.java.BinaryTreeLevelOrderTraversal.TreeNode;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertArrayEquals;


public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void test1(){
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
        int[] int_array = {3,2,4,1,4,2,3};
        TreeNode node = tree.buildTreeFromArray(int_array, 0,6);

        List<List<Integer>> answerList = tree.levelOrder(node);

        int[] firstAns = new int[answerList.get(0).size()];
        for (int i = 0; i < firstAns.length; i++) {
            firstAns[i] = answerList.get(0).get(i);
        }

        int[] secondAns = new int[answerList.get(1).size()];
        for (int i = 0; i < secondAns.length; i++) {
            secondAns[i] = answerList.get(1).get(i);
        }

        int[] thirdAns = new int[answerList.get(2).size()];
        for (int i = 0; i < thirdAns.length; i++) {
            thirdAns[i] = answerList.get(2).get(i);
        }

        int[] first = {1};
        int[] second = {2,2};
        int [] third = {3,4,4,3};

        assertArrayEquals(firstAns, first);
        assertArrayEquals(secondAns, second);
        assertArrayEquals(thirdAns, third);
    }
}
