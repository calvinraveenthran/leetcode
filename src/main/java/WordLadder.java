package main.java;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordLadder {

    public static class Vertex {
        public String id;
        public int distance;
        Vertex predecessor;

        public Vertex(String id, int distance){
            this.id = id;
            this.distance = distance;
            this.predecessor = null;
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

        public List<Vertex> vertices;
        public List<Edge> edges;

        public Graph() {
            vertices = new ArrayList<>();
            edges = new ArrayList<>();
        }

        public Vertex createVertex(String id, int distance) {
            Vertex vertex = new Vertex(id, distance);
            vertices.add(vertex);
            return vertex;
        }

        public void createEdge(Vertex src, Vertex dest, int weight) {
            Edge edge = new Edge(src, dest, weight);
            edges.add(edge);
        }

        public void shortestPath() {

            HashMap<Vertex, Integer> finished = new HashMap();


            for (int i = 0; i < vertices.size(); i++) {

                for (int l= 0; l < vertices.size(); l++) {
                    finished.put(vertices.get(l), vertices.get(l).distance);
                }

                for (Edge edge : edges) {
                    if (edge.src.distance != Integer.MAX_VALUE && edge.dest.distance > edge.src.distance + edge.weight)
                    {
                        edge.dest.distance = edge.src.distance + edge.weight;
                        edge.dest.predecessor = edge.src;
                    }
                }

                boolean done = true;
                for (int l= 0; l < vertices.size(); l++) {
                    if(finished.get(vertices.get(l)) != vertices.get(l).distance) {
                        done = false;
                        break;
                    }
                }

                if(done){
                    return;
                }
            }
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord) || beginWord.equals(endWord)) {
            return 0;
        }

        Graph graph = new Graph();
        Vertex begin = null;
        Vertex end = null;

        if(!wordList.contains(beginWord))
            wordList.add(beginWord);

        for (String s : wordList) {
            if (s.equals(beginWord))
                begin = graph.createVertex(s, 0);
            else if(s.equals(endWord))
                end = graph.createVertex(s, Integer.MAX_VALUE);
            else
                graph.createVertex(s, Integer.MAX_VALUE);
        }

        for(int i = 0; i < graph.vertices.size(); i++) {
            for(int j=i +1; j < graph.vertices.size(); j++) {

                int err = 0;
                for(int k =0; k < wordList.get(i).length(); k++) {
                    if(wordList.get(i).charAt(k) != wordList.get(j).charAt(k)){
                        err++;
                    }
                }

                if(err == 1){
                    graph.createEdge(graph.vertices.get(i), graph.vertices.get(j), 1);
                    graph.createEdge(graph.vertices.get(j), graph.vertices.get(i), 1);
                }
            }
        }

        graph.shortestPath();
        if(end.distance == Integer.MAX_VALUE) {
            return 0;
        }

        return end.distance +1;
    }
}
