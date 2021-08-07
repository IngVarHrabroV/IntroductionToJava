package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task05 {
    /**
     * Given a sequence. Arrange items in ascending order using insertion sort.
     * Find index to place items using binary search
     *
     * @param sequence input sequence
     * @return sorted sequence
     */

    private static int[] insertionSort(int[] sequence) {
        if (sequence[0] > sequence[1]) {
            int temp = sequence[0];
            sequence[0] = sequence[1];
            sequence[1] = temp;
        }

        int lastIndexOfSortedSequence = 1;
        for (int i = 2; i < sequence.length; i++) {
            int current = sequence[i];
            int positionForInsert = binarySearch(sequence, lastIndexOfSortedSequence, sequence[i]);

            for (int j = i; j > positionForInsert; j--) {
                sequence[j] = sequence[j - 1];
            }

            sequence[positionForInsert] = current;
            lastIndexOfSortedSequence++;
        }

        return sequence;
    }

    private static int binarySearch(int[] sortedArray, int lastIndexSortedSequence, int numberForInsert) {
        int startIndex = 0;
        int finishIndex = lastIndexSortedSequence;

        while (startIndex < finishIndex) {
            int middleIndex = startIndex + (finishIndex - startIndex) / 2;

            if (numberForInsert < sortedArray[middleIndex]) {
                finishIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        if (numberForInsert > sortedArray[startIndex]) {
            return startIndex + 1;
        }

        return startIndex;
    }

    /**
     * See {@link #insertionSort(int[])} docs for more details
     */
    public static void run(int[] sequence) {
        int[] resultOfTask05 = insertionSort(sequence);

        System.out.println("Result of task 05: " + Helper.arrayToString(resultOfTask05));
    }
}
