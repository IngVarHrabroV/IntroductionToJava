package com.hrabrov.introduction_to_java.section_1.linear;

public class Task02 {
    /**
     * Find expression value = (b + Sqrt[b^2 + 4 * a * c]) / 2 * a - a^3 * c - b^-2
     *
     * @param a input variable
     * @param b input variable
     * @param c input variable
     * @return expression value
     */

    public static double calculateExpression(double a, double b, double c) {
        double numerator;
        double leftPart;
        double rightPart;

        numerator = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        leftPart = numerator / (2 * a);
        rightPart = Math.pow(a, 3) * c + Math.pow(b, -2);

        return leftPart - rightPart;
    }
}
