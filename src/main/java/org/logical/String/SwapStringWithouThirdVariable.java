package org.logical.String;

public class SwapStringWithouThirdVariable {
    public static void main(String[] args) {
        String name="pratap";
        String surName = "Adhav";

       name=name+surName;
       surName=name.substring(0,name.length()-surName.length());
        name = name.substring(surName.length()); // Extract original str2 from concatenated string

        System.out.println("\nAfter swapping:");
        System.out.println("sirname = " + surName);
        System.out.println("name = " + name);
    }
}
