package org.logical.String;

import java.util.Arrays;

public class ReverseWordsAndSentence {
    public static void main(String[] args) {
        reverseString();
        reverseStringUsingStringBuilder();
    }

    private static void reverseStringUsingStringBuilder() {
        String s = "I am string not reversed";
        String[] words = s.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            reverseString.append(reverseWord).append(" ");

        }
//using java 8
        Arrays.stream(words).forEach(e -> {
            StringBuilder reverse = new StringBuilder(e).reverse();

            reverseString.append(reverse).append(" ");
        });
        System.out.println("Using Builder : " + reverseString);


    }

    private static void reverseString() {
        String s = "I am string not reversed";
        String reverseString = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            String revserWord = "";
            for (int j = word.length(); j > 0; j--) {
                revserWord += word.charAt(j - 1);
            }
            reverseString += revserWord + " ";


        }
        System.out.println(reverseString);
    }
}
