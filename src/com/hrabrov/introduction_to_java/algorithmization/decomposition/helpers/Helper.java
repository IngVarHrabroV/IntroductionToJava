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
            System.out.println("You can't enter non-natural number");
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
}
