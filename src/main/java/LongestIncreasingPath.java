package main.java;

public class LongestIncreasingPath {

    public int longestIncreasingPath(int[][] matrix) {

        int[][] visited = new int [matrix.length][matrix[0].length];
        int max = 0;

        for(int i = 0; i< matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++) {
                if(visited[i][j] == 0) {
                    int temp = investigatePaths(matrix, visited, i, j, Integer.MIN_VALUE);
                    max = Math.max(max, temp);
                }
            }
        }

        return max;
    }

    public int investigatePaths(int[][] matrix, int[][] visited, int i, int j, int prevInt) {

        if(i <0 || i >= matrix.length || j < 0 || j>= matrix[0].length) {
            return 0;
        }

        if(prevInt >= matrix[i][j]) {
            return 0;
        }


        if(visited[i][j] != 0){
            return visited[i][j];
        }

        int up = investigatePaths(matrix, visited, i - 1, j, matrix[i][j]) + 1;
        int down = investigatePaths(matrix, visited, i + 1, j, matrix[i][j]) + 1;
        int left = investigatePaths(matrix, visited, i, j-1, matrix[i][j]) + 1;
        int right = investigatePaths(matrix, visited, i, j+1, matrix[i][j]) + 1;


        visited[i][j] = Math.max(Math.max(Math.max(up, down), left), right);

        return visited[i][j];
    }
}
