package com.hrabrov.introduction_to_java.algorithmization.decomposition;

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
}
