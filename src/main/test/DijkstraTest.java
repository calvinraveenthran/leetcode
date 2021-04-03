package main.test;
import main.java.Dijkstra;
import main.java.Dijkstra.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DijkstraTest {

    @Test
    public void test1() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addEdge(nodeB, 10);
        nodeA.addEdge(nodeC, 15);

        nodeB.addEdge(nodeD, 12);
        nodeB.addEdge(nodeF, 15);

        nodeC.addEdge(nodeE, 10);

        nodeD.addEdge(nodeE, 2);
        nodeD.addEdge(nodeF, 1);

        nodeF.addEdge(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        Dijkstra.dijkstra(graph, nodeA);

        assertEquals(10, nodeB.distance);
        assertEquals(15, nodeC.distance);
        assertEquals(22, nodeD.distance);
        assertEquals(24, nodeE.distance);
        assertEquals(23, nodeF.distance);
    }
}
