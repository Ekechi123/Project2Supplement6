package com.example.utility;

import java.util.*;

public class UtilityFunctions {

    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100)); // Random numbers between 0 and 99
        }
        return list;
    }

    public static Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer num : list) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        return occurrences;
    }

    public static List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
