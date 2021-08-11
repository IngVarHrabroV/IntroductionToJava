package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task10 {
    /**
     * Given a natural number n. Create array, elements of which are the digits of the number n.
     *
     * @param n input a natural number
     * @return array are the digits of the number n
     */

    private static int[] numberToArray(int n) {
        final int quantityOfDigits = quantityOfDigitsOf(n);
        int[] array = new int[quantityOfDigits];

        return feelArray(array, n);
    }

    private static int[] feelArray(int[] array, int n) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }

        return array;
    }

    private static int quantityOfDigitsOf(int n) {
        int digit = 1;
        while (n / (int) Math.pow(10, digit) != 0) {
            digit++;
        }

        return digit;
    }

    public static void run(int n) {
        if (!Helper.isNatural(n)) {
            return;
        }

        int[] resultOfTask10 = numberToArray(n);
        System.out.println("Result of task 10: " + Helper.arrayToString(resultOfTask10));
    }
}
