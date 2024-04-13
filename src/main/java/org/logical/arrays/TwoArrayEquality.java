package org.logical.arrays;

import java.util.Arrays;

public class TwoArrayEquality {
    public static void main(String[] args) {

//using Arrays eqal functions
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 5, 7, 4};

        boolean equals = Arrays.equals(arrayTwo, arrayOne);
        System.out.println(equals);
        boolean b = true;

        //using iterator
        for (int i = 0; i < arrayOne.length; i++) {

            if (arrayOne[i] != arrayTwo[i]) {
                b = false;
            }


        }
//using STream

        boolean b1 = Arrays.stream(arrayOne)
                .boxed()
                .allMatch(i -> Arrays.stream(arrayTwo).anyMatch(j -> i == j));
        System.out.println("Using manual Iteration : " + b);
        System.out.println("Using Stream Iteration : " + b1);

    }
}
