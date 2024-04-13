package org.logical.arrays;

import java.util.HashSet;

public class PairsOfElementsInArray {
    public static void main(String[] args) {
        findThePairsHashSet(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairsHashSet(new int[]{4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairsHashSet(new int[]{12, 13, 40, 15, 8, 10, -15}, 25);

        findThePairsHashSet(new int[]{12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }

    static void findThePairsBrutforce(int[] array, int inputNumber) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == inputNumber) {
                    System.out.println("Found Pair : " + array[i] + "+" + array[j] + "=" + inputNumber);
                }
            }
        }
    }

    static void findThePairsHashSet(int[] array, int inputNumber) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            int complement = inputNumber - num;
            if (set.contains(complement)) {
                System.out.println(num + " + " + complement + " = " + inputNumber);
            }
            set.add(num);
        }

    }
}
