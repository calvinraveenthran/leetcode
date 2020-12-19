package main.java;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int distance = 0;
        int mask = 0b00000000000000000000000000000001;
        int xcopy = x;
        int ycopy = y;

        for(int i=0; i < 32; i++) {

            int bitx = xcopy & mask;
            int bity = ycopy & mask;

            if(bitx != bity)
                distance++;

            xcopy >>=1;
            ycopy >>=1;

        }
        return distance;
    }
}
