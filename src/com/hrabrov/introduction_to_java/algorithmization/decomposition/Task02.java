package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.Helper;

public class Task02 {
    /**
     * Find the greatest common divisor (gcd) for four natural numbers
     *
     * @param firstNumber  input natural number
     * @param secondNumber input natural number
     * @param thirdNumber  input natural number
     * @param fourthNumber input natural number
     * @return gcd these numbers
     */

    private static int findGCDForFourNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int[] numbers = new int[4];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        numbers[3] = fourthNumber;

        int gcd = firstNumber;

        for (int i = 1; i < numbers.length; i++) {
            gcd = Helper.findGCD(gcd, numbers[i]);
        }

        return gcd;
    }

    /**
     * See {@link #findGCDForFourNumber(int, int, int, int)} docs for more details
     */
    public static void run(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int resultOfTask02 = findGCDForFourNumber(firstNumber, secondNumber, thirdNumber, fourthNumber);
        System.out.println("Result of task 02: " + resultOfTask02);
    }
}
