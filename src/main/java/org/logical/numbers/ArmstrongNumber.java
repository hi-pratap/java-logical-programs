package org.logical.numbers;

public class ArmstrongNumber {
    static boolean isArmStrong(int number) {
        int orignalNumber = number;
        int sum = 0;
        int digits = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, String.valueOf(orignalNumber).length());
            number /= 10;
            digits++;

        }
        return sum == orignalNumber;
    }
    public static void main(String[] args) {
        int number = 153;
        if (isArmStrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static void checkArmstrongNumbeWIthoutMATH(int number) {
        int copyOfNumber = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            int power = 1;
            for (int i = 0; i < noOfDigits; i++) {
                power *= lastDigit;
            }
            sum += power;
            copyOfNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

}
