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
            } else {
                arrayList.add(new ArrayList<Integer>());
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

        boolean found = false;
        while(!found && this.arrayIterator.hasNext()) {
            List<Integer> temp = this.arrayIterator.next();
            if(temp.size() > 0) {
                this.digitIterator = temp.iterator();
                return true;
            }
        }
       return found;
    }
}
