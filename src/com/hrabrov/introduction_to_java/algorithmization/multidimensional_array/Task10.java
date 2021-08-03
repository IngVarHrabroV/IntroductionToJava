package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task10 {
    /**
     * Find positive elements of the main diagonal of a square matrix
     *
     * @param matrix input multidimensional array like matrix
     * @return array with positive elements
     */

    private static int[] findPositiveElementOfTheMainDiagonal(int[][] matrix) {
        int horizontalSizeOfMatrix = matrix.length;
        int[] elementsFromMainDiagonals = new int[horizontalSizeOfMatrix * 2];

        for (int i = 0, tempIndex = 0; i < horizontalSizeOfMatrix; i++) {
            elementsFromMainDiagonals[tempIndex] = matrix[i][i];
            tempIndex++;
            elementsFromMainDiagonals[tempIndex] = matrix[i][horizontalSizeOfMatrix - i - 1];
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
        System.out.println("Result of task 10:");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(matrix));

        int[] resultOfTask10 = Task10.findPositiveElementOfTheMainDiagonal(matrix);
        System.out.println("Positive elements of the main diagonal: "
                + StringHelper.arrayToString(resultOfTask10));
    }
}
