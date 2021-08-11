package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task11 {
    /**
     * Determine which of the given two numbers has more digits
     *
     * @param firstNumber  input first number
     * @param secondNumber input second number
     */

    private static String whoHasMoreDigits(int firstNumber, int secondNumber) {
        final int quantityOfDigitsOfFirstNumber = quantityOfDigitsOf(firstNumber);
        final int quantityOfDigitsOfSecondNumber = quantityOfDigitsOf(secondNumber);

        if (quantityOfDigitsOfFirstNumber == quantityOfDigitsOfSecondNumber) {
            return firstNumber + " is equals " + secondNumber;
        }

        if (quantityOfDigitsOfFirstNumber > quantityOfDigitsOfSecondNumber) {
            return firstNumber + " has more digit than " + secondNumber;

        } else {
            return secondNumber + " has more digit than " + firstNumber;
        }
    }

    private static int quantityOfDigitsOf(int n) {
        int digit = 1;
        while (n / (int) Math.pow(10, digit) != 0) {
            digit++;
        }

        return digit;
    }

    /**
     * See {@link #whoHasMoreDigits(int, int)} docs for more details
     */

    public static void run(int firstNumber, int secondNumber) {
        System.out.println("Result of task 11: " + whoHasMoreDigits(firstNumber, secondNumber));
    }
}
