package com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers;

public class Helper {
    public static String arrayToString(int[] array) {
        String stringWithNumber = "";

        for (int i = 0; i < array.length; i++) {
            stringWithNumber += array[i] + " ";
        }

        return stringWithNumber;
    }

    public static boolean isNatural(int n) {
        if (n < 1) {
            System.out.println("You have to enter natural number");
            return false;
        }

        return true;
    }

    public static int[] takeIntArray(int sizeOfArray) {
        final int maxValueOfNumbers = 100;
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = (int) (Math.random() * (maxValueOfNumbers + 1));
        }

        return array;
    }

    /**
     * Find the greatest common divisor (gcd) for two natural numbers
     *
     * @param firstNumber  input natural number
     * @param secondNumber input natural number
     * @return gcd these numbers
     */

    public static int findGCD(int firstNumber, int secondNumber) {
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


    final static int EMPTY_ARRAY = 0;
    public static int[] addToArray(int number, int[] array) {
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
}
