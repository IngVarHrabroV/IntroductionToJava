package com.hrabrov.introduction_to_java.basic_of_software_code_development.cicle;

public class Task04 {
    /**
     * Find multiply of square two hundred numbers starting x (inclusive x) with increment h
     *
     * @param x input start value
     * @param h input increment value
     * @return multiply of square two hundred number
     */

    public static String multiplySquareTwoHundredNumbers(long x, int h) {
        long multiplyOfSquare;
        long numberOfSquare;
        String multiplyOfSquareToString;

        multiplyOfSquare = 1;

        for (int i = 0; i < 200; i++) {
            int stepToNextNumber;

            stepToNextNumber = i * h;
            numberOfSquare = (long) Math.pow(x + stepToNextNumber, 2);

            try{
            multiplyOfSquare = Math.multiplyExact(multiplyOfSquare, numberOfSquare) ;
            } catch (ArithmeticException e) {
                return "Variable type long is overflow";
            }
        }

        multiplyOfSquareToString = Long.toString(multiplyOfSquare);

        return multiplyOfSquareToString;
    }
}
