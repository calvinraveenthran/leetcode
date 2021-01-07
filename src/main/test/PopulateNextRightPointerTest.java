package main.test;
import main.java.PopulateNextRightPointer;
import main.java.PopulateNextRightPointer.Node;

import org.junit.*;
import static org.junit.Assert.*;

public class PopulateNextRightPointerTest {

    @Test
    public void test1(){

        PopulateNextRightPointer pt = new PopulateNextRightPointer();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        root = pt.connect(root);
        assertEquals(null, root.next);
        assertEquals(root.right, root.left.next);
        assertEquals(root.left.right, root.left.left.next);
        assertEquals(root.right.left, root.left.right.next);
        assertEquals(null, root.right.next);
        assertEquals(root.right.right, root.right.left.next);
        assertEquals(null, root.right.right.next);
    }
}
