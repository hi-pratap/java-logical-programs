package org.logical.arrays;

import java.util.Arrays;

public class FindMissingnumbber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5}; // Example array with one missing number

        int missingNumber = findMissing(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    private static int findMissing(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2; //
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
