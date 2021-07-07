package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task09 {
    /**
     * Integer numbers array is given. Find the most common number.
     * If this are several numbers, found min value.
     *
     * @param arrayWithIntegerNumber input array with integer numbers
     * @return min value most common number
     */

    public static int mostCommonNumber(int[] arrayWithIntegerNumber) {
        int mostCommonNumber = arrayWithIntegerNumber[0];
        int countMaxEquivalent = 0;

        int indexForSecondLoop = 1;
        for (int i = 0; i < arrayWithIntegerNumber.length - 1; i++) {
            int tempCountEquivalent = 0;

            for (int j = indexForSecondLoop; j < arrayWithIntegerNumber.length; j++) {
                if (arrayWithIntegerNumber[i] == arrayWithIntegerNumber[j]) {
                    tempCountEquivalent++;
                }
            }
            indexForSecondLoop++;

            if (tempCountEquivalent > countMaxEquivalent) {
                mostCommonNumber = arrayWithIntegerNumber[i];
                countMaxEquivalent = tempCountEquivalent;
                tempCountEquivalent = 0;
            }

            if (tempCountEquivalent == countMaxEquivalent) {
                mostCommonNumber = Math.min(mostCommonNumber, arrayWithIntegerNumber[i]);
            }
        }

        return mostCommonNumber;
    }
}
