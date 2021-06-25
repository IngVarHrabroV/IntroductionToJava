package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

public class Task08 {
    /**
     * Given two numbers. Found identical numerals for both numbers.
     *
     * @param x input first number
     * @param y input second number
     * @return identical numerals for both numbers
     */

    public static String identicalNumeralsForTwoNumbers(double x, double y) {
        String identicalNumerals = "";
        String firstNumber;
        String secondNumber;

        firstNumber = numberWithoutDuplicate(x);
        secondNumber = numberWithoutDuplicate(y);

        char tempChar;
        for (int i = 0; i < firstNumber.length(); i++) {
            tempChar = firstNumber.charAt(i);
            if (secondNumber.indexOf(tempChar) != -1) {
                identicalNumerals += String.valueOf(tempChar);
            }
        }

        return identicalNumerals;
    }

    public static String numberWithoutDuplicate(double a) {
        String numberToString;
        int numberToStringLength;

        numberToString = Double.toString(a).replace(".", "");
        numberToStringLength = numberToString.length();

        String numberWithoutDuplicate = "";
        char tempChar;
        for (int i = 0; i < numberToStringLength - 1; i++) {
            tempChar = numberToString.charAt(i);
            if (numberWithoutDuplicate.indexOf(tempChar) == -1) {
                numberWithoutDuplicate += String.valueOf(tempChar);
            }
        }

        return numberWithoutDuplicate;
    }
}
