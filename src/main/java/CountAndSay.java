package main.java;

public class CountAndSay {

    public String countAndSay(int n) {

        String[] array = new String[30];
        array[0] = "1";
        array[1] = "11";
        array[2] = "21";
        array[3] = "1211";
        array[4] = "111221";

        for(int i = 5; i < n; i++) {

            String prev_str = array[i-1];
            StringBuilder str_build = new StringBuilder();
            int count = 1;

            for(int j =1; j < prev_str.length(); j++) {

                if(prev_str.charAt(j) == prev_str.charAt(j-1)) {
                    count++;
                } else {
                    str_build.append(count);
                    str_build.append(prev_str.charAt(j-1));
                    count = 1;
                }

                if(j == prev_str.length()-1) {
                    str_build.append(count);
                    str_build.append(prev_str.charAt(j));
                }
            }
            array[i] = str_build.toString();
        }

        return array[n-1];
    }
}
