package main.java;

import java.util.HashMap;

public class FractionRecurring {
    public String fractionToDecimal(int numerator, int denominator) {

        if(numerator == 0) {
            return "0";
        }


        HashMap<String, Integer> recurring = new HashMap();
        long n_d = Math.abs((long) numerator);
        long d_d = Math.abs((long) denominator);
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        boolean negative = (long) numerator * (long) denominator < 0;


        if(n_d > d_d){
            long temp = n_d/d_d;
            sb.append(temp);
            n_d = n_d % d_d;
            if (n_d != 0) {
                sb.append(".");
            }
        } else {
            sb.append("0.");
        }

        while(!found && n_d != 0) {

            if(n_d < d_d) {
                n_d = n_d * 10;
            }

            long mul = n_d/d_d;
            long c_o = n_d % d_d;

            if(c_o == 0){
                sb.append(mul);
                found = true;
                continue;
            }

            if(recurring.containsKey(mul + "," + c_o)){
                int insert = recurring.get(mul + "," + c_o);
                sb.insert(insert, '(');
                sb.append(')');
                found = true;
                continue;
            }

            recurring.put(mul + "," + c_o, sb.length());
            sb.append(mul);
            n_d = c_o;
        }

        if(negative){
            sb.insert(0, '-');
        }

        return sb.toString();
    }
}
