package main.test;
import main.java.LowestCommonAncestor;
import main.java.LowestCommonAncestor.TreeNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class LowestCommonAncestorTest {

    @Test
    public void test1() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        LowestCommonAncestor lca = new LowestCommonAncestor();
        assertEquals(root.left, lca.lowestCommonAncestor(root, root.left, root.left.right.right));


    }
}
