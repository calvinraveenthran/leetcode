package main.java;

public class ReverseBits {

    public int reverseBits(int n) {
        int n_copy = n;
        int reverse = 0b00000000000000000000000000000000;
        int mask = 0b00000000000000000000000000000001;

        for(int i =0 ; i < 32; i ++) {

            int value = n_copy & mask;
            reverse <<= 1;
            reverse = reverse | value;
            n_copy >>= 1;
        }

        return reverse;
    }
}
