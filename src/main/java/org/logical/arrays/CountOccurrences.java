package org.logical.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 2, 4, 3, 2};
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else { // If the number is not present, add it to the HashMap with count 1
                countMap.put(num, 1);
            }
        }
        countMap.keySet().forEach(num -> System.out.println(num + ": " + countMap.get(num)));
        usingJava8(array);
    }

    static void usingJava8(int[] array) {
        Map<Integer, Long> counts = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i, Collectors.counting()
                ));
        counts.forEach((num, count) -> System.out.println("Using java 8 :- " + num + ": " + count));

    }
}
