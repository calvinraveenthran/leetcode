package main.java;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);

        if (numRows>0)
            answer.add(first);

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);

        if (numRows>1)
            answer.add(second);

        if(numRows > 2) {
            for(int i=3; i <= numRows; i++) {
                List<Integer> next = new ArrayList<>();
                answer.add(next);
                next.add(1);
                for(int j =1; j < i-1; j++){
                    int val = answer.get(i-2).get(j-1) + answer.get(i-2).get(j);
                    next.add(val);
                }
                next.add(1);
            }
        }

        return answer;
    }
}
