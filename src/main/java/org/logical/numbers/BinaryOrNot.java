package org.logical.numbers;

public class BinaryOrNot {
    static boolean binaryOrNot(int number) {
        boolean status = true;
        while (number != 0) {
            int i = number % 10;
            if (i > 1) {
                status = false;
                break;
            }
            number /= 10;
        }
        System.out.println(status);
        return status;
    }

    static boolean binaryOrNotUsingRecursion(int number) {
        // boolean status = true;
        if (number == 0) {
            return true;
        }
        int lastDigit = number % 10;
        if (lastDigit != 0 && lastDigit != 1) {
            return false;
        }
        boolean b = binaryOrNotUsingRecursion(number / 10);
        //System.out.println(b);
        return b;


    }

    public static void main(String[] args) {
        System.out.println(binaryOrNotUsingRecursion(110101011));
        System.out.println(binaryOrNotUsingRecursion(101050101));
    }
}
