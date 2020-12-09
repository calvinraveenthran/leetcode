package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer>  minList;


    public MinStack() {
        this.stack = new ArrayList<>();
        this.minList = new ArrayList<>();
    }

    public void push(int x) {
        this.stack.add(x);
        this.minList.add(x);
        Collections.sort(this.minList);
    }

    public void pop() {
        if(this.stack.size() > 0) {
            int value = this.stack.get(this.stack.size() -1);
            this.stack.remove(this.stack.size() -1);

            for (int i = 0; i <  this.minList.size(); i++) {
                if(this.minList.get(i) == value) {
                    this.minList.remove(i);
                    break;
                }
            }
        }
    }

    public int top() {
        return this.stack.get(this.stack.size() -1);
    }

    public int getMin() {
        return this.minList.get(0);
    }


}
