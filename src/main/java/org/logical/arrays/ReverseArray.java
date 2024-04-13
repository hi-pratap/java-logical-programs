package org.logical.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
        reverseArrayRecursion(array, 0, array.length - 1);
    }

    private static void reverseArray(int[] array) {
        int end = array.length - 1;
        int start = 0;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void reverseArrayRecursion(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        // Swap the elements at start and end indices
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        // Recur with the indices moved towards the center
        reverseArrayRecursion(array, start + 1, end - 1);
    }
}
