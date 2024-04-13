package org.logical.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "java", "Pratap", "pratap");

        list.stream().distinct().forEach(e -> System.out.print(e));
        System.out.println("\n List With Duplicates : " + list);
        HashSet<String> set = new HashSet<>(list);

        System.out.println("List With Duplicates : " + set);
    }
}
