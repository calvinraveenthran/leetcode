package main.java;
import java.util.*;

public class LongestSubstringWoRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        char[] cArray = s.toCharArray();
        HashMap<Character, Integer>  charPosMap = new HashMap<>();
        int start = 0;
        int globalMax = 0;
        int localMax = 0;

        for(int i = 0; i < s.length(); i++){

            Integer charPos = charPosMap.get(cArray[i]);

            if(charPos == null || charPos < start) {
                charPosMap.put(cArray[i], i);
                localMax++;
                if(localMax > globalMax){
                    globalMax = localMax;
                }
            } else{
                start = charPosMap.get(cArray[i]);
                localMax = i - start;
                start++;
                charPosMap.put(cArray[i], i);
            }
        }
        return globalMax;
    }
}
