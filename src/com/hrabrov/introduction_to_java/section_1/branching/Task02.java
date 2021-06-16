package com.hrabrov.introduction_to_java.section_1.branching;

public class Task02 {
    /**
     * Found max{min(a, b), min(c, d)} and return positive phrase, if it is more that 0,
     * else - negative phrase.
     *
     * @param a input 1th variable to left-part
     * @param b input 2th variable to left-part
     * @param c input 1th variable to right-part
     * @param d input 2th variable to right-part
     * @return "Magic number is positive" if max{min(a, b), min(c, d)} more 0,
     * else - "Magic number is negative"
     */

    public static String maxMinValue(double a, double b, double c, double d) {
        double k;

        k = Math.max(Math.min(a, b), Math.min(c, d));

        if (k > 0) {
            return "Magic number is positive";
        } else {
            return "Magic number is negative";
        }
    }
}
