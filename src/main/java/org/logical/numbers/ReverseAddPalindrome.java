package org.logical.numbers;

public class ReverseAddPalindrome {
    public static void main(String[] args) {
        int number = 195; // Example number
        int steps = findPalindromeSteps(number);
        System.out.println("Steps to reach palindrome: " + steps);
    }
    public static int findPalindromeSteps(int number) {
        int steps = 0;
        while (!isPalindrome(number)) {
            // Reverse the number and add it to the original number
            int reverse = reverseNumber(number, 0);
            number += reverse;
            steps++;
        }
        return steps;
    }
    public static int reverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        return reverseNumber(number / 10, reverse);
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = reverseNumber(number, 0);
        return originalNumber == reverse;
    }
}
