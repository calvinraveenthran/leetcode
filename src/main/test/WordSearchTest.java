package main.test;
import main.java.WordSearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    @Test
    public void test1(){
        WordSearch ws = new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word1 =  "ABCCED";
        assertTrue(ws.exist(board, word1));
        String word2 =  "SEE";
        assertTrue(ws.exist(board, word2));
        String word3 =  "ABCB";
        assertFalse(ws.exist(board, word3));
    }

    @Test
    public void test2(){
        WordSearch ws = new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word1 =  "ABCESEEEFS";
        assertTrue(ws.exist(board, word1));
    }
}
