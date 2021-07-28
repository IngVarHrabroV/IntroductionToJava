package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task01 {
    /**
     * Given two one-dimensional array with different number of elements and natural number k.
     * Combine two array into one array by including the second array between k and k + 1 elements
     * of the first. You can use only two given array and one concatenated array.
     *
     * @param firstArray  input array
     * @param secondArray input array
     * @param k           input position for first array where to insert second array
     * @return concatenated array
     */

    public static int[] concatenatingArrays(int[] firstArray, int[] secondArray, int k) {
        int sizeOfFirstArray = firstArray.length;

        if (checkValidityOfTheInsertionPosition(sizeOfFirstArray, k)) {
            return firstArray;
        }

        int insertionIndex = k - 1;
        int[] concatenatedArray;
        int sizeOfSecondArray = secondArray.length;
        concatenatedArray = new int[sizeOfFirstArray + sizeOfSecondArray];

        for (int i = 0; i < concatenatedArray.length; i++) {
            if (i <= insertionIndex) {
                concatenatedArray[i] = firstArray[i];
            } else if (i > sizeOfSecondArray + insertionIndex) {
                concatenatedArray[i] = firstArray[i - sizeOfSecondArray];
            } else {
                concatenatedArray[i] = secondArray[i - insertionIndex - 1];
            }
        }

        return concatenatedArray;
    }

    private static boolean checkValidityOfTheInsertionPosition(int sizeOfArray, int checkedValue) {
        if (checkedValue < 0 || checkedValue >= sizeOfArray) {
            System.out.println("Incorrect insert position");
            return true;
        }

        return false;
    }
}
