package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.*;

public class Task12 {
    final static int EMPTY_ARRAY = 0;

    /**
     * Given numbers k and n. Find all numbers that aren't more than n and whose sum of digits is k.
     * Place these numbers into array.
     *
     * @param k input natural number
     * @param n input natural number
     * @return array with number
     */

    private static int[] createArray(int k, int n) {
        int[] array = new int[]{EMPTY_ARRAY};

        for (int i = 1; i <= n; i++) {
            if (DigitsFromNumber.findSumOfDigit(i) == k) {
                array = Helper.addToArray(i, array);
            }
        }

        return array;
    }

    private static boolean checkArguments(int k, int n) {
        final int firstTwoDigitNumber = 10;
        if (n < firstTwoDigitNumber && k > n) {
            System.out.println("No numbers satisfying the condition ");
            return false;
        }
        return true;
    }

    /**
     * See {@link #createArray(int, int)} docs for more detail
     */
    public static void run(int sumOfDigitOfNumber, int maxValueNumber) {
        if (!Helper.isNatural(sumOfDigitOfNumber) || !Helper.isNatural(maxValueNumber)
                || !checkArguments(sumOfDigitOfNumber, maxValueNumber)) {
            return;
        }

        int[] resultOfTask12 = createArray(sumOfDigitOfNumber, maxValueNumber);
        System.out.println("Result of task 12: " + Helper.arrayToString(resultOfTask12));
    }
}
