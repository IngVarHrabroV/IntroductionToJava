package com.hrabrov.introduction_to_java.basic_of_software_code_development.cicle;

public class Task03 {
    /**
     * Find sum of square hundred numbers starting x (inclusive x) with increment h
     *
     * @param x input integer start value
     * @param h input integer increment
     * @return sum of square hundred number
     */

    public static long sumSquareHundredNumbers(long x, int h) {
        long sumOfSquare = 0;

        for (int i = 0; i < 100; i++) {
            long nextToNum = i * h;

            sumOfSquare = Math.addExact(sumOfSquare, (long) Math.pow(x + nextToNum, 2));
        }

        return sumOfSquare;
    }
}
