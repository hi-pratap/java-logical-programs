package org.logical.String;

public class PalidromeString {
    public static void main(String[] args) {
        String str = "Rotatorsss", rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println(str.equals(rev));

    }
}
