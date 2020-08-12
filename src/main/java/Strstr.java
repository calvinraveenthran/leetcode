package main.java;
import java.util.*;

public class Strstr {

    public int strStr(String haystack, String needle) {

        if(haystack.equals(needle))
            return 0;

        if(needle.length() ==0 || haystack.length()== 0)
            return -1;

        int index = 0;
        while(index < haystack.length()) {
            if(haystack.charAt(index) == needle.charAt(0)) {

                if(index + needle.length() -1 >= haystack.length()) {
                    return -1;
                }

                int starting_point = index, inner_index= index;
                boolean found = false;

               for(int i =0; i < needle.length(); i++, inner_index++) {

                    if(needle.charAt(i) != haystack.charAt(inner_index)){
                        found = false;
                        break;
                    }

                   found = true;
               }

               if(found)
                   return starting_point;
            }

            index++;
        }
        return -1;
    }
}
