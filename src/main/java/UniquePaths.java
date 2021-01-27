package main.java;

public class UniquePaths {

    static int answer = 0;

    public int uniquePaths(int m, int n) {

        int[][] mn = new int[m][n];
        mn[0][0] = 1;

        for(int i=0; i<m; i++){
            for(int j =0; j <n; j++){
                 if(i==0 && j==0){
                     continue;
                 }
                int cm = i == 0 ? 0: mn[i-1][j];
                int cn = j == 0 ? 0: mn[i][j-1];
                mn[i][j] = cm + cn;
            }
        }
        return mn[m-1][n-1];
    }
}
