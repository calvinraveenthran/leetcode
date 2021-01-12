package main.java;
import java.util.*;

public class CombOfPN {

    public void updateHashSet(List<String> answer, HashMap<Character, char[]> phoneMap, char digit){

        char[] charArray = phoneMap.get(digit);
        List<String> temp = new ArrayList<>();

        if(answer.size() ==0){
            for (char c : charArray) {
                temp.add(String.valueOf(c));
            }
            answer.addAll(temp);
            return;
        }

        for (String current : answer) {
            for (char c : charArray) {
                temp.add(current + c);
            }
        }

        answer.clear();
        answer.addAll(temp);
    }


    public List<String> letterCombinations(String digits) {

        HashMap<Character, char[]> phoneMap = new HashMap<>();
        List<String> answer = new ArrayList<>();
        char[] two = {'a','b','c'};
        char[] three = {'d','e','f'};
        char[] four = {'g','h','i'};
        char[] five = {'j','k','l'};
        char[] six = {'m','n','o'};
        char[] seven = {'p','q','r','s'};
        char[] eight = {'t','u','v'};
        char[] nine = {'w','x','y','z'};

        phoneMap.put('2',two);
        phoneMap.put('3',three);
        phoneMap.put('4',four);
        phoneMap.put('5',five);
        phoneMap.put('6',six);
        phoneMap.put('7',seven);
        phoneMap.put('8',eight);
        phoneMap.put('9',nine);

        char[] charArray = digits.toCharArray();
        for (char c : charArray) {
            updateHashSet(answer, phoneMap, c);
        }

        return answer;
    }
}
