package main.java;
import java.util.*;

public class BasicCalculator2 {

    public int calculate(String s) {

        ArrayList<String> calcList = new ArrayList<>();
        StringBuilder curStr = new StringBuilder();
        int dm = 0;
        int as = 0;

        // Step 1
        // "35*34/33+1-2"
        // ["35", "*", "34", "/", "33", "+", "1", "-", "2"]

        for(int i =0; i <s.length(); i++) {

            if(s.charAt(i) == ' '){
                continue;
            }

            if(s.charAt(i) != '+' && s.charAt(i) != '-' &&
                    s.charAt(i) != '*' && s.charAt(i) != '/') {
                curStr.append(s.charAt(i));
                continue;
            }

            calcList.add(curStr.toString());
            curStr = new StringBuilder();
            calcList.add(String.valueOf(s.charAt(i)));

            if(s.charAt(i) == '*' || s.charAt(i) == '/'){
                dm = dm +1;
            } else {
                as = as +1;
            }
        }
        calcList.add(curStr.toString());


        if(calcList.get(0).equals("-")) {
            Integer value = -1 * Integer.parseInt(calcList.get(1));
            calcList.set(0, String.valueOf(value));
            calcList.remove(1);
            as = as -1;
        }


        // Step 2
        // Multiplication/Division
        int i = 0;
        while(dm > 0) {
            if(!calcList.get(i).equals("*") && !calcList.get(i).equals("/")){
                i = i + 1;
                continue;
            }

            Integer result;
            if(calcList.get(i).equals("*")){
                result = Integer.parseInt(calcList.get(i -1)) * Integer.parseInt(calcList.get(i +1));
            } else {
                result = Integer.parseInt(calcList.get(i -1)) / Integer.parseInt(calcList.get(i +1));
            }

            calcList.set(i, String.valueOf(result));
            calcList.remove(i +1);
            calcList.remove(i -1);
            dm = dm - 1;
        }

        // Step 3
        // Addition/Subtraction
        int j = 0;
        while(as > 0) {
            if(!calcList.get(j).equals("+") && !calcList.get(j).equals("-")){
                j = j + 1;
                continue;
            }

            Integer result;
            if(calcList.get(j).equals("+")){
                result = Integer.parseInt(calcList.get(j -1)) + Integer.parseInt(calcList.get(j +1));
            } else {
                result = Integer.parseInt(calcList.get(j -1)) - Integer.parseInt(calcList.get(j +1));
            }

            calcList.set(j, String.valueOf(result));
            calcList.remove(j +1);
            calcList.remove(j -1);
            as = as - 1;
        }

        return Integer.parseInt(calcList.get(0));
    }
}
