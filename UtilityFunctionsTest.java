package com.example.utility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

public class UtilityFunctionsTest {

    @Test
    public void testGenerateRandomList() {
        int size = 10;
        List<Integer> randomList = UtilityFunctions.generateRandomList(size);
        
        assertNotNull(randomList);
        assertEquals(size, randomList.size());
        
        for (Integer num : randomList) {
            assertTrue(num instanceof Integer);
        }
    }

    @Test
    public void testCountOccurrences() {
        List<Integer> randomList = List.of(1, 2, 2, 3, 3, 3, 4);
        Map<Integer, Integer> occurrences = UtilityFunctions.countOccurrences(randomList);

        assertNotNull(occurrences);
        assertEquals(4, occurrences.size()); 
        
        assertEquals(1, occurrences.get(1));
        assertEquals(2, occurrences.get(2));
        assertEquals(3, occurrences.get(3));
        assertEquals(1, occurrences.get(4));
    }

    @Test
    public void testSortList() {
        List<Integer> randomList = List.of(3, 1, 4, 2);
        List<Integer> sortedList = UtilityFunctions.sortList(randomList);

        assertNotNull(sortedList);
        assertEquals(List.of(1, 2, 3, 4), sortedList);
    }
}

