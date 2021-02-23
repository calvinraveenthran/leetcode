package main.java;

import java.util.HashMap;

public class ExcelSheet {

    public int titleToNumber(String s) {

        int position = s.length()-1;
        int pow = 0;
        int answer = 0;


        for(; position>=0; position--){
            answer += Math.pow(26, pow) * (s.charAt(position) - 64);
            pow += 1;
        }

        return answer;
    }

}
