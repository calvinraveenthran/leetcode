package main.java;
import java.util.*;

public class GenerateParentheses {


    public void buildParanthesis(char parenthesis, int balance, int pos, int target, String curr, List<String> answer) {

        if(pos > target){
            return;
        }

        if(parenthesis == '('){
            balance = balance +1;
        } else {
            balance = balance -1;
        }

        if(balance < 0 || balance > (target/2)){
            return;
        }

        curr = curr + parenthesis;

        if(pos == target && balance==0){
            answer.add(curr);
            return;
        }

        buildParanthesis('(', balance, pos+1, target, curr, answer);
        buildParanthesis(')', balance, pos+1, target, curr, answer);
    }



    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        String curr = "";
        buildParanthesis('(', 0, 1, 2*n, curr, answer);
        return answer;
    }
}
