package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.*;

public class Task10 {
    /**
     * See {@link DigitsFromNumber#takeDigits(int)} docs for more details
     */

    public static void run(int n) {
        if (!Helper.isNatural(n)) {
            return;
        }

        int[] resultOfTask10 = DigitsFromNumber.takeDigits(n);
        System.out.println("Result of task 10: " + Helper.arrayToString(resultOfTask10));
    }
}
