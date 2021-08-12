package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task14 {
    final static int EMPTY_ARRAY = 0;

    /**
     * Given number N. Find all Armstrong's numbers from 1 to N.
     *
     * @param endOfSegment input end numbers
     * @return array with Armstrong's numbers
     */

    private static int[] findArmstrongsNumbers(int endOfSegment) {
        int[] armstrongsNumbers = new int[]{EMPTY_ARRAY};

        for (int i = 1; i <= endOfSegment; i++) {
            final int digitCapacity = findDigitCapacity(i);
            final int sumOfDigit = findSumOfDigit(i, digitCapacity);
            final int sumOfDigitToPowerOfDigitCapacity = (int) Math.pow(sumOfDigit, digitCapacity);
            if (sumOfDigitToPowerOfDigitCapacity == i) {
                armstrongsNumbers = addToArray(i, armstrongsNumbers);
            }
        }
        return armstrongsNumbers;
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

    private static int findSumOfDigit(int number, int digitCapacity) {
        int sumOfDigit = 0;

        for (int i = 0; i < digitCapacity; i++) {
            sumOfDigit += number % 10;
            number /= 10;

        }
        return sumOfDigit;
    }

    private static int findDigitCapacity(int number) {
        int digit = 1;
        while (number / (int) Math.pow(10, digit) != 0) {
            digit++;
        }

        return digit;
    }

    /**
     * See {@link #findArmstrongsNumbers(int)} docs for more details
     */

    public static void run(int endOfSegment) {
        System.out.println("Result of task 14: ");
        int[] resultOfTask14 = findArmstrongsNumbers(endOfSegment);
        System.out.println(Helper.arrayToString(resultOfTask14));
    }
}
