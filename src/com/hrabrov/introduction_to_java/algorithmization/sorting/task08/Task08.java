package com.hrabrov.introduction_to_java.algorithmization.sorting.task08;

import com.hrabrov.introduction_to_java.algorithmization.sorting.Helper;

public class Task08 {
    /**
     * Given fractions p1/q1, p2/q2, ..., pn/qn, where numerator and denominator are natural numbers.
     * Bring fractions to a common denominator and arrange in ascending order
     */

    private static Fraction[] arrangeFractions(Fraction[] array) {
        int commonDenominator = findLCM(array);
        castingOfNumerator(array, commonDenominator);
        sortedFractions(array);
        return array;
    }

    private static void castingOfNumerator(Fraction[] array, int commonDenominator) {
        for (int i = 0; i < array.length; i++) {
            array[i].numerator = array[i].numerator * (commonDenominator / array[i].denominator);
            array[i].denominator = commonDenominator;
        }
    }

    private static void sortedFractions(Fraction[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].numerator < array[i].numerator) {
                    int temp = array[i].numerator;
                    array[i].numerator = array[j].numerator;
                    array[j].numerator = temp;
                }
            }
        }
    }

    private static int findLCM(Fraction[] array) {
        int lcm = 1;
        for (int i = 0; i < array.length; i++) {
            lcm = lcm * array[i].denominator / findGCD(lcm, array[i].denominator);
        }

        return lcm;
    }

    private static int findGCD(int a, int b) {
        if (a == b) {
            return a;
        }

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }

        return a + b;
    }

    /**
     * See {@link #arrangeFractions(Fraction[])} docs for more details
     */
    public static void run(Fraction[] array) {
        System.out.println("Result of task 08:");
        System.out.println("Original fractions: " + Helper.fractionsToString(array));

        Fraction[] resultOfTask08 = arrangeFractions(array);
        System.out.println("Sorted fractions: " + Helper.fractionsToString(resultOfTask08));
    }
}
