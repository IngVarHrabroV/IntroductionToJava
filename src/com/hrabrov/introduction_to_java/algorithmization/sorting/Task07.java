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

    private static int[] indexesForInsert(int[] mainArray, int[] insertArray) {
        if (Helper.isSorted(mainArray) && Helper.isSorted(insertArray)) {
            final int sizeOfInsertArray = insertArray.length;
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

    /**
     * See {@link #indexesForInsert(int[], int[])} docs for more details
     */
    public static void run(int[] mainArray, int[] insertArray) {
        System.out.println("Result of task 07: ");
        System.out.println("Main sequence: " + Helper.arrayToString(mainArray));
        System.out.println("Insert sequence: " + Helper.arrayToString(insertArray));

        int[] resultOfTask07 = indexesForInsert(mainArray, insertArray);

        if (resultOfTask07 == null) {
            System.out.println("Sequences aren't ascending");
            return;
        }

        System.out.println("Indexes in new sequence for insertion: " + Helper.arrayToString(resultOfTask07));
    }
}