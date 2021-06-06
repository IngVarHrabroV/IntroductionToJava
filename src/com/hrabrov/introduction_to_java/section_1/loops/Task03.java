package com.hrabrov.introduction_to_java.section_1.loops;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task03 {
    /**
     * Find sum of square first hundred numbers starting x (include x) with increment h
     *
     * @param x input value
     * @param h input value
     * @return sum of square first hundred number
     */

    public static double squareFirstHundred(double x, double h) {
        //BigDecimal sumOfSquare = new BigDecimal(x);
        double sumOfSquare = 0;

        for (double i = 0; i < 100 * h; i += h) {
            sumOfSquare += Math.pow(x + i, 2);
        }
        return sumOfSquare;
    }
}
