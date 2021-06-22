package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

import java.awt.peer.LabelPeer;

public class Task03 {
    /**
     * Find sum of square hundred numbers starting x (inclusive x) with increment h
     *
     * @param x input integer start value
     * @param h input integer increment
     * @return sum of square hundred number
     */

    public static String sumSquareHundredNumbers(long x, int h) {
        long resultSumOfSquare = 0;
        long nextNumberOfSquare;

        int stepToNextNumber;
        for (int i = 0; i < 100; i++) {
            if (h > 21474836) {
                return "Increment is bigger, enter less increment";
            }

            stepToNextNumber = i * h;
            nextNumberOfSquare = (long) Math.pow(x + stepToNextNumber, 2);

            if (resultSumOfSquare > resultSumOfSquare + nextNumberOfSquare) {
                return "Variable is overflow, enter any less start value or increment";
            }

            resultSumOfSquare += nextNumberOfSquare;
        }

        return Long.toString(resultSumOfSquare);
    }
}