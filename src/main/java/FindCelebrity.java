package main.java;

import java.util.*;

public class FindCelebrity {

    int [][] helper;

    public FindCelebrity(int[][] helper) {
        this.helper = helper;
    }

    public boolean knows(int a, int b){
        return helper[a][b] == 1;
    }


    public int findCelebrity(int n) {

        int[] known_by = new int[n];
        int[] knows = new int[n];

        for(int a = 0; a< n; a++) {
            for (int b =0; b < n; b++){
                if(knows(a,b)){
                    knows[a] += 1;
                    known_by[b] +=1;
                }
            }
        }

        for(int i= 0; i < n; i++){
            if(knows[i] == 1 && known_by[i] == n){
                return i;
            }
        }
        return -1;
    }
}
