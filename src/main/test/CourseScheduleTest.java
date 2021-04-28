package main.test;
import main.java.CourseSchedule;
import org.junit.Test;
import static org.junit.Assert.*;

public class CourseScheduleTest {

    @Test
    public void test1() {
        int[][] value = {{1,0}};
        int numCourses = 2;
        CourseSchedule c = new CourseSchedule();
        assertTrue(c.canFinish(numCourses, value));
    }

    @Test
    public void test2() {
        int[][] value = {{1,0}, {0,1}};
        int numCourses = 2;
        CourseSchedule c = new CourseSchedule();
        assertFalse(c.canFinish(numCourses, value));
    }
}
