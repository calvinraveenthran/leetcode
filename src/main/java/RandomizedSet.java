package main.java;

import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {

    int [] current_array;
    int size;
    HashMap<Integer, Integer> intpos;


    public RandomizedSet() {
        this.current_array = new int[100];
        this.size = 0;
        this.intpos = new HashMap<>();
    }

    public boolean insert(int val) {

        if(intpos.containsKey(val))
            return false;

        current_array[size] = val;
        intpos.put(val, size);
        size = size +1;

        if(size > current_array.length/2){
            int [] new_array = new int[current_array.length*2];
            System.arraycopy(current_array, 0, new_array, 0, size);
            current_array = new_array;
        }

        return true;
    }

    public boolean remove(int val) {

        if(!intpos.containsKey(val))
            return false;

        int position = intpos.get(val);
        current_array[position] = current_array[size -1];
        intpos.put(current_array[position], position);
        intpos.remove(val);
        size = size -1;

        return true;
    }

    public int getRandom() {
        return current_array[new Random().nextInt(size)];
    }
}
