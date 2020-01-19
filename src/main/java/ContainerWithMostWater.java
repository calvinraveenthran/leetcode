package main.java;

public class ContainerWithMostWater {

    public int containerWithMostWater(int[] height) {
        int max = Integer.MIN_VALUE, i = 0, j = height.length -1;

        while(i < j) {
            max = Math.max(max, (j-i) * Math.min(height[j], height[i]));
            if(height[j] <= height[i]){
                j = j -1;
            } else {
                i = i +1;
            }
        }
        return max;
    }


}
