package main.java;
import java.util.*;
import java.util.stream.Collectors;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currentSet = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(currentSet);
        HashSet<List<Integer>> answerSet = new HashSet<>();
        findSubsets(answerSet, currentSet);
        return new ArrayList<>(answerSet);
    }

    public void findSubsets(HashSet<List<Integer>> preanswer, List<Integer> currentSet){

        if(preanswer.contains(currentSet)){
            return;
        }

        preanswer.add(currentSet);
        for(int i =0; i <currentSet.size(); i++) {
            List<Integer> nextSet = new ArrayList<>(currentSet);
            nextSet.remove(i);
            findSubsets(preanswer, nextSet);
        }
    }

}
