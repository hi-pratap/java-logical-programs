package org.logical.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6};
        int[] result = removeDuplicates(array);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(array).forEach(set::add);
        return set.stream().mapToInt(Integer::intValue).toArray();

    }
}
