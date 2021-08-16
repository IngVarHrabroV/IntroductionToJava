package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.*;

public class Task10 {
    /**
     * Given a natural number n. Create array, elements of which are the digits of the number n.
     *
     * @param n input a natural number
     * @display array are the digits of the number n
     */

    public static void run(int n) {
        if (!Helper.isNatural(n)) {
            return;
        }

        int[] resultOfTask10 = DigitsFromNumber.takeDigits(n);
        System.out.println("Result of task 10: " + Helper.arrayToString(resultOfTask10));
    }
}
