package main.java;
import  java.util.*;


public class WordSearch {

    public boolean exist(char[][] board, String word) {

        char[] charArray = word.toCharArray();

        for(int rw = 0; rw< board.length; rw++){
            for(int cl = 0; cl < board[0].length; cl++){
                if(board[rw][cl] == charArray[0]){
                    HashSet<String> visited = new HashSet<>();
                    if(checkChar(board, charArray, 0, rw, cl, visited))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean checkChar(char[][] board,
                             char[] charArray,
                             int index,
                             int rw,
                             int cl,
                             HashSet<String> visited){

        if(rw < 0|| rw > board.length -1 || cl <0 || cl > board[0].length -1 || index >= charArray.length)
            return false;

        String pos = String.valueOf(rw) +  ":" + String.valueOf(cl);

        if(visited.contains(pos))
            return false;

        if(charArray[index] != board[rw][cl])
            return false;

        if(index == charArray.length -1)
            return true;

        visited.add(pos);

        if(checkChar(board, charArray, index+1, rw-1, cl, new HashSet<>(visited)))
            return true;
        if(checkChar(board, charArray, index+1, rw+1, cl, new HashSet<>(visited)))
            return true;
        if(checkChar(board, charArray, index+1, rw, cl-1, new HashSet<>(visited)))
            return true;
        if(checkChar(board, charArray, index+1, rw, cl+1, new HashSet<>(visited)))
            return true;

        return false;
    }
}
