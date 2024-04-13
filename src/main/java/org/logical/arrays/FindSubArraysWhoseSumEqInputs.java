package org.logical.arrays;

public class FindSubArraysWhoseSumEqInputs {

    static void findSubArray(int[] inputArray, int inputNumber) {
        for (int i = 0; i < inputArray.length; i++) {
            int sum = 0;
            for (int j = i; j < inputArray.length; j++) {
                sum += inputArray[j];
                if (sum == inputNumber) {
                    printSubArray(inputArray, i, j);
                    return;
                }
            }
        }
        System.out.println("No subarray found with sum equal to " + inputNumber);
    }

    static void printSubArray(int[] array, int start, int end) {
        System.out.print("Continuous subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
}
