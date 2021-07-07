package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class Task06 {
    /**
     * A sequence of N real numbers is given.
     * Found the sum of numbers whose ordinal numbers are prime numbers.
     *
     * @param sequenceN input array with real numbers
     * @return sum numbers
     */

    public static double sumPrimeNumber(double[] sequenceN) {
        double sumNumbersWithPrimeOrdinalsNumber = 0;

        for (int i = 0; i < sequenceN.length; i++) {
            if (checkNumberForPrime(i + 1)) {    //ordinal number more on 1, then index
                sumNumbersWithPrimeOrdinalsNumber += sequenceN[i];
            }
        }

        return sumNumbersWithPrimeOrdinalsNumber;
    }

    public static boolean checkNumberForPrime(int numberForCheck) {
        if (numberForCheck == 1) {
            return false;
        }

        int opportunityDivisor;
        opportunityDivisor = (int) Math.sqrt(numberForCheck);

        for (int i = 2; i <= opportunityDivisor; i++) {
             if (numberForCheck % i == 0) {
                 return false;
             }
        }

        return true;
    }
}
