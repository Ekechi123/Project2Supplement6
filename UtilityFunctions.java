package com.example.utility;

import java.util.*;

/**
 * UtilityFunctions contains methods for generating random lists,
 * counting occurrences of elements, and sorting lists.
 */
public class UtilityFunctions {

    /**
     * Generates a random list of integers.
     *
     * @param size The size of the list.
     * @return A list of randomly generated integers.
     */
    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100)); // Random numbers between 0 and 99
        }
        return list;
    }

    /**
     * Counts the occurrences of each integer in the given list.
     *
     * @param list The list of integers.
     * @return A map with integers as keys and their occurrences as values.
     */
    public static Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer num : list) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        return occurrences;
    }

    /**
     * Sorts the given list of integers in ascending order.
     *
     * @param list The list of integers.
     * @return The sorted list of integers.
     */
    public static List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
