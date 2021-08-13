package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task10 {
    public static void run(int n) {
        if (!Helper.isNatural(n)) {
            return;
        }

        int[] resultOfTask10 = DigitsFromNumber.takeDigits(n);
        System.out.println("Result of task 10: " + Helper.arrayToString(resultOfTask10));
    }
}
