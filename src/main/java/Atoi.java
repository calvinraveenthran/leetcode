package main.java;

public class Atoi {

    public int myAtoi(String str) {


        String trimmed = str.trim();
        int index = 0;
        Long answer= 0L, multiplier = 1L;

        if(trimmed.length() == 0)
            return 0;

        if(str.length() == 1 && !Character.isDigit(trimmed.charAt(index)))
            return 0;

        if(trimmed.charAt(0) == '-') {
            multiplier = -1L;
            index++;
        }

        if(trimmed.charAt(0) == '+') {
            index++;
        }


        if(!Character.isDigit(trimmed.charAt(index)))
            return 0;

        while(index < trimmed.length() && Character.isDigit(trimmed.charAt(index))){
            answer = answer*10 + Character.getNumericValue(trimmed.charAt(index));
            index = index + 1;

            if(answer*multiplier > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(answer*multiplier < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        answer = answer* multiplier;

        return answer.intValue();
    }
}
