package main.java;
import java.util.*;

public class BellmanFord {

    public static class Vertex {
        public int id;
        public int distance;
        Vertex predecessor;

        public Vertex(int id, int distance){
            this.id = id;
            this.distance = distance;
        }
    }

    public static class Edge {
        Vertex src;
        Vertex dest;
        int weight;

        public Edge(Vertex src, Vertex dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static class Graph {

        public Vertex[] vertices;
        public Edge[] edges;
        public int v, e;

        public Graph(int vSize, int eSize) {
            vertices = new Vertex[vSize];
            edges = new Edge[eSize];
            v = e = 0;
        }

        public Vertex createVertex(int id, int distance) {
            Vertex vertex = new Vertex(id, distance);
            vertices[v]= vertex;
            v++;
            return vertex;
        }

        public Edge createEdge(Vertex src, Vertex dest, int weight) {
            Edge edge = new Edge(src, dest, weight);
            edges[e] = edge;
            e++;
            return edge;
        }
    }

    public void shortestPath(Graph graph, Vertex source) {

        for(int i = 0; i < graph.vertices.length; i++) {
            graph.vertices[i].distance = Integer.MAX_VALUE;
        }
        source.distance = 0;
        source.predecessor = null;

        for(int i =0; i < graph.vertices.length; i++) {
            for(int j =0; j < graph.edges.length; j++) {
                if(graph.edges[j].src.distance != Integer.MAX_VALUE &&
                        graph.edges[j].dest.distance > graph.edges[j].src.distance + graph.edges[j].weight) {
                    graph.edges[j].dest.distance = graph.edges[j].src.distance + graph.edges[j].weight;
                    graph.edges[j].dest.predecessor = graph.edges[j].src;
                }
            }
        }

        for(int j =0; j < graph.edges.length; j++) {
            if(graph.edges[j].dest.distance > graph.edges[j].src.distance + graph.edges[j].weight) {
                throw new IllegalArgumentException("Negative cycle found");
            }
        }

        return;
    }
}
