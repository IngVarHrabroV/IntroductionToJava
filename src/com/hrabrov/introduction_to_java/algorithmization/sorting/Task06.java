package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Task06 {
    /**
     * Given a sequence. Arrange items in ascending order using Shell's sort.
     *
     * @param sequence input
     * @return sorted sequence
     */

    public static int[] shellSort(int[] sequence) {
        int sizeOfSequence = sequence.length;
        int step = sizeOfSequence / 2;

        while (step > 0) {
            for (int i = step; i < sizeOfSequence; i++) {
                for (int j = i; j >= step; j -= step) {
                    if (sequence[j] < sequence[j - step]) {
                        int temp = sequence[j];
                        sequence[j] = sequence[j - step];
                        sequence[j - step] = temp;
                    }
                }
            }
            step /= 2;
        }

        return sequence;
    }

    public static int[] gnomeSort(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                for (int j = i; j >= 0 && sequence[j] > sequence[j + 1]; j--) {
                    int temp = sequence[j];
                    sequence[j] = sequence[j + 1];
                    sequence[j + 1] = temp;
                }
            }
        }

        return sequence;
    }
}
