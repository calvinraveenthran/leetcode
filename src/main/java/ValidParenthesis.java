package main.java;

import java.util.HashMap;
import java.util.Stack;


public class ValidParenthesis {

    public boolean isValid(String s) {

        char [] cA = s.toCharArray();
        HashMap<Character, Character> parMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        parMap.put(')', '(');
        parMap.put('}', '{');
        parMap.put(']', '[');

        for (char c: cA) {
            Character c2 = parMap.get(c);
            if(stack.size() != 0  && c2 != null) {
                if(stack.pop() != c2)
                    return false;
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }
}
