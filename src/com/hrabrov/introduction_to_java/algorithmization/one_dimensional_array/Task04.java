package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task04 {
    /**
     * Given is sequence of real numbers a1, a2, ... , an.
     * Swap max element and min element.
     *
     * @return array with swap elements
     */

    public static double[] swapElements(double[] initialArray) {
        int indexMaxNumber = 0;
        int indexMinNumber = 0;

        for (int i = 1; i < initialArray.length; i++) {
            if (initialArray[i] < initialArray[indexMinNumber]) {
                indexMinNumber = i;
            }

            if (initialArray[i] > initialArray[indexMaxNumber]) {
                indexMaxNumber = i;
            }
        }

        double temp;
        temp = initialArray[indexMinNumber];
        initialArray[indexMinNumber] = initialArray[indexMaxNumber];
        initialArray[indexMaxNumber] = temp;

        return initialArray;
    }
}
