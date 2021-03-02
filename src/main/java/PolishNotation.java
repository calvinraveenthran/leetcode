package main.java;
import java.util.*;

public class PolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<Integer> mem = new Stack<>();
        int curr = 0;

        for(int i = 0; i < tokens.length; i ++) {

            if(isNumeric(tokens[i])) {
                mem.push(Integer.parseInt(tokens[i]));
                continue;
            }

            int second = mem.pop();
            int first = mem.pop();


            switch(tokens[i]){
                case "+":
                    curr =  first + second;
                    break;
                case "-":
                    curr =  first - second;
                    break;
                case "*":
                    curr = first * second;
                    break;
                case "/":
                    curr = first / second ;
                    break;
            }

            mem.push(curr);
        }

        return mem.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
