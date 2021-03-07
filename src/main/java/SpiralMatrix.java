package main.java;

import java.util.List;
import java.util.*;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        int length = matrix.length * matrix[0].length;
        List<Integer> answer = new ArrayList<>();
        int cur_dir = 0;
        int filled = 0;

        int col = 0;
        int row = 0;

        //first one
        answer.add(matrix[0][0]);
        matrix[0][0] = -1000;
        filled = filled +1;

        //direction = {'R', 'D', 'L', 'U'};
        while(filled < length) {

            int prev_col = col;
            int prev_row = row;

            switch(cur_dir) {
                case 0:
                    col = col +1;
                    break;
                case 1:
                    row = row +1;
                    break;
                case 2:
                    col = col -1;
                    break;
                case 3:
                    row = row - 1;
                    break;
            }

            if(col < 0  || row < 0 || col >= matrix[0].length  ||
                    row  >= matrix.length || matrix[row][col] == -1000) {
                col = prev_col;
                row = prev_row;
                cur_dir = (cur_dir +1) % 4;
                continue;
            }

            answer.add(matrix[row][col]);
            matrix[row][col] = -1000;
            filled = filled +1;
        }

        return answer;
    }
}
