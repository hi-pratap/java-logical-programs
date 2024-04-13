package org.logical.String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String s = "Hello Input STring is here kasdlkas asksalsa aala     shsj     sjsj  js ";
        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
