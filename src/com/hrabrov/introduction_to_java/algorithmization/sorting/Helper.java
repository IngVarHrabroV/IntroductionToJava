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


}
