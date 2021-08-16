package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.*;

public class Task17 {
    /**
     * The sum of its digits was subtracted from the given number, and the action was repeated.
     * How many such actions must be performed to get zero?
     *
     * @param number input number
     * @return quantity of repetition
     */

    private static int subtractSumDigitsFromNumber(int number) {
        int quantityOfSubtracts = 0;

        while (number != 0) {
            int sumDigitsFromNumber = sumDigitsFromNumber(number);
            number -= sumDigitsFromNumber;
            quantityOfSubtracts++;
        }

        return quantityOfSubtracts;
    }

    private static int sumDigitsFromNumber(int number) {
        int[] digits = DigitsFromNumber.takeDigits(number);
        int sumDigits = 0;

        for (int i = 0; i < digits.length; i++) {
            sumDigits += digits[i];
        }

        return sumDigits;
    }

    /**
     * See {@link #subtractSumDigitsFromNumber(int)} docs for more details
     */
    public static void run(int number) {
        System.out.print("Result of task 17: ");
        int resultOfTask17 = subtractSumDigitsFromNumber(number);

        if (!Helper.isNatural(number)) {
            return;
        }

        System.out.println(resultOfTask17);
    }
}
