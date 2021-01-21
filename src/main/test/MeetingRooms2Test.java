package main.test;
import main.java.MeetingRooms2;
import org.junit.Test;
import static org.junit.Assert.*;

public class MeetingRooms2Test {

    @Test
    public void test1(){
        MeetingRooms2 m = new MeetingRooms2();
        int[][] intervals = {{0,30},{5,10},{15,20}};
        assertEquals(2, m.minMeetingRooms(intervals));
    }

    @Test
    public void test2(){
        MeetingRooms2 m = new MeetingRooms2();
        int[][] intervals = {{7,10},{2,4}};
        assertEquals(1, m.minMeetingRooms(intervals));
    }

    @Test
    public void test3(){
        MeetingRooms2 m = new MeetingRooms2();
        int[][] intervals = {{0,30},{5,10},{15,20}};
        assertEquals(2, m.minMeetingRoomsPQ(intervals));
    }
}
