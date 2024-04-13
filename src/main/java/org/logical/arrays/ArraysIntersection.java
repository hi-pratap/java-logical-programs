package org.logical.arrays;

import java.util.HashSet;

public class ArraysIntersection {
    public static void main(String[] args) {
        checkItersection();
    }

    private static void checkItersection() {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
