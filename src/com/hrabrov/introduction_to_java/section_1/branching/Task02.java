package com.hrabrov.introduction_to_java.section_1.branching;

public class Task02 {
    /**
     * Found max{min(a, b), min(c, d)} and return positive phrase, if it is more that 0,
     * else - negative phrase.
     *
     * @param a input value
     * @param b input value
     * @param c input value
     * @param d input value
     * @return max{min(a, b), min(c, d)}
     */

    public static String maxMinValue(double a, double b, double c, double d) {
        double k = Math.max(Math.min(a, b), Math.min(c, d));
        if (k > 0) {
            return "Magic number is positive";
        } else {
            return "Magic number is negative";
        }
    }
}
