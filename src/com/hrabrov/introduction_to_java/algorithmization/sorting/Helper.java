package com.hrabrov.introduction_to_java.algorithmization.sorting;

import com.hrabrov.introduction_to_java.algorithmization.sorting.task08.Fraction;

public class Helper {
    public static String fractionsToString(Fraction[] fractions) {
        String stringWithFractions = "";
        for (int i = 0; i < fractions.length; i++) {
            stringWithFractions += fractions[i].numerator + "/" + fractions[i].denominator + " ";
        }
        return stringWithFractions;
    }

    public static String arrayToString(int[] array) {
        String stringForStorageArrayValues = "";

        for (int i = 0; i < array.length; i++) {
            stringForStorageArrayValues += array[i] + " ";
        }

        return stringForStorageArrayValues;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
