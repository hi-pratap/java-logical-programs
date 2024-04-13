package org.logical.arrays;

import java.util.Arrays;

public class SeparateZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        separateZeros(nums);
        separateZerosUsingStream(nums);
        System.out.println("Separated Array: " + Arrays.toString(nums));

    }

    public static void separateZerosUsingStream(int[] nums) {
        Arrays.stream(nums).filter(e -> e == 0).forEach(System.out::print);
        Arrays.stream(nums).filter(e -> e != 0).forEach(System.out::print);
    }

    public static void separateZeros(int[] nums) {
        int zeroIndicator = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[zeroIndicator] = temp;
                zeroIndicator++;

            }
        }
        for (int i = zeroIndicator; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
