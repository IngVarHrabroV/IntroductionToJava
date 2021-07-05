package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task04 {
    /**
     * Given is sequence of real numbers a1, a2, ... , an.
     * Swap max element and min element.
     *
     * @return array with swap elements
     */

    public static double[] swapElements(double[] initialArray) {
        double minElement = initialArray[0];
        double maxElement = initialArray[0];
        int indexMinElement = 0;
        int indexMaxElement = 0;

        double[] finishArray = new double[initialArray.length];

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] < minElement) {
                minElement = initialArray[i];
                indexMinElement = i;
            }
        }

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] > maxElement) {
                maxElement = initialArray[i];
                indexMaxElement = i;
            }
        }

        for (int i = 0; i < initialArray.length; i++) {
            finishArray[i] = initialArray[i];

            if (i == indexMinElement) {
                finishArray[i] = maxElement;
            }

            if (i == indexMaxElement) {
                finishArray[i] = minElement;
            }
        }

        return finishArray;
    }
}
