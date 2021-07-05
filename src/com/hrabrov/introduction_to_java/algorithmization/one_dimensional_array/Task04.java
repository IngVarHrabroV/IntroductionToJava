package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task04 {
    /**
     * Given is sequence of real numbers a1, a2, ... , an.
     * Swap max element and min element.
     *
     * @return array with swap elements
     */

    public static double[] swapElements(double[] initialArray) {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < initialArray.length; i++) {
            if (initialArray[i] < initialArray[minIndex]) {
                minIndex = i;
            }

            if (initialArray[i] > initialArray[maxIndex]) {
                maxIndex = i;
            }
        }

        double temp;
        temp = initialArray[minIndex];
        initialArray[minIndex] = initialArray[maxIndex];
        initialArray[maxIndex] = temp;

        return initialArray;
    }
}
