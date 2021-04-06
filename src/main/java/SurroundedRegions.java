package main.java;

import java.util.HashSet;

public class SurroundedRegions {

    public static boolean investigate(char[][] board, int i, int j, HashSet<String> visited) {

        String curr = + i + ":" + j;

        if(visited.contains(curr)){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return true;
        }

        if(board[i][j] == 'X') {
            return true;
        } else if(i == 0 || j ==0 || i == board.length -1 || j == board[0].length -1) {
            return false;
        }


        visited.add(curr);
        boolean next;
        next = investigate(board, i+1, j, visited);
        if(!next)
            return false;
        next = investigate(board, i-1, j, visited);
        if(!next)
            return false;
        next = investigate(board, i, j+1, visited);
        if(!next)
            return false;
        next = investigate(board, i, j-1, visited);
        return next;
    }

    public void solve(char[][] board) {

        if(board.length <= 2 || board[0].length <= 2){
            return;
        }

        for(int i = 1; i < board.length-1; i++){
            for(int j = 1; j < board[0].length-1; j++) {
                if(board[i][j] == 'O'){
                    HashSet<String> visited = new HashSet<>();
                    if(investigate(board, i, j, visited)) {
                        for(String x : visited){
                            String[] pos = x.split(":");
                            board[Integer.parseInt(pos[0])][Integer.parseInt(pos[1])] = 'X';
                        }
                    }
                }
            }
        }
    }
}
