package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.DigitsFromNumber;

public class Task16 {
    /**
     * Find sum n-digits numbers, which have only odd digits and find how many even digits in number of sum.
     *
     * @param digitCapacity input digit capacity of numbers
     * @return object with sum and quantity Even Digits
     */

    private static SumAndQuantityHerEvenDigits findSumAndQuantityHerEvenDigits(int digitCapacity) {
        SumAndQuantityHerEvenDigits sumAndQuantityHerEvenDigits = new SumAndQuantityHerEvenDigits();
        final int startOfSequence = (int) Math.pow(10, digitCapacity - 1);
        final int endOfSequence = ((int) Math.pow(10, digitCapacity)) - 1;

        for (int i = startOfSequence; i <= endOfSequence; i++) {
            if (isNumberHasOnlyOddDigits(i)) {
                sumAndQuantityHerEvenDigits.sum += i;
            }
        }

        sumAndQuantityHerEvenDigits.quantityEvenDigits = quantityEvenDigits(sumAndQuantityHerEvenDigits.sum);

        return sumAndQuantityHerEvenDigits;
    }

    private static int quantityEvenDigits(int number) {
        int[] digits = DigitsFromNumber.takeDigits(number);

        int quantityEvenDigits = 0;
        for (int i = 0; i < digits.length; i++) {
            if (isEvenNumber(digits[i])) {
                quantityEvenDigits++;
            }
        }

        return quantityEvenDigits;
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static boolean isNumberHasOnlyOddDigits(int currentNumber) {
        int[] digits = DigitsFromNumber.takeDigits(currentNumber);

        for (int i = 0; i < digits.length; i++) {
            if (isEvenNumber(digits[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * See {@link #findSumAndQuantityHerEvenDigits(int)} for more details
     */
    public static void run(int digitCapacity) {
        System.out.println("Result of task 16: ");
        SumAndQuantityHerEvenDigits resultOfTask16 = findSumAndQuantityHerEvenDigits(digitCapacity);
        System.out.println("Sum n-digits numbers, which have only odd digits: " + resultOfTask16.sum);
        System.out.println("Quantity of even digits in number of sum: " + resultOfTask16.quantityEvenDigits);
    }

    static class SumAndQuantityHerEvenDigits {
        int sum = 0;
        int quantityEvenDigits = 0;
    }
}
