package org.logical.String;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
        String s = str1 + str1;
        boolean contains = s.contains(str2);

        System.out.println(str2 + " is a rotation of " + str1 + " " + contains);

    }
}
