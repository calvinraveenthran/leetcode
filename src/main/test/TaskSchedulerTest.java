package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.TaskScheduler;

public class TaskSchedulerTest {

    @Test
    public void test1() {
        TaskScheduler t = new TaskScheduler();
        char[] input = {'A','A','A','B','B','B'};
        assertEquals(8, t.leastInterval(input, 2));
    }

    @Test
    public void test2() {
        TaskScheduler t = new TaskScheduler();
        char[] input = {'A','A','A','B','B','B'};
        assertEquals(6, t.leastInterval(input, 0));
    }

    @Test
    public void test3() {
        TaskScheduler t = new TaskScheduler();
        char[] input = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        assertEquals(16, t.leastInterval(input, 2));
    }
}
