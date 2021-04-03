package main.java;
import java.util.*;

public class Dijkstra {

    public static class Node {

        public String name;
        public Node predecessor;
        public int distance = Integer.MAX_VALUE;
        public Map<Node, Integer> edges = new HashMap<>();

        public void addEdge(Node dest, int weight) {
            edges.put(dest, weight);
        }

        public Node(String name) {
            this.name = name;
        }
    }

    public static class NodeComparator implements Comparator<Node> {
        public int compare(Node a, Node b) {
            if (a.distance > b.distance)
                return 1;
            else if (a.distance < b.distance)
                return -1;
            return 0;
        }
    }

    public static class Graph {
        public Set<Node> nodes = new HashSet<>();

        public void addNode(Node nodeA) {
            nodes.add(nodeA);
        }
    }

    public static void dijkstra(Graph graph, Node source) {
        source.distance = 0;

        Set<Node> settled = new HashSet<>();
        PriorityQueue<Node> unsettled = new PriorityQueue<>(1, new NodeComparator());
        unsettled.add(source);

        while (unsettled.size() != 0) {
            Node curr = unsettled.poll();
            for (Map.Entry < Node, Integer> edge: curr.edges.entrySet()) {
                Node dest = edge.getKey();
                Integer weight = edge.getValue();
                if (!settled.contains(dest)) {
                    if (curr.distance + weight < dest.distance) {
                        dest.distance = curr.distance + weight;
                        dest.predecessor = curr;
                    }
                    unsettled.add(dest);
                }
            }
            settled.add(curr);
        }
    }
}
