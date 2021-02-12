package main.test;
import main.java.SerDesTree;
import main.java.SerDesTree.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class SerDesTreeTest {

    @Test
    public void test1(){
        SerDesTree bt = new SerDesTree();
        int[] expected = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);


        TreeNode root2 = bt.deserialize(bt.serialize(root));

        assertEquals(root2.left.val, root.left.val);
        assertEquals(root2.left.left.val, root.left.left.val);
        assertEquals(root2.left.left.left.val, root.left.left.left.val);
        assertEquals(root2.left.left.right.val, root.left.left.right.val);
        assertEquals(root2.left.right.val, root.left.right.val);
        assertEquals(root2.left.right.left.val, root.left.right.left.val);
        assertEquals(root2.left.right.right.val, root.left.right.right.val);
        assertEquals(root2.right.val, root.right.val);
        assertEquals(root2.right.left.val, root.right.left.val);
        assertEquals(root2.right.left.left.val, root.right.left.left.val);
        assertEquals(root2.right.left.right.val, root.right.left.right.val);
        assertEquals(root2.right.right.val, root.right.right.val);
        assertEquals(root2.right.right.left.val, root.right.right.left.val);
        assertEquals(root2.right.right.right.val, root.right.right.right.val);
    }
}
