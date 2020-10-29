package main.java;
import java.util.Random;

public class ShuffleArray {

    int[] array;
    int[] original;

    public ShuffleArray(int[] nums) {
        this.array = nums;
        this.original = nums.clone();
    }

    public int[] shuffle() {
        Random rand = new Random();

        for(int i =0; i < array.length; i ++) {
            int j = rand.nextInt(array.length-i) + i;

            int temp  = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }
}
