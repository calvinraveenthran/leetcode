package main.java;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int carryOver = 1;
        int i = digits.length - 1;

        while(i>= 0) {
            digits[i] = digits[i] + carryOver;
            carryOver = digits[i] > 9 ? 1 : 0;
            digits[i] = digits[i] > 9 ? 0 : digits[i];
            i--;
        }

        if(carryOver == 1) {
            int[] answer = new int[digits.length + 1];
            System.arraycopy(digits, 0, answer, 1, digits.length);
            answer[0] = carryOver;
            return answer;
        }

        return digits;
    }
}
