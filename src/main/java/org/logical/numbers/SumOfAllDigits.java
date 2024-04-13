package org.logical.numbers;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        while (number != 0) {
            int las = number % 10;
            sum += las;
            number /= 10;
        }
        System.out.println(sum);
        int number1 = 12345;

        System.out.println("Using Recursion: " + usinhRecursion(number1));
    }

    static int usinhRecursion(int number) {
        int sum = 0;
        if (number == 0) {
            return sum;
        }
        int lastNumber = number % 10;
        sum += lastNumber;
        number /= 10;
        int recursiveSum = usinhRecursion(number);
        return sum += recursiveSum;

    }

}
