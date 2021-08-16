package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task07 {
    /**
     * Find sum of factorial of odd numbers from 1 to 9
     *
     * @return sum of factorial
     */

    private static int sumOfFactorial() {
        final int lastValue = 9;
        int sumOfFactorialOfOddNumber = 0;

        for (int i = 1; i <= lastValue; i += 2) {
            sumOfFactorialOfOddNumber += findFactorial(i);
        }

        return sumOfFactorialOfOddNumber;
    }

    private static int findFactorial(int currentNumber) {
        int factorial = 1;
        for (int i = 2; i <= currentNumber; i++) {
            factorial *= i;
        }

        return factorial;
    }

    /**
     * See {@link #findFactorial(int)} docs for more details
     */

    public static void run() {
        System.out.println("Result of task 07: " + sumOfFactorial());
    }
}
