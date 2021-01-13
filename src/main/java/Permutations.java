package main.java;
import java.util.*;
import java.util.stream.*;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currSet = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> currCandidate = new ArrayList<>();
        recursiveCall(answer,currSet,currCandidate, nums);
        return answer;
    }

    public void recursiveCall(List<List<Integer>> answer,
                              List<Integer> currSet,
                              List<Integer> currCandidate,
                              int[] nums) {

        if(currCandidate.size() == nums.length){
            answer.add(currCandidate);
            return;
        }

        for(int i= 0; i < currSet.size(); i++){

            List<Integer> nextSet = new ArrayList<>(currSet);

            List<Integer> nextCandidate = new ArrayList<>(currCandidate);

            nextSet.remove(i);
            nextCandidate.add(currSet.get(i));

            recursiveCall(answer,nextSet,nextCandidate, nums);
        }
    }
}
