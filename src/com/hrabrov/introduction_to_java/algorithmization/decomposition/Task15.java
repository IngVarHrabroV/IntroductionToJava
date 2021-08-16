package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.DigitsFromNumber;
import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.Helper;

public class Task15 {
    final static int EMPTY_ARRAY = 0;

    /**
     * Given number n. Find all т-digit number whose digits from a strictly ascending sequence
     * @param  digitCapacity input digit capacity of numbers;
     * @return array with numbers
     */

    private static int[] findNumbersWithRequiredDigitCapacity(int digitCapacity) {
        final int startOfSequence = (int) Math.pow(10, digitCapacity - 1);
        final int endOfSequence = ((int) Math.pow(10, digitCapacity)) - 1;
        int[] arrayWithNumber = new int[]{EMPTY_ARRAY};

        for (int i = startOfSequence; i <= endOfSequence ; i++) {
            if (isStrictlyAscendingSequence(i)) {
                arrayWithNumber = addToArray(i, arrayWithNumber);
            }
        }

        return arrayWithNumber;
    }

    private static int[] addToArray(int number, int[] array) {
        if (array[0] == EMPTY_ARRAY) {
            array[0] = number;
            return array;
        }

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = number;

        return newArray;
    }

    private static boolean isStrictlyAscendingSequence(int currentNumber) {
        int[] digitsOfNumber = DigitsFromNumber.takeDigits(currentNumber);

        for (int i = 0; i < digitsOfNumber.length - 1; i++) {
           if (digitsOfNumber[i] + 1 != digitsOfNumber[i + 1]) {
           return false;
           }
        }

        return true;
    }

    public static void run(int digitCapacity){
        System.out.println("Result of task15: ");
        int[] resultOfTask15 = findNumbersWithRequiredDigitCapacity(digitCapacity);
        System.out.println(Helper.arrayToString(resultOfTask15));

    }
}
