package org.logical.String;

import java.util.HashMap;

public class FindDuplicateCharectorsInString {


    static void duplicateCharCount(String string) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
/*            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else {
                charCountMap.put(c,1);
            }*/

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        charCountMap.keySet().stream().filter(e -> charCountMap.get(e) > 1).forEach(e -> System.out.println(e + " : " + charCountMap.get(e)));
    }


    public static void main(String[] args) {


        duplicateCharCount("JavaJ2EE");

        duplicateCharCount("Fresh Fish");

        duplicateCharCount("Better Butter");
    }
}
