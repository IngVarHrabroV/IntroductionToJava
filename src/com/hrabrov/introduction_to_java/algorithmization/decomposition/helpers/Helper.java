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
        return new int[]{1, 1, 4, 1, 1, 5, 8, 8, 5, 5, 12, 3, 17, 5};
    }
}
