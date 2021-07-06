package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task07 {
    /**
     * Real numbers a(1), a(2), ... , a(2n) is given.
     * Found max value from (a(1) + a(2n), a(2) + a(2n-1), ... , a(n) + a(n+1))
     *
     * @param sequenceRealNumber input array with real numbers
     * @return number equals max value from new sequence
     */

    public static double maxValueFromSequence(double[] sequenceRealNumber) {
        int arrayLength;
        arrayLength = sequenceRealNumber.length;

        if (arrayLength % 2 != 0) {
            return 0.0;
        }

        double[] newSequencer = new double[arrayLength / 2];

        double firstTerm;
        double secondTerm;
        double maxValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < newSequencer.length; i++) {
            firstTerm = sequenceRealNumber[i];
            secondTerm = sequenceRealNumber[arrayLength - 1 - i];

            newSequencer[i] = firstTerm + secondTerm;
            maxValue = Math.max(maxValue, newSequencer[i]);
        }

        return maxValue;
    }
}
