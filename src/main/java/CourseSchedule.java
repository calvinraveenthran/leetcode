package main.java;

import java.util.*;

public class CourseSchedule {

    public static class Vertex {
        int id;
        int degree;
        List<Vertex> destList;

        public Vertex(int id){
            this.id = id;
            this.degree = 0;
            this.destList = new ArrayList<>();

        }
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, Vertex> vertexMap = new HashMap<>();

        for(int i =0; i < prerequisites.length; i++) {

            int src = prerequisites[i][1];
            int dest = prerequisites[i][0];

            if(vertexMap.get(src) == null){
                vertexMap.put(src, new Vertex(src));
            }

            if(vertexMap.get(dest) == null){
                vertexMap.put(dest, new Vertex(dest));
            }

            vertexMap.get(src).destList.add(vertexMap.get(dest));
            vertexMap.get(dest).degree = vertexMap.get(dest).degree + 1;
        }

        boolean haveZeroes = true;
        while(haveZeroes & !vertexMap.isEmpty()) {

            Vertex current = null;

            for(Vertex vertex : vertexMap.values()) {
                if(vertex.degree ==0) {
                    current = vertex;
                    break;
                }
            }

            if(current == null) {
                haveZeroes = false;
                continue;
            }

            vertexMap.remove(current.id);
            for (Vertex vertex : current.destList) {
                vertex.degree = vertex.degree - 1;
            }
        }

        if(!haveZeroes && !vertexMap.isEmpty()) {
            return false;
        }

        return true;
    }
}
