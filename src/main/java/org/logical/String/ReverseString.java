package org.logical.String;

public class ReverseString {

    public static void main(String[] args) {
        // using String buffer
        StringBuffer stringBuffer = new StringBuffer("Pratap");
        System.out.println("Orignal : " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("Reversed : " + stringBuffer);

        //Using iterative methods
        String name = "Pratap";
        String rev = "";
        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);
            rev = c + rev;
        }


        System.out.println("Using ++ for loop :" + rev);
        //Using -- loop
        String name2 = "Pratap";
        char[] charArray = name2.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        reverseString("Hello My name is CK");
    }

    // Using recursive function
    static String reverseString(String str) {
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        // Separate the first character from the rest of the string
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        // Recursively reverse the rest of the string
        String reversedRest = reverseString(restOfString);
        // Concatenate the first character to the reversed rest of the string
        return reversedRest + firstChar;
    }

}
