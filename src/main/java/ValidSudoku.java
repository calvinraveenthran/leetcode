package main.java;

import java.util.HashSet;

public class ValidSudoku {

    public boolean checkSolution(char[][] board, HashSet<Character> sudokuSet, int row, int column) {
            if (sudokuSet.contains(board[row][column])) {
                return false;
            }

            if (".".charAt(0) != board[row][column]) {
                sudokuSet.add(board[row][column]);
            }
        return true;
    }


    public boolean checkSquare(char[][] board, int row, int column) {

        HashSet<Character> sudokuSet = new HashSet<Character> ();
        for(int i = row; i < row + 3; i++) {

            for(int j = column; j < column +3; j++) {
                if (!checkSolution(board, sudokuSet, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i=0; i<9; i++) {
            HashSet<Character> sudokuSet = new HashSet<Character> ();
            for (int j = 0; j<9; j ++) {
                if(!checkSolution(board, sudokuSet, i, j)) {
                    return false;
                }
            }
        }

        for (int i=0; i<9; i++) {
            HashSet<Character> sudokuSet = new HashSet<Character> ();
            for (int j = 0; j<9; j++) {
                if(!checkSolution(board, sudokuSet, j, i)) {
                    return false;
                }
            }
        }

        for(int i = 0; i < 9; i = i +3) {
            for (int j = 0; j < 9; j = j+3) {
                if(!checkSquare(board, i, j))
                    return false;
            }
        }
        return true;
    }
}
