package main.java;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

        char[] string = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : string) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
                continue;
            }
            map.put(c, 1);
        }

        for(int i = 0; i < string.length; i++) {
            if(map.get(string[i]) == 1)
                return i;
        }

        return -1;
    }
}
