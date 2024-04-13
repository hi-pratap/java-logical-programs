package org.logical.numbers;

public class PalindromeNUmber {
    public static void main(String[] args) {
        int num = 12321;
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to the reversed number
        System.out.println(originalNum == reversedNum);
    }
}
