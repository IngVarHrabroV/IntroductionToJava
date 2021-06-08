package com.hrabrov.introduction_to_java.section_1.loops;

import java.math.BigDecimal;

public class Task04 {
    /**
     * Find multiply of square two hundred numbers starting x (include x) with increment h
     *
     * @param x input start value
     * @param h input increment value
     * @return multiply of square two hundred number
     */

    public static BigDecimal multiplySquareTwoHundredNumbers(double x, double h) {
        BigDecimal multiplyOfSquare = BigDecimal.valueOf(1);

        for (int i = 0; i < 200; i++) {
            BigDecimal numberOfSquare = BigDecimal.valueOf(Math.pow(x + i * h, 2));
            multiplyOfSquare = multiplyOfSquare.multiply(numberOfSquare);
        }

        return multiplyOfSquare;
    }
}
