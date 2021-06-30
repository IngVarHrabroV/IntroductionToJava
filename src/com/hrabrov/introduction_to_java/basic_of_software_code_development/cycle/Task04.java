package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

public class Task04 {
    /**
     * Find multiply of square two hundred numbers starting x (inclusive x) with increment h
     *
     * @param x input start value
     * @param h input increment value
     * @return multiply of square two hundred number
     */

    public static String multiplySquareTwoHundredNumbers(long x, int h) {
        long resultMultiplyOfSquare;
        long nextNumberOfSquare;

        resultMultiplyOfSquare = 1;

        int stepToNextNumber;
        for (int i = 0; i < 200; i++) {
            if (h > 10737418) {
                return "The increment is large, enter another number";
            }

            stepToNextNumber = i * h;
            nextNumberOfSquare = (long) Math.pow(x + stepToNextNumber, 2);

            if (resultMultiplyOfSquare > resultMultiplyOfSquare * nextNumberOfSquare) {
                return "The answer variable is overflowed, try entering less start value or other the increment";
            }

            resultMultiplyOfSquare = resultMultiplyOfSquare * nextNumberOfSquare;
        }

        return Long.toString(resultMultiplyOfSquare);
    }
}
