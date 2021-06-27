package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

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
        double maxNumber;
        double minFirstPart;
        double minSecondPart;

        minFirstPart = a > b ? b : a;
        minSecondPart = c > d ? d : c;
        maxNumber = minFirstPart > minSecondPart ? minFirstPart : minSecondPart;

        String sentence;
        sentence = maxNumber > 0 ? "positive" : "negative";

        return "Magic number is " + sentence;
    }
}
