package com.rohit.dsa;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {5,18,17,6};

        System.out.println("Most water -> " + getMostWaterValue(height));
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

    // Solution 2 - two pointers
    // Linear solution
    // Time Complexity - O(n)

    public static int getMostWaterValue(int[] height) {
        int volume = 0;
        int leftP = 0;
        int rightP = height.length - 1;

        while (leftP < rightP) {
            int currLength = rightP - leftP;
            int currHeight = Math.min(height[leftP], height[rightP]);

            volume = Math.max(volume, currLength * currHeight);

            if (height[leftP] < height[rightP]) {
                leftP++;
            }
            else {
                rightP--;
            }
        }
        return volume;
    }
}
