package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class Flatten2DVectorSolution {

    Iterator<List<Integer>> arrayIterator;
    Iterator<Integer> digitIterator;


    public Flatten2DVectorSolution(int[][] v) {

        List<List<Integer>> arrayList = new ArrayList<>();
        for (int i=0; i < v.length; i++) {
            if(v[i].length > 0) {
                arrayList.add(Arrays.stream(v[i]).boxed().collect(Collectors.toList()));
            }
        }
        this.arrayIterator = arrayList.iterator();
    }

    public int next() {
          if(!this.hasNext()){
              throw new IllegalCallerException();
          }

            return this.digitIterator.next();
    }

    public boolean hasNext() {

        if(this.digitIterator != null && this.digitIterator.hasNext()) {
            return true;
        }

        if(this.arrayIterator.hasNext()) {
            this.digitIterator = this.arrayIterator.next().iterator();
            return true;
        }
       return false;
    }
}
