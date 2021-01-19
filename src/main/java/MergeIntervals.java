package main.java;

import java.util.*;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int [] curInt = {intervals[0][0], intervals[0][1]};

        for(int i =1; i < intervals.length; i++){
            if((curInt[0] >= intervals[i][0] && curInt[0] <= intervals[i][1]) ||
                    (curInt[1] >= intervals[i][0] && curInt[0] <= intervals[i][1]) ||
                    (intervals[i][0] >= curInt[0] && intervals[i][0] <= curInt[1]) ||
                    (intervals[i][1] >= curInt[0] && intervals[i][1] <= curInt[1])) {

                curInt[0] = Math.min(intervals[i][0], curInt[0]);
                curInt[1] = Math.max(intervals[i][1], curInt[1]);
            } else{
                List<Integer> input = new ArrayList<>();
                input.add(curInt[0]);
                input.add(curInt[1]);
                ans.add(input);
                curInt[0] = intervals[i][0];
                curInt[1] = intervals[i][1];
            }
        }

        List<Integer> input = new ArrayList<>();
        input.add(curInt[0]);
        input.add(curInt[1]);
        ans.add(input);

        int[][] answer = new int[ans.size()][2];
        for(int i =0; i < answer.length; i= i +1){
            answer[i][0] = ans.get(i).get(0);
            answer[i][1] = ans.get(i).get(1);
        }

        return answer;
    }
}
