package com.hrabrov.introduction_to_java.algorithmization.sorting.task08;

public class Fraction {
    public int numerator;
    public int denominator;

    public static Fraction[] getFractions(int amountFraction) {
        final int maxNumerator = 9;
        final int maxDenominator = 10;

        Fraction[] fractions = new Fraction[amountFraction];

        for (int i = 0; i < amountFraction; i++) {
            fractions[i] = new Fraction();
            fractions[i].numerator = randomNumber(maxNumerator);
            fractions[i].denominator = randomNumber(maxDenominator);
        }

        return  fractions;
    }

    private static int randomNumber(int maxValue) {
        int randomNumber = 0;

        while (randomNumber == 0) {
            randomNumber = (int) (Math.random() * (maxValue + 1));
        }

        return randomNumber;
    }
}
