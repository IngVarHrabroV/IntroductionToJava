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
                return "Increment is bigger, enter less increment";
            }

            stepToNextNumber = i * h;
            nextNumberOfSquare = (long) Math.pow(x + stepToNextNumber, 2);

            if (resultMultiplyOfSquare > resultMultiplyOfSquare * nextNumberOfSquare) {
               return "Variable is overflow, enter any less start value or increment";
            }
            
            resultMultiplyOfSquare = resultMultiplyOfSquare * nextNumberOfSquare;
        }
        
        return Long.toString(resultMultiplyOfSquare);
    }
}
