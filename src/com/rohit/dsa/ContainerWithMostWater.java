package com.rohit.dsa;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println("Most water -> " + getMostWaterValueBruteForce(height));
    }

    // Brute Force
    // Time Complexity - O(n*2)
    public static int getMostWaterValueBruteForce(int[] height) {
        int volume = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j=i+1; j < height.length; j++) {
                int actualHeight = Math.min(height[i], height[j]);
                int actualLength = j-i;
                volume = Math.max(volume, actualLength * actualHeight);
            }
        }

        return volume;
    }
}
