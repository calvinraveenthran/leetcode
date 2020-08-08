package main.java;

public class ValidPalindrome {

    enum Direction {
        LEFT,
        RIGHT
    }

    public int getNextCharacterIndex(String s, int index,  Direction direction) {
        int i = index;
        while(i < s.length() && i >=0) {

            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                return i;
            }

            switch (direction) {
                case LEFT:
                    i--;
                    break;
                case RIGHT:
                    i++;
                    break;
            }
        }
        return -1;
    }

    public boolean isPalindrome(String s) {

        int start = 0, end = s.length()-1;

        while(start < end) {

            start = getNextCharacterIndex(s, start,  Direction.RIGHT);
            end  = getNextCharacterIndex(s, end,  Direction.LEFT);

            if(start != -1 && end != -1 && start < end
                    && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
