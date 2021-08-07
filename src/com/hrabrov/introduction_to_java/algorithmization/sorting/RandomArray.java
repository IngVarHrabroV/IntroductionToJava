package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class RandomArray {
    public static int[] create(int sizeOfArray) {
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = randomIntNumber();
        }

        return array;
    }

    public static int[] create(int sizeOfArray, boolean isAscending) {
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            if (isAscending) {
                array[i] = randomIntNumber();
                while (i != 0 && array[i] < array[i - 1]) {
                  array[i] = randomIntNumber();
              }
            } else {
                array[i] = randomIntNumber();
            }
        }

        return array;
    }

    private static int randomIntNumber() {
        final int maxAbsValueVariable = 99;
        final double borderForChosenPositiveAndNegativeNumber = 0.5;
        double signNumber = Math.random();
        signNumber = signNumber < borderForChosenPositiveAndNegativeNumber ? 1 : -1;

        return (int) (Math.random() * (maxAbsValueVariable + 1) * signNumber);
    }
}
