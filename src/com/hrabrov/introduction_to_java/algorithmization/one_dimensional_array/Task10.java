package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task10 {
    /**
     * Integer numbers array is given.
     * Shrink the array, discarding every second element from it (fill the released elements with zeros).
     * P.s. you cannot use auxiliary array.
     *
     * @param arrayWithInteger input array with integer numbers
     * @return new array with zero into every second element
     */

    public static int[] zeroIntoSecondElement(int[] arrayWithInteger) {
        int countReplace = arrayWithInteger.length / 2;

        int indexForReplace = 0;
        for (int i = 0; i < arrayWithInteger.length; i++) {
            if (i < arrayWithInteger.length - countReplace) {
                arrayWithInteger[i] = arrayWithInteger[i + indexForReplace];
            } else {
                arrayWithInteger[i] = 0;
            }
            indexForReplace += 1;
        }

        return arrayWithInteger;
    }
}
