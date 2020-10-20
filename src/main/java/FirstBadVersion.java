package main.java;

public class FirstBadVersion {

    // Cummy method to mimic api.
    public boolean isBadVersion(int n) {
        return false;
    }

    public int firstBadVersion(int n) {


        int start= 1, end = n, mid = 1;

        if (n==1) {
            return 1;
        }

        while(start<=end) {
            mid = start + (end - start) / 2;

            boolean mid_bool_bad = isBadVersion(mid);
            boolean mid_bool_good = !isBadVersion(mid-1);

            if(mid_bool_bad && mid_bool_good) {
                return mid;
            }

            if(mid_bool_bad) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }

        return mid;

    }
}
