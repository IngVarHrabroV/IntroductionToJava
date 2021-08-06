package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task10 {
    /**
     * Find positive elements of the main diagonal of a square matrix
     *
     * @param matrix input multidimensional array like matrix
     * @return array with positive elements
     */

    private static int[] findPositiveElementOfTheMainDiagonal(int[][] matrix) {
        final int HORIZONTAL_SIZE_OF_MATRIX = matrix.length;
        int[] elementsFromMainDiagonals = new int[HORIZONTAL_SIZE_OF_MATRIX * 2];

        for (int i = 0, tempIndex = 0; i < HORIZONTAL_SIZE_OF_MATRIX; i++) {
            elementsFromMainDiagonals[tempIndex] = matrix[i][i];
            tempIndex++;
            elementsFromMainDiagonals[tempIndex] = matrix[i][HORIZONTAL_SIZE_OF_MATRIX - i - 1];
            tempIndex++;
        }

        int sizeOfArrayWithPositiveElements = 0;
        for (int i = 0; i < elementsFromMainDiagonals.length; i++) {
            sizeOfArrayWithPositiveElements += elementsFromMainDiagonals[i] > 0 ? 1 : 0;
        }

        int[] positiveElementsFromMainDiagonals = new int[sizeOfArrayWithPositiveElements];
        int tempIndex = 0;
        for (int i = 0; i < elementsFromMainDiagonals.length; i++) {
            if (elementsFromMainDiagonals[i] > 0) {
                positiveElementsFromMainDiagonals[tempIndex] = elementsFromMainDiagonals[i];
                tempIndex++;
            }
        }

        return positiveElementsFromMainDiagonals;
    }

    public static void run(int[][] matrix) {
        final int MIN_NECESSARY_QUANTITY_POSITIVE_ELEMENTS = 1;

        System.out.println("Result of task 10:");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(matrix));

        int[] resultOfTask10 = Task10.findPositiveElementOfTheMainDiagonal(matrix);

        if (resultOfTask10.length < MIN_NECESSARY_QUANTITY_POSITIVE_ELEMENTS) {
            System.out.println("Matrix hasn't positive elements in main diagonals");
            return;
        }

        System.out.println("Positive elements of the main diagonal: "
                + StringHelper.arrayToString(resultOfTask10));
    }
}
