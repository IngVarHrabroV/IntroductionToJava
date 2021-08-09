package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task01 {
    /**
     * Find the greatest common divisor (gcd) for two natural numbers
     *
     * @param firstNumber  input natural number
     * @param secondNumber input natural number
     * @return gcd these numbers
     */

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
     * Find the lowest common multiple (lcm) for two natural numbers
     *
     * @param firstNumber  input natural number
     * @param secondNumber input natural number
     * @return lcm these numbers
     */

    private static int findLCM(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber / (findGCD(firstNumber, secondNumber));
    }

    /**
     * See {@link #findGCD(int, int)} and {@link #findLCM(int, int)} docs for more details
     */
    public static void run(int firstNumber, int secondNumber) {
        System.out.println("Result of task 01: ");

        if (firstNumber < 1 || secondNumber < 1) {
            System.out.println("You can't enter non-natural number");
            return;
        }

        System.out.println("The greatest common divisor: " + findGCD(firstNumber, secondNumber));
        System.out.println("The lowest common multiple: " + findLCM(firstNumber, secondNumber));
    }
}
