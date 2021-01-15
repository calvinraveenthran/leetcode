package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFreqElements {

    public static class Node {
        int key;
        long freq;

        public Node(int key, long freq){
            this.key = key;
            this.freq = freq;
        }
    }

    public class NodeComparator implements Comparator<Node> {
        public int compare(Node one, Node two) {
            if (one.freq < two.freq)
                return 1;
            else if (one.freq > two.freq)
                return -1;
            return 0;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> nm = new HashMap<>();
        Map<Integer, Long> counts = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        PriorityQueue<Node> heap = new PriorityQueue<>(counts.size(), new NodeComparator());

        for(Map.Entry<Integer, Long> entry : counts.entrySet()) {
            heap.add(new Node(entry.getKey(), entry.getValue()));
        }

        int[] answer = new int[k];
        for(int i=0; i < k; i++) {
            answer[i] = heap.remove().key;
        }

        return answer;
    }
}
