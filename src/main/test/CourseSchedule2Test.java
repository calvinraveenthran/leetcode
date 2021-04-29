package main.test;

import main.java.CourseSchedule2;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseSchedule2Test {

    @Test
    public void test1() {
        int[][] value = {{1,0}};
        int[] answer = {0,1};
        int numCourses = 2;
        CourseSchedule2 c = new CourseSchedule2();
        assertArrayEquals(answer, c.findOrder(numCourses,value));
    }
}
