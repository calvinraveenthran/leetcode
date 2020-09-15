package main.test;
import main.java.ValidBST;
import main.java.ValidBST.TreeNode;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ValidBSTTest {

    @Test
    public void test1(){
        ValidBST vbst = new ValidBST();
        int[] int_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        TreeNode node = vbst.buildTreeFromArray(int_array, 0, 15);
        vbst.inOrder(node);
        assertTrue(vbst.isValidBST(node));
    }

    @Test
    public void test2(){
        ValidBST vbst = new ValidBST();
        int[] int_array = {1,2,3,4,5,6,7,8,9,10,11,12,19,14,15,16};
        TreeNode node = vbst.buildTreeFromArray(int_array, 0, 15);
        vbst.inOrder(node);
        assertFalse(vbst.isValidBST(node));
    }
}
