package org.logical.numbers;

import java.util.Scanner;
import java.util.TreeMap;

public class DecimalToRoman {
    private static final TreeMap<Integer, String> ROMAN_MAP = new TreeMap<>();

    static {
        ROMAN_MAP.put(1000, "M");
        ROMAN_MAP.put(900, "CM");
        ROMAN_MAP.put(500, "D");
        ROMAN_MAP.put(400, "CD");
        ROMAN_MAP.put(100, "C");
        ROMAN_MAP.put(90, "XC");
        ROMAN_MAP.put(50, "L");
        ROMAN_MAP.put(40, "XL");
        ROMAN_MAP.put(10, "X");
        ROMAN_MAP.put(9, "IX");
        ROMAN_MAP.put(5, "V");
        ROMAN_MAP.put(4, "IV");
        ROMAN_MAP.put(1, "I");
    }

    static String toRoman(int number) {
        Integer floorValue = ROMAN_MAP.floorKey(number);
        if (number == floorValue) {
            return ROMAN_MAP.get(number);

        }
        return ROMAN_MAP.get(floorValue) + toRoman(number - floorValue);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a decimal number (enter 0 to exit): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("Roman equivalent of " + number + " is: " + toRoman(number));
        }
        scanner.close();
    }


}
