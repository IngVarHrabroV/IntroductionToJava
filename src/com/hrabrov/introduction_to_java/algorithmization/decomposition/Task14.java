package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.DigitsFromNumber;
import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.Helper;

public class Task14 {
    final static int EMPTY_ARRAY = 0;

    /**
     * Given number N. Find all Armstrong's numbers from 1 to N.
     *
     * @param endOfSegment input end numbers
     * @return array with Armstrong's numbers
     */

    private static int[] findArmstrongsNumbers(int endOfSegment) {
        int[] armstrongsNumbers = new int[]{EMPTY_ARRAY};

        for (int i = 1; i <= endOfSegment; i++) {
            final int digitCapacity = DigitsFromNumber.quantityOfDigitsOf(i);
            final int sumOfDigit = DigitsFromNumber.findSumOfDigit(i);
            final int sumOfDigitToPowerOfDigitCapacity = (int) Math.pow(sumOfDigit, digitCapacity);
            if (sumOfDigitToPowerOfDigitCapacity == i) {
                armstrongsNumbers = Helper.addToArray(i, armstrongsNumbers);
            }
        }
        return armstrongsNumbers;
    }

    /**
     * See {@link #findArmstrongsNumbers(int)} docs for more details
     */

    public static void run(int endOfSegment) {
        System.out.println("Result of task 14: ");
        int[] resultOfTask14 = findArmstrongsNumbers(endOfSegment);
        System.out.println(Helper.arrayToString(resultOfTask14));
    }
}
