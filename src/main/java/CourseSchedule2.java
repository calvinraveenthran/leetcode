package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseSchedule2 {

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

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        HashMap<Integer, Vertex> vertexMap = new HashMap<>();
        int[] answer = new int[numCourses];
        int ci = 0;

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

        for(int i = 0; i < numCourses; i++) {
            if(vertexMap.get(i) == null){
                answer[ci] = i;
                ci++;
            }
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

            answer[ci] = current.id;
            ci++;
        }

        if(!haveZeroes && !vertexMap.isEmpty()) {
            return new int[]{};
        }

        return answer;
    }
}
