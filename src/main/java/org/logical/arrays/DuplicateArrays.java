package org.logical.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrays {
    static void duplicateArraysUsingBrutForce(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    System.out.println(ints[i]);
                }
            }
        }
    }

    static void findDuplicatesUsingSOrt(int[] ints) {
        Arrays.sort(ints);
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == ints[i + 1]) {
                System.out.println("Duplicates using sort: " + ints[i]);
            }
        }
    }

    static void findDuplicatesUsingSET(int[] ints) {
        Set<Integer> integers = new HashSet<>();
        Set<Integer> duplicateIntegers = new HashSet<>();
        for (int num : ints) {
            if (!integers.add(num)) {
                duplicateIntegers.add(num);
            }
        }
        System.out.println("Duplicate Arrays: " + duplicateIntegers);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 1};
        duplicateArraysUsingBrutForce(arr);
        findDuplicatesUsingSOrt(arr);
        findDuplicatesUsingSET(arr);
    }
}
