package main.test;
import main.java.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void test1() {
        FizzBuzz fb = new FizzBuzz();
        assertArrayEquals(fb.fizzBuzz(15).toArray(),
                new String[]{
                        "1",
                        "2",
                        "Fizz",
                        "4",
                        "Buzz",
                        "Fizz",
                        "7",
                        "8",
                        "Fizz",
                        "Buzz",
                        "11",
                        "Fizz",
                        "13",
                        "14",
                        "FizzBuzz"
        });
    }
}
