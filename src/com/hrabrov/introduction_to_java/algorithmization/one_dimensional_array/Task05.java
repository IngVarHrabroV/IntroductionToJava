package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task05 {
    /**
     * Integers number a1, a2, ... , an are given.
     * Print only those number which a[i] > i.
     *
     * @param array input array with integers number
     * @return string with number
     */

    public static String selectElement (int[] array) {
        String selectElement = "";

        for (int i = 0; i < array.length; i++) {
            selectElement += array[i] > i + 1 ? array[i] + " " : "";
        }

        return selectElement;
    }
}
