package main.test;
import main.java.RotateArray;
import main.java.RotateImage;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void test1() {
        int [][] image = { {1,2}, {4,3}};
        int [][] answer = { {4,1}, {3,2}};
        RotateImage ri = new RotateImage();
        ri.rotate(image);

        for(int i = 0; i < image.length; i++) {
            assertArrayEquals(answer[i], image[i]);
        }
    }

    @Test
    public void test2() {
        int [][] image = { {1,2,3,4}, {12,1,2,5}, {11,4,3,6}, {10,9,8,7}};
        int [][] answer = {{10,11,12,1}, {9,4,1,2}, {8,3,2,3}, {7,6,5,4}};
        RotateImage ri = new RotateImage();
        ri.rotate(image);

        for(int i = 0; i < image.length; i++) {
            assertArrayEquals(answer[i], image[i]);
        }
    }

    @Test
    public void test3() {
        int [][] image = { {5, 1, 9,11}, {2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
        int [][] answer = {{15,13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7,10,11}};
        RotateImage ri = new RotateImage();
        ri.rotate(image);

        for(int i = 0; i < image.length; i++) {
            assertArrayEquals(answer[i], image[i]);
        }
    }

}
