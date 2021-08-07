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

    private static int[] createNonDecreasingSequenceFromTwo(int[] firstSequence, int[] secondSequence) {
        if(!Helper.isSorted(firstSequence) || !Helper.isSorted(secondSequence)) {
            return null;
        }

        final int sizeOfFirstSequence = firstSequence.length;
        final int sizeOfSecondSequence = secondSequence.length;
        final int sizeOfNewSequence = sizeOfFirstSequence + sizeOfSecondSequence;
        int[] newSequence = new int[sizeOfNewSequence];

        for (int i = 0; i < sizeOfFirstSequence; i++) {
            newSequence[i] = firstSequence[i];
        }

        for (int i = 0; i < sizeOfSecondSequence; i++) {
            newSequence[i + sizeOfFirstSequence] = secondSequence[i];
        }

        for (int i = 0; i < sizeOfNewSequence; i++) {
            for (int j = i + 1; j < sizeOfNewSequence; j++) {
                if (newSequence[i] > newSequence[j]) {
                    int temp = newSequence[i];
                    newSequence[i] = newSequence[j];
                    newSequence[j] = temp;
                }
            }
        }

        return newSequence;
    }

    /**
     * See {@link #createNonDecreasingSequenceFromTwo(int[], int[])} docs for more details
     */
    public static void run(int[] firstSequence, int[] secondSequence){
        System.out.println("Result of task 02: ");
        System.out.println("First sequence: " + Helper.arrayToString(firstSequence));
        System.out.println("Second sequence: " + Helper.arrayToString(secondSequence));

        int[] resultOfTask02 = createNonDecreasingSequenceFromTwo(firstSequence, secondSequence);

        if (resultOfTask02 == null) {
            System.out.println("Sequences aren't ascending");
            return;
        }

        System.out.println("United sequence: " + Helper.arrayToString(resultOfTask02));
    }
}
