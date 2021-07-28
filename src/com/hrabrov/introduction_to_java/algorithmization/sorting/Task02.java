package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task02 {
    /**
     * Given two sequences: a1 <= a2 <= a3 <= ... <= an and b1 <= b2 <= b3 <= ... <= bm.
     * Create new non-decreasing sequence.
     *
     * @param firstSequence  input first sequence
     * @param secondSequence input second sequence
     * @return new non-decreasing sequence
     */

    public static int[] createNonDecreasingSequenceFromTwo(int[] firstSequence, int[] secondSequence) {
        int sizeOfFirstSequencer = firstSequence.length;
        int sizeOfSecondSequencer = secondSequence.length;
        int[] newSequencer;
        int sizeOfNewSequencer = sizeOfFirstSequencer + sizeOfSecondSequencer;
        newSequencer = new int[sizeOfNewSequencer];

        for (int i = 0; i < sizeOfFirstSequencer; i++) {
            newSequencer[i] = firstSequence[i];
        }

        for (int i = 0; i < sizeOfSecondSequencer; i++) {
            newSequencer[i + sizeOfFirstSequencer] = secondSequence[i];
        }

        int temp;
        for (int i = 0; i < sizeOfNewSequencer; i++) {
            for (int j = i + 1; j < sizeOfNewSequencer; j++) {
                if (newSequencer[i] > newSequencer[j]) {
                    temp = newSequencer[i];
                    newSequencer[i] = newSequencer[j];
                    newSequencer[j] = temp;
                }
            }
        }

        return newSequencer;
    }
}
