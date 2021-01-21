package main.java;

import java.util.Arrays;
import java.util.*;

public class MeetingRooms2 {

    public static class MinHeap{

        int[] heap;
        int size;
        int maxsize;

        public MinHeap(int maxsize){
            this.maxsize =  maxsize;
            this.heap= new int[maxsize +1];
            this.heap[0] = Integer.MIN_VALUE;
            this.size = 0;
        }

        public int parent(int loc) {
            return loc/2;
        }

        public int leftChild(int loc) {
            return 2*loc;
        }

        public int rightChild(int loc) {
            return (2*loc) +1;
        }

        public boolean isLeaf(int loc) {
            return ( (loc > (size /2)) && (loc <= size ));
        }

        public void swap(int parent, int child) {
            int temp = this.heap[parent];
            this.heap[parent] = this.heap[child];
            this.heap[child] = temp;
        }

        private void heapifyUp(int pos){
            int temp = heap[pos];
            while(pos > 0 && temp < heap[parent(pos)]) {
                heap[pos] = heap[parent(pos)];
                pos = parent(pos);
            }
            heap[pos] = temp;
        }

        private void downHeapify(int pos) {
            if(pos > (size/2) && pos <= size){
                return;
            }

            if(heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {

                if(heap[leftChild(pos)] < heap[rightChild(pos)]){
                    swap(pos, leftChild(pos));
                    downHeapify(leftChild(pos));
                } else{
                    swap(pos, rightChild(pos));
                    downHeapify(rightChild(pos));
                }
            }
        }

        public void insert(int element){
            size += 1;
            heap[size] = element;
            heapifyUp(size);
        }

        public int extractMin() {
            if(size ==1) {
                int min = heap[1];
                heap[1] = 0;
                size = size-1;
                return min;
            }

            int min = heap[1];
            heap[1] = heap[size];
            size = size-1;
            downHeapify(1);
            return min;
        }

        public int peakMin() {
            return heap[1];
        }

    }

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        MinHeap endTimes = new MinHeap(intervals.length);

        int meetingRoomCount = 1;
        endTimes.insert(intervals[0][1]);

        for(int i=1; i < intervals.length; i++){
            if(intervals[i][0] < endTimes.peakMin()) {
                endTimes.insert(intervals[i][1]);
                meetingRoomCount += 1;
            } else {
                endTimes.extractMin();
                endTimes.insert(intervals[i][1]);
            }
        }

        return meetingRoomCount;
    }

    public int minMeetingRoomsPQ(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(intervals.length);

        int meetingRoomCount = 1;
        pq.add(intervals[0][1]);

        for(int i=1; i < intervals.length; i++){
            if(intervals[i][0] < pq.peek()) {
                pq.add(intervals[i][1]);
                meetingRoomCount += 1;
            } else {
                pq.remove();
                pq.add(intervals[i][1]);
            }
        }

        return meetingRoomCount;
    }
}
