package main.java;

import java.util.*;

public class LongestSubstrKDistinct {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character, HashSet<Integer>> curMap = new HashMap<>();
        int max = 0;
        int start = 0;

        if(k == 0){
            return max;
        }

        for(int i = 0; i < s.length(); i++) {

            if(!curMap.containsKey(s.charAt(i))){
                HashSet<Integer> posSet = new HashSet<>();
                posSet.add(i);
                curMap.put(s.charAt(i), posSet);
            } else {
                curMap.get(s.charAt(i)).add(i);
            }

            if(curMap.size() <= k ) {

                int local_max = i - start +1;

                if(local_max > max) {
                    max = local_max;
                }
                continue;
            }

            if(curMap.size() > k) {
                while(curMap.size() > k){
                    curMap.get(s.charAt(start)).remove(start);
                    if(curMap.get(s.charAt(start)).isEmpty()){
                        curMap.remove(s.charAt(start));
                    }
                    start++;
                }
            }
        }
        return max;
    }
}
