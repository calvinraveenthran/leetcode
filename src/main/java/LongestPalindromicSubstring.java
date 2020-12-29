package main.java;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        char[] charArray = s.toCharArray();
        int globalMax = 1;
        int start =0;

        for(int i = 1; i < charArray.length; i++) {

            int maxEven = 0;
            int evenL = i -1;
            int evenR = i;
            boolean stillLookingEven = (evenL < 0 || evenR >= charArray.length) ? false : true;
            int maxOdd =  1;
            int oddL = i -1;
            int oddR = i + 1;
            boolean stillLookingOdd = (oddL < 0 || oddR >= charArray.length) ? false : true;

            while(stillLookingOdd  || stillLookingEven) {

                if(stillLookingEven) {
                    if(charArray[evenL] == charArray[evenR]){
                        maxEven = maxEven + 2;
                        evenL = evenL - 1;
                        evenR = evenR + 1;

                        if(evenL < 0 || evenR >= charArray.length){
                            stillLookingEven = false;
                        }
                    } else{
                        stillLookingEven = false;
                    }
                }

                if(stillLookingOdd) {
                    if (charArray[oddL] == charArray[oddR]) {
                        maxOdd = maxOdd + 2;
                        oddL = oddL - 1;
                        oddR = oddR + 1;

                        if(oddL < 0 || oddR >= charArray.length){
                            stillLookingOdd = false;
                        }
                    } else{
                        stillLookingOdd = false;
                    }
                }
            }

            int localMax = maxOdd > maxEven ? maxOdd : maxEven;

            if(localMax > globalMax) {
                globalMax = localMax;
                start = i - (localMax/2);
            }
        }

        return new String(charArray, start, globalMax);
    }
}
