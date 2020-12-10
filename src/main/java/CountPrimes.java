package main.java;

public class CountPrimes {

    public int countPrimes(int n) {

        int size = n>1 ? n : 2;
        int[] storage = new int[size];
        int answer = 0;

        storage[0] = 1;
        storage[1] = 1;

        for(int i =2; i < n; i++){

            if(i > (Integer.MAX_VALUE/i)){
                break;
            } else if(storage[i] == 1) {
                continue;
            }

            int val = i*i;
            for(int j = 0; val <  n;  val = (i*i) + (j*i)) {
                try {
                    storage[(int) val] = 1;
                } catch (Exception e) {
                    System.out.println(val);
                    return 0;
                }
                j++;
            }
        }

        for(int i=2; i < n; i++) {
            if(storage[i] == 0){
                answer++;
            }
        }

        return answer;
    }
}
