package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class RandomArray {
    public static int[] create(int sizeOfArray) {
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = randomIntNumber();
        }

        return array;
    }

    private static int randomIntNumber() {
        final int maxValueVariable = 99;
        final double borderPositiveAndNegativeNumber = 0.5;
        int signNumber = Math.random() > borderPositiveAndNegativeNumber ? 1 : -1;

        return (int) (Math.random() * (maxValueVariable + 1) * signNumber);
    }
}
