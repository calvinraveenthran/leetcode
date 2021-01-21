package main.java;

public class MinHeap {

    private int[] heap;
    private int size;
    private int maxsize;

    public MinHeap(int size) {
        this.maxsize = size;
        this.size =0;
        this.heap = new int[this.maxsize +1];
        heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos/2;
    }

    private int leftChild(int pos) {
        return (pos*2);
    }

    private int rightChild(int pos) {
        return (pos*2) +1;
    }

    private void swap(int parent, int child) {
        int tmp;
        tmp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = tmp;
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

    private void heapifyUp(int pos){
        int temp = heap[pos];
        while(pos > 0 && temp < heap[parent(pos)]) {
            heap[pos] = heap[parent(pos)];
            pos = parent(pos);
        }
        heap[pos] = temp;
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
}
