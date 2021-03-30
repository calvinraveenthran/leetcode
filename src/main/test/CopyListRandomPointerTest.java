package main.test;
import main.java.CopyListRandomPointer;
import main.java.CopyListRandomPointer.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class CopyListRandomPointerTest {

    @Test
    public void test1(){
        CopyListRandomPointer cL= new CopyListRandomPointer();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        c.next = null;
        a.random = null;
        b.random = a;
        c.random = b;

        Node a2 = cL.copyRandomList(a);

        assertEquals(a2.val, a.val);
        assertEquals(a2.next.val, b.val);
        assertEquals(a2.next.next.val, c.val);
        assertNull(a2.next.next.next);
        assertNull(a2.random);
        assertEquals(a2.next.random.val, a.val);
        assertEquals(a2.next.next.random.val, b.val);
    }
}
