package main.java;

import java.util.HashMap;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        if(strs.length == 0)
            return sb.toString();
        
        for(int j = 0; j< strs[0].length(); j++) {
            char toMatch = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || toMatch != strs[i].charAt(j)) {
                    return sb.toString();
                }
            }
            sb.append(toMatch);
        }
        return sb.toString();
    }
}
