package com.hrabrov.introduction_to_java.section_1.linear;

public class Task03 {
    /**
     * Find expression value = (sin x + cos y) / (cos x - sin y) * tg x * y;
     *
     * @param x input variable equals anything angle
     * @param y input variable equals anything angle
     * @return expression value
     */

    public static double calculateTrigonometryExpression(double x, double y) {
        double numerator, denominator;

        numerator = Math.sin(x) + Math.cos(y);
        denominator = Math.cos(x) - Math.sin(y);
        return numerator / denominator * Math.tan(x * y);
    }
}
