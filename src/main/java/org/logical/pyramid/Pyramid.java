package org.logical.pyramid;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();
        System.out.println("Here is your pyramid: ");

        for (int i = 1; i <= noOfRows; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= noOfRows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
