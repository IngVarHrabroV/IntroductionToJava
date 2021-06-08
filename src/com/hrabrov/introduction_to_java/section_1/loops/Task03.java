package com.hrabrov.introduction_to_java.section_1.loops;

public class Task03 {
    /**
     * Find sum of square hundred numbers starting x (include x) with increment h
     *
     * @param x input start value
     * @param h input increment
     * @return sum of square hundred number
     */

    public static double sumSquareHundredNumbers(double x, double h) {
        double sumOfSquare = 0;

        for (int i = 0; i < 100; i++) {
            sumOfSquare += Math.pow(x + i * h, 2);
        }
        return sumOfSquare;
    }
}
