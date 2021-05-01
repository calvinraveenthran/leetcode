package main.test;
import main.java.AlienDictionary;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlienDictionaryTest {

    @Test
    public void test1(){
        String[] input = {"wrt","wrf","er","ett","rftt"};
        AlienDictionary a = new AlienDictionary();
        String answer = a.alienOrder(input);
        assertNotEquals("", answer);
    }

    @Test
    public void test2(){
        String[] input = {"ab","adc"};
        AlienDictionary a = new AlienDictionary();
        String answer = a.alienOrder(input);
        assertNotEquals("", answer);
    }



}
