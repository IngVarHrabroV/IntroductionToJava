package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task08 {
    /**
     * Sequencer of integer numbers a(1), a(2), ... , a(n) is given.
     * Create new sequencer without min(a(1), a(2), ... , a(n)).
     *
     * @param integerSequencer input array with integer numbers
     * @return newIntegerSequencer without min value
     */

    public static int[] excludeMinValue(int[] integerSequencer) {
        int minValue = Integer.MAX_VALUE;
        int howManyMinValue = 0;

        for (int i : integerSequencer) {
            minValue = Math.min(i, minValue);

            if (i == minValue) {
                howManyMinValue++;
            }
        }

        if (howManyMinValue == integerSequencer.length) {
            return integerSequencer;
        }

        int lengthIntegerSequencerWithoutMinValue;
        lengthIntegerSequencerWithoutMinValue = integerSequencer.length - howManyMinValue;
        int[] integerSequencerWithoutMinValue = new int[lengthIntegerSequencerWithoutMinValue];

        int indexIntegerSequencer = 0;
        for (int i = 0; i < lengthIntegerSequencerWithoutMinValue; i++) {
            while (integerSequencer[indexIntegerSequencer] == minValue) {
                indexIntegerSequencer++;
            }

            integerSequencerWithoutMinValue[i] = integerSequencer[indexIntegerSequencer];
            indexIntegerSequencer++;
        }

        return integerSequencerWithoutMinValue;
    }
}
