package main.test;
import main.java.GroupAnagrams;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void test1(){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> answer = ga.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();

        List<String> first = new ArrayList<>();
        first.add("bat");

        List<String> second = new ArrayList<>();
        second.add("eat");
        second.add("tea");
        second.add("ate");

        List<String> third = new ArrayList<>();
        third.add("tan");
        third.add("nat");

        expected.add(first);
        expected.add(second);
        expected.add(third);

        for (List<String> list : expected){
            Collections.sort(list);
        }

        for (List<String> list : answer){
            Collections.sort(list);
        }

        assertTrue(answer.containsAll(expected));
        assertTrue(expected.containsAll(answer));
    }
}
