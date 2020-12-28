package main.java;
import java.util.*;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        HashSet<Integer> column = new HashSet<Integer>();
        HashSet<Integer> row = new HashSet<Integer>();
        int rowLen = matrix[0].length;
        int columnLen = matrix.length;

        for(int i = 0; i<columnLen; i++){
            for(int j = 0; j< rowLen; j++) {
                if(matrix[i][j] == 0) {
                    column.add(i);
                    row.add(j);
                }
            }
        }

        for(int i = 0; i<columnLen; i++){
            for(int j = 0; j< rowLen; j++) {
                if(column.contains(i) || row.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {

        HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> column = new HashSet<Integer>();
        int rowLen = matrix[0].length;
        int columnLen = matrix.length;

        for(int i = 0; i<columnLen; i++){
            for(int j = 0; j< rowLen; j++) {
                if(matrix[i][j] == 0) {
                    column.add(i);
                    row.add(j);

                    for(int k = i; k >=0; k--) {
                        matrix[k][j] = 0;
                    }
                } else if(matrix[i][j] != 1 && row.contains(j)) {
                    matrix[i][j] = 0;
                }
            }

            if(column.contains(i)){
                Arrays.fill(matrix[i], 0);
            }
        }
    }
}
