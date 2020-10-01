package main.test;

import main.java.SymmetricTree;
import main.java.SymmetricTree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SymmetricTreeTest {

    @Test
    public void test1(){
        SymmetricTree tree = new SymmetricTree();
        int[] int_array = {3,2,4,1,4,2,3};
        TreeNode node = tree.buildTreeFromArray(int_array, 0,6);
        tree.inOrder(node);
        assertTrue(tree.isSymmetric(node));
    }
}
