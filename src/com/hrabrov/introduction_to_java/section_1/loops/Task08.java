package com.hrabrov.introduction_to_java.section_1.loops;

import java.util.ArrayList;
import java.util.Arrays;

public class Task08 {
    /**
     * Given two numbers. Found identical numerals for both numbers.
     *
     * @param x input first number
     * @param y input second number
     * @return identical numerals for both numbers
     */

    public static ArrayList<Integer> identicalNumeralsForTwoNumbers(double x, double y) {
        ArrayList<Integer> identicalNumeralsArrayList = new ArrayList<>();

        ArrayList<Integer> firstNumberArrayList;
        ArrayList<Integer> secondNumberArrayList;

        firstNumberArrayList = convertNumberToNumeralInArrayList(x);
        secondNumberArrayList = convertNumberToNumeralInArrayList(y);

        for (Integer i : firstNumberArrayList) {
            for (Integer k : secondNumberArrayList) {
                if (i.equals(k)) {
                    identicalNumeralsArrayList.add(i);
                }
            }
        }

        return identicalNumeralsArrayList;
    }

    public static ArrayList<Integer> convertNumberToNumeralInArrayList(double a) {
        String numberToString;
        int numberToStringLength;

        numberToString = Double.toString(a).replace(".", "");
        numberToStringLength = numberToString.length();

        int[] numeralArray = new int[numberToStringLength];

        for (int i = 0; i <= numberToStringLength - 1; i++) {
            numeralArray[i] = Character.getNumericValue(numberToString.charAt(i));
        }

        return numeralArrayWithoutDuplicate(numeralArray, numberToStringLength);
    }

    public static ArrayList<Integer> numeralArrayWithoutDuplicate(int[] numeralArray, int numeralArrayLength) {
        ArrayList<Integer> numeralArrayListWithoutDuplicate = new ArrayList<>();

        Arrays.sort(numeralArray);

        for (int i = 0; i < numeralArrayLength - 1; i++) {
            if (numeralArray[i] != numeralArray[i + 1]) {
                numeralArrayListWithoutDuplicate.add(numeralArray[i]);
            }
        }
        numeralArrayListWithoutDuplicate.add(numeralArray[numeralArrayLength - 1]);

        return numeralArrayListWithoutDuplicate;
    }
}
