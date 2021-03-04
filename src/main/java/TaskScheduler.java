package main.java;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class TaskScheduler {

    public static class Node{
        char c;
        int count;

        public Node(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public class NodeComparator implements Comparator<Node> {
        public int compare(Node a, Node b) {
            if (a.count < b.count)
                return 1;
            else if (a.count > b.count)
                return -1;
            return 0;
        }
    }

    public int leastInterval(char[] tasks, int n) {


        if(n==0){
            return tasks.length;
        }

        Map<Character, Integer> counts = new String(tasks).chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
        PriorityQueue<Node> heap = new PriorityQueue<>(counts.size(), new NodeComparator());
        Map<Character, Long> timer = new HashMap<>();
        long time = 0;

        for(Character c: counts.keySet()) {
            heap.add(new Node(c, counts.get(c)));
        }

        while(!heap.isEmpty()){

            Node adjust = null;

            for(Node node: heap) {
                if(timer.get(node.c) == null || timer.get(node.c) < time){
                    adjust = node;
                    break;
                }
            }

            if(adjust == null){
                time++;
                continue;
            }

            timer.put(adjust.c, time + n);
            heap.remove(adjust);
            adjust.count = adjust.count -1;

            if(adjust.count > 0){
                heap.add(adjust);
            }
            time++;
        }

        long max_time = -1;
        for(Character c: timer.keySet()) {
                if(timer.get(c) > max_time){
                    max_time = timer.get(c);
                }
        }

        return (int) max_time - (n-1);
    }
}
