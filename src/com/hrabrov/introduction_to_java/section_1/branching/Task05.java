package com.hrabrov.introduction_to_java.section_1.branching;

public class Task05 {
    /**
     * Find function value: x^2 - 3 * x + 9, if x <= 3; 1 / (x^3 + 6), if x > 3
     *
     * @param x input value
     * @return function value
     */

    public static double calculateFinctionValue(double x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
