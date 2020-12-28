package main.java;
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sorted = new String(charStr);

            if(anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                result.add(list);
                anagrams.put(sorted, list);
            }
        }
        return result;
    }
}
