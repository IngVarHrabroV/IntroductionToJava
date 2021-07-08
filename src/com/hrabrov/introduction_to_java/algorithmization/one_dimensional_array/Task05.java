package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task05 {
    /**
     * Integers number a1, a2, ... , an are given.
     * Print only those number which a[i] > i.
     *
     * @param array input array with integers number
     * @return string with number
     */

    public static int[] selectElement(int[] array) {
        int[] selectElement;

        int lengthArraySelectElement = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] > i) {
                lengthArraySelectElement++;
           }
        }

        selectElement = new int[lengthArraySelectElement];
        int indexSelectElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                selectElement[indexSelectElement] = array[i];
                indexSelectElement++;
            }
        }

        return selectElement;
    }
}
