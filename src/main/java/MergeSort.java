package main.java;

public class MergeSort {

    public void merge(int[] parent, int[] leftChild, int[] rightChild) {

        int p = 0;
        int l = 0;
        int r = 0;

        while(l < leftChild.length && r < rightChild.length) {
            if(leftChild[l] < rightChild[r]) {
                parent[p++] = leftChild[l++];
            } else{
                parent[p++] = rightChild[r++];
            }

        }

        while(l < leftChild.length){
            parent[p++] = leftChild[l++];
        }

        while(r < rightChild.length){
            parent[p++] = rightChild[r++];
        }
    }

    public void mergeSort(int[] input){

        if(input.length <= 1) {
            return;
        }

        int start = 0;
        int end = input.length;

        int mid = start + ((end - start)/2);

        int[] leftChild = new int[mid - start];
        int[] rightChild = new int[input.length - mid];

        System.arraycopy(input, 0, leftChild, 0, leftChild.length);
        System.arraycopy(input, mid, rightChild, 0, rightChild.length);

        mergeSort(leftChild);
        mergeSort(rightChild);

        merge(input, leftChild, rightChild);
    }
}
