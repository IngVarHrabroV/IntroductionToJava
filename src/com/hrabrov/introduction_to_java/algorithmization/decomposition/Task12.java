package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task12 {
    /**
     * Given numbers k and n. Find all numbers that aren't more than n and whose sum of digits is k.
     * Place these numbers into array.
     *
     * @param k input natural number
     * @param n input natural number
     * @return array with number
     */

    private static int[] createArray(int k, int n) {
        int sizeOfArray = 0;
        for (int i = 1; i <= n; i++) {
            if (sumOfDigitOfNumber(i) == k) {
                sizeOfArray++;
            }
        }

        int[] array = new int[sizeOfArray];
        for (int i = 1, tempIndex = 0; i <= n; i++) {
            if (sumOfDigitOfNumber(i) == k) {
                array[tempIndex] = i;
                tempIndex++;
            }
        }

        return array;
    }

    private static int sumOfDigitOfNumber(int currentNumber) {
        int sumOfDigitOfNumber = 0;
        while (currentNumber / 10 > 0) {
            sumOfDigitOfNumber += currentNumber % 10;
            currentNumber /= 10;
        }
        return sumOfDigitOfNumber + currentNumber;
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
