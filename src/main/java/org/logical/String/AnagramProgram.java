package org.logical.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Predicate;

public class AnagramProgram {
    static boolean isAnagram(String s1, String s2) {
        Predicate<String> isAnagram = str -> {
            String copyOfs1 = str.replaceAll("\\s", "").toLowerCase();
            String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
            return Arrays.equals(copyOfs1.chars().sorted().toArray(), copyOfs2.chars().sorted().toArray());
        };
        return isAnagram.test(s1);
    }

    static void printAnagramStatus(String s1, String s2) {
        boolean isAnagram = isAnagram(s1, s2);
        String status = isAnagram ? "are anagrams" : "are not anagrams";
        System.out.println(s1 + " and " + s2 + " " + status);
    }

    public static void main(String[] args) {
        printAnagramStatus("Mother In Law", "Hitler Woman");
        printAnagramStatus("keEp", "peeK");
        printAnagramStatus("SiLeNt CAT", "LisTen AcT");
        printAnagramStatus("Debit Card", "Bad Credit");
        printAnagramStatus("School MASTER", "The ClassROOM");
        printAnagramStatus("DORMITORY", "Dirty Room");
        printAnagramStatus("ASTRONOMERS", "NO MORE STARS");
        printAnagramStatus("Toss", "Shot");
        printAnagramStatus("joy", "enjoy");
    }


    //    4) Anagram Program In Java Using HashMap


    static boolean isAnagramUsingHashMap(String s1, String s2) {
        // Remove white spaces and convert to lowercase
        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of characters in str1
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement occurrence counts for characters in str2
        for (char c : str2.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            if (count == 0) {
                // Character in str2 not found in str1
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        // If all counts are zero, strings are anagrams
        return true;
    }
}
