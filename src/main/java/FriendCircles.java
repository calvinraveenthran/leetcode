package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FriendCircles {


    public static class Vertex {
        public int id;
        public List<Vertex> destinations;
        public boolean visited;

        public Vertex(int id){
            this.id = id;
            destinations = new ArrayList<>();
            visited = false;
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int answer = 0;
        HashMap<Integer, Vertex> vmap = new HashMap<>();

        for(int i = 0; i < isConnected.length; i++) {
            vmap.put(i, new Vertex(i));
        }

        for(int i = 0; i < isConnected.length; i++) {
            for(int j = 0; j < isConnected[0].length; j++) {
                if(i != j && isConnected[i][j] == 1) {
                    vmap.get(i).destinations.add(vmap.get(j));
                }
            }
        }


        for(int i = 0; i < isConnected.length; i++) {
            Vertex v = vmap.get(i);
            if(!v.visited) {
                answer = answer +1;
                visit(v);
            }
        }

        return answer;
    }

    public void visit(Vertex v) {

        if(v.visited){
            return;
        }

        v.visited = true;

        for(Vertex i : v.destinations) {
            visit(i);
        }
    }

}
