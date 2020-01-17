package main.java;

public class DefangingIp {

        public String replaceString(String input, String replace, char find) {
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(i < input.length()) {
                if(input.charAt(i) == find) {
                    sb.append(replace);
                } else {
                    sb.append(input.charAt(i));
                }
                i=i+1;
            }
            return sb.toString();
        }
}
