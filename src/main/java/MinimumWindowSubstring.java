package main.java;
import java.util.*;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap();
        HashMap<Character, Integer> tMap = new HashMap();
        boolean found = false;
        boolean exists = false;
        String answer = s;

        if(t.length() > s.length()) {
            return "";
        }

        for(int i =0; i< t.length(); i++){
            if(tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) +1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }

        for(int end = 0, start = 0; start <= s.length() - t.length();) {

            if(!found){
                if(end >= s.length()){
                    break;
                }
                if(sMap.containsKey(s.charAt(end))) {
                    sMap.put(s.charAt(end), sMap.get(s.charAt(end)) +1);
                } else {
                    sMap.put(s.charAt(end), 1);
                }

                found = true;
                for(Map.Entry<Character, Integer> set : tMap.entrySet()){
                    if(!sMap.containsKey(set.getKey()) || sMap.get(set.getKey()) < set.getValue()){
                        found = false;
                        break;
                    }
                }
                end++;
                continue;
            }

            exists = true;
            String local = end <= s.length() - 1 ? s.substring(start, end) : s.substring(start);
            if(local.length() < answer.length()) {
                answer = local;
            }

            sMap.put(s.charAt(start), sMap.get(s.charAt(start)) -1);
            if(tMap.containsKey(s.charAt(start)) &&
                    tMap.get(s.charAt(start)) > sMap.get(s.charAt(start))){
                found = false;
            }
            start++;
        }

        if(answer.equals(s) && !exists){
            return "";
        }

        return answer;
    }
}
