UtilityFunctions Java Project

This project includes utility functions to generate random lists, count occurrences of elements, and sort lists of integers.

Features

generateRandomList(size): Generates a list of random integers.
countOccurrences(list): Counts occurrences of each integer in a list.
sortList(list): Sorts a list of integers in ascending order.
Setup

Clone the repository (if applicable).
Import the project into Eclipse.
Add JUnit 5 to the build path:
Right-click the project > Build Path > Add Libraries > JUnit 5.
Running Tests

Right-click UtilityFunctionsTest.java > Run As > JUnit Test.

Example Usage

List<Integer> randomList = UtilityFunctions.generateRandomList(10);
Map<Integer, Integer> occurrences = UtilityFunctions.countOccurrences(randomList);
List<Integer> sortedList = UtilityFunctions.sortList(randomList);
