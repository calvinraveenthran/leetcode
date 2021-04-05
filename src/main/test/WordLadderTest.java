package main.test;
import main.java.WordLadder;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WordLadderTest {

    @Test
    public void test1() {
        WordLadder wl = new WordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordArray = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = new ArrayList<String>();
        for(String text:wordArray) {
            wordList.add(text);
        }

        assertEquals(5,wl.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void test2() {
        WordLadder wl = new WordLadder();
        String beginWord = "lost";
        String endWord = "miss";
        String[] wordArray = {"most","mist","miss","lost","fist","fish"};
        List<String> wordList = new ArrayList<String>();
        for(String text:wordArray) {
            wordList.add(text);
        }

        assertEquals(4,wl.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void test3() {
        WordLadder wl = new WordLadder();
        String beginWord = "leet";
        String endWord = "code";
        String[] wordArray = {"lest","leet","lose","code","lode","robe","lost"};
        List<String> wordList = new ArrayList<String>();
        for(String text:wordArray) {
            wordList.add(text);
        }

        assertEquals(6,wl.ladderLength(beginWord, endWord, wordList));
    }

}
