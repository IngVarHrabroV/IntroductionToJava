package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task03 {
    /**
     * You are given a sequence of numbers a1 <= a2 <= ... <= an.
     * Arrange items in descending order using selection sort.
     *
     * @param sequencer input sequence
     * @return sorted sequence
     */

    public static int[] selectionSort(int[] sequencer) {

        int temp;
        for (int i = 0; i < sequencer.length; i++) {
            int indexOfMaxValue = findIndexOfMaxValueOnSegment(sequencer, i);

            temp = sequencer[i];
            sequencer[i] = sequencer[indexOfMaxValue];
            sequencer[indexOfMaxValue] = temp;
        }

        return sequencer;
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
}
