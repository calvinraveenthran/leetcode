package main.test;
import main.java.BellmanFord;
import main.java.BellmanFord.*;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class BellmanFordTest {

    @Test
    public void test1(){
        Graph graph = new Graph(6,8);

        Vertex vertexA = graph.createVertex(1, 0);
        Vertex vertexB = graph.createVertex(2, 0);
        Vertex vertexC = graph.createVertex(3, 0);
        Vertex vertexD = graph.createVertex(4, 0);
        Vertex vertexE = graph.createVertex(5, 0);
        Vertex vertexF = graph.createVertex(6, 0);

        graph.createEdge(vertexA, vertexB, 10);
        graph.createEdge(vertexA, vertexC, 15);

        graph.createEdge(vertexB, vertexD, 12);
        graph.createEdge(vertexB, vertexF, 15);

        graph.createEdge(vertexC, vertexE, 10);

        graph.createEdge(vertexD, vertexE, 2);
        graph.createEdge(vertexD, vertexF, 1);

        graph.createEdge(vertexF, vertexE, 5);

        BellmanFord bf = new BellmanFord();
        bf.shortestPath(graph, vertexA);

        assertEquals(10, vertexB.distance);
        assertEquals(15, vertexC.distance);
        assertEquals(22, vertexD.distance);
        assertEquals(24, vertexE.distance);
        assertEquals(23, vertexF.distance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        Graph graph = new Graph(4,4);

        Vertex vertexA = graph.createVertex(1, 0);
        Vertex vertexB = graph.createVertex(2, 0);
        Vertex vertexC = graph.createVertex(3, 0);
        Vertex vertexD = graph.createVertex(4, 0);

        graph.createEdge(vertexA, vertexB, 1);
        graph.createEdge(vertexB, vertexC, -1);
        graph.createEdge(vertexC, vertexD, -1);
        graph.createEdge(vertexD, vertexA, -1);

        BellmanFord bf = new BellmanFord();
        bf.shortestPath(graph, vertexA);
    }



}
