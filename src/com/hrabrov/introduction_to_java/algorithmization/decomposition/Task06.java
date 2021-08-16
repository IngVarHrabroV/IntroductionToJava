package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task06 {
    /**
     * Check, are given three numbers mutually simple?
     *
     * @param a input first number
     * @param b input second number
     * @param c input thirty number
     * @return true, if numbers are mutually simple and false, if it isn't
     */

    private static boolean isMutuallySimple(int a, int b, int c) {
        int[] numbers = new int[]{a, b, c};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (findGCD(numbers[i], numbers[j]) != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int findGCD(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return firstNumber;
        }

        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }

        return firstNumber + secondNumber;
    }

    /**
     * See {@link #isMutuallySimple(int, int, int)} docs for more details
     */
    public static void run(int a, int b, int c) {
        boolean resultOfTask06 = isMutuallySimple(a, b, c);
        System.out.print("Result of task 06: ");
        if (resultOfTask06) {
            System.out.println("these three numbers are mutually simple");
        } else {
            System.out.println("these three numbers AREN'T mutually simple");
        }
    }
}
