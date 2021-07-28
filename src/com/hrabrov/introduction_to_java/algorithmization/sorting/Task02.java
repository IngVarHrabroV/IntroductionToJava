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
        int sizeOfFirstSequence = firstSequence.length;
        int sizeOfSecondSequence = secondSequence.length;
        int[] newSequence;
        int sizeOfNewSequence = sizeOfFirstSequence + sizeOfSecondSequence;
        newSequence = new int[sizeOfNewSequence];

        for (int i = 0; i < sizeOfFirstSequence; i++) {
            newSequence[i] = firstSequence[i];
        }

        for (int i = 0; i < sizeOfSecondSequence; i++) {
            newSequence[i + sizeOfFirstSequence] = secondSequence[i];
        }

        int temp;
        for (int i = 0; i < sizeOfNewSequence; i++) {
            for (int j = i + 1; j < sizeOfNewSequence; j++) {
                if (newSequence[i] > newSequence[j]) {
                    temp = newSequence[i];
                    newSequence[i] = newSequence[j];
                    newSequence[j] = temp;
                }
            }
        }

        return newSequence;
    }
}
