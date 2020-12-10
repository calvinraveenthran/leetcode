package main.java;

import java.util.HashMap;

public class RomanToInteger {

    public static HashMap<String, Integer> map;
    static {
        map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
    }


    public int romanToInt(String s) {

        int answer = 0;
        int length = s.length();
        for(int i=0; i < length;) {

            String ss;
            if(i + 2 < length){
                ss = s.substring(i, i +2);
            } else {
                ss = s.substring(i);
            }

            if(map.containsKey(ss)) {
                answer += map.get(ss);
                i = i +2;
                continue;
            }

            if(i + 1 < length){
                ss = s.substring(i, i +1);
            } else {
                ss = s.substring(i);
            }

            if(map.containsKey(ss)) {
                answer += map.get(ss);
            }
            i = i +1;
        }

        return answer;
    }
}
