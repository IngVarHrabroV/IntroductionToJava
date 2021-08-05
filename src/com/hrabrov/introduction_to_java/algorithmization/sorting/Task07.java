package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task07 {
    /**
     * Given two ascending sequences: a1 <= a2 <= ... <= an and b1 <= b2 <= ... <= bm.
     * Indicate places which requiring elements of second sequence to be entered in first sequence,
     * so that new sequence is ascending also.
     *
     * @param mainArray   input ascending sequence
     * @param insertArray input ascending sequence to insert into
     * @return array with indexes in new sequence for insert
     */

    public static int[] indexesForInsert(int[] mainArray, int[] insertArray) {
        if (isSorted(mainArray) && isSorted(insertArray)) {
            int sizeOfInsertArray = insertArray.length;
            int[] indexesForEntering = new int[sizeOfInsertArray];

            for (int i = 0; i < sizeOfInsertArray; i++) {
                indexesForEntering[i] = binarySearch(mainArray, insertArray[i]) + i;
            }

            return indexesForEntering;
        }
        return null;
    }

    private static int binarySearch(int[] sortedArray, int numberForInsert) {
        int startIndex = 0;
        int finishIndex = sortedArray.length;

        while (startIndex < finishIndex) {
            int middleIndex = startIndex + (finishIndex - startIndex) / 2;

            if (numberForInsert < sortedArray[middleIndex]) {
                finishIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        if (startIndex > sortedArray.length - 1) {
            return startIndex;
        }
        if (numberForInsert > sortedArray[startIndex]) {
            return startIndex + 1;
        }

        return startIndex;
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
