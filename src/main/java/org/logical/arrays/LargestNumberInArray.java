package org.logical.arrays;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargest(new int[]{985, 521, 975, 831, 479, 861}));

        System.out.println(secondLargest(new int[]{9459, 9575, 5692, 1305, 1942, 9012}));

        System.out.println(secondLargest(new int[]{47498, 14526, 74562, 42681, 75283, 45796}));
        System.out.println("using Stream :"+ findSecondLargestUsingStream(new int[]{47498, 14526, 74562, 42681, 75283, 45796}));
    }

    static int findSecondLargestUsingStream(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .sorted()
                .skip(array.length < 2 ? 0 : array.length - 2)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array should have at least two elements"));
    }

    static int secondLargest(int[] inputs) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : inputs) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

}
