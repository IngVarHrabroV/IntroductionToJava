package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task04 {
    /**
     * Given sequence. Arrange items in ascending order using exchange sort and
     * count permutation
     *
     * @param sequence input sequence
     * @return sorted sequence
     */

    private static SortedArrayAndQuantityPermutation exchangeSort(int[] sequence) {
        SortedArrayAndQuantityPermutation returnedObject = new SortedArrayAndQuantityPermutation();

        boolean isSorted = false;
        int countPermutation = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] > sequence[i + 1]) {
                    int temp = sequence[i];
                    sequence[i] = sequence[i + 1];
                    sequence[i + 1] = temp;
                    countPermutation++;
                    isSorted = false;
                }
            }
        }

        returnedObject.quantityPermutation = countPermutation;
        returnedObject.sortedArray = sequence;

        return returnedObject;
    }

    static class SortedArrayAndQuantityPermutation {
        int[] sortedArray;
        int quantityPermutation;
    }

    /**
     * See {@link #exchangeSort(int[])} docs for more details
     */

    public static void run(int[] sequence) {
        System.out.println("Result of task 04:");
        System.out.println("Original array: " + Helper.arrayToString(sequence));

        SortedArrayAndQuantityPermutation resultOfTask04 = exchangeSort(sequence);

        System.out.println("Sorted array: " + Helper.arrayToString(resultOfTask04.sortedArray));
        System.out.println("Quantity permutation: " + resultOfTask04.quantityPermutation);
    }
}