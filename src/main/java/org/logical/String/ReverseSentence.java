package org.logical.String;

public class ReverseSentence {
    public static void main(String[] args) {

        String s = "Hello My name is CK";
        String[] charArray = s.split("\\s");
        String rev = "";
        for (int i = 0; i < charArray.length; i++) {
            String word = charArray[i];
            rev = word + " " + rev;
        }
        System.out.println(rev);
        usingStringBuilder(charArray);
    }

    static void usingStringBuilder(String[] charArray) {
        StringBuilder reverseString = new StringBuilder("");
        for (String e : charArray) {
            StringBuilder stringBuilder = new StringBuilder(e);
            reverseString.append(stringBuilder.reverse()).append(" ");
        }
        System.out.println(reverseString);
    }
}
