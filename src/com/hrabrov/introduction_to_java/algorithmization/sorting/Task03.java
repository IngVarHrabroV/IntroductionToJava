package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task03 {
    /**
     * You are given a sequence of numbers a1 <= a2 <= ... <= an.
     * Arrange items in descending order using selection sort.
     *
     * @param sequence input sequence
     * @return sorted sequence
     */

    private static int[] selectionSort(int[] sequence) {
        if(!Helper.isSorted(sequence)) {
            return null;
        }

        for (int i = 0; i < sequence.length; i++) {
            int indexOfMaxValue = findIndexOfMaxValueOnSegment(sequence, i);

            int temp = sequence[i];
            sequence[i] = sequence[indexOfMaxValue];
            sequence[indexOfMaxValue] = temp;
        }

        return sequence;
    }

    private static int findIndexOfMaxValueOnSegment(int[] array, int startOfSegmentForSearch) {
        int indexOfMaxValue = startOfSegmentForSearch;
        int maxValue = array[indexOfMaxValue];
        for (int i = startOfSegmentForSearch + 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexOfMaxValue = i;
            }
        }

        return indexOfMaxValue;
    }

    /**
     * See {@link #selectionSort(int[])} docs for more details
     */
    public static void run(int[] sequence) {
        System.out.println("Result of task 03: ");
        System.out.println("Original sequence: " + Helper.arrayToString(sequence));

        int[] resultOfTask03 = selectionSort(sequence);

        if (resultOfTask03 == null) {
            System.out.println("Sequence isn't ascending");
            return;
        }

        System.out.println("Sorted sequence " + Helper.arrayToString(resultOfTask03));
    }
}
