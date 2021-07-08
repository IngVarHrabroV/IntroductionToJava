package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task02 {
    /**
     * Given is sequence of real numbers a1, a2, ... , an and number z.
     * Replace the sequence's numbers, if it more than z to z, and count this replace.
     *
     * @param sequenceOfReal input array with real numbers
     * @param z              input
     * @return sequence with replace and number of replace
     */

    public static ArrayWithReplacement replacementNumber(double[] sequenceOfReal, double z) {
        ArrayWithReplacement arrayWithReplacement = new ArrayWithReplacement();
        int replacement = 0;

        for (int i = 0; i < sequenceOfReal.length; i++) {
            sequenceOfReal[i] = sequenceOfReal[i] < z ? sequenceOfReal[i] : z;
            replacement += sequenceOfReal[i] < z ? 0 : 1;
        }

        arrayWithReplacement.sequenceOfReal = sequenceOfReal;
        arrayWithReplacement.replacement = replacement;

        return arrayWithReplacement;
    }

    static class ArrayWithReplacement {
        double[] sequenceOfReal;
        int replacement;
    }
}