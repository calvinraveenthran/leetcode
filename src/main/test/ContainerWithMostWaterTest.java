package main.test;
import main.java.ContainerWithMostWater;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void containerWithMostWaterTest() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, containerWithMostWater.containerWithMostWater(height));
    }

}
