package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task10 {
    /**
     * Найти положительные элементы главной диагонали квадратной матрицы.
     * Given positive elements of the main diagonal of a square matrix
     *
     * @param matrix input multidimensional array like matrix
     * @return array with positive elements
     */

    public static int[] findPositiveElementOfTheMainDiagonal(int[][] matrix) {
        int horizontalSizeOfMatrix = matrix.length;
        int[] arrayWithMainDiagonalElements = new int[horizontalSizeOfMatrix * 2];

        for (int i = 0, tempIndex = 0; i < horizontalSizeOfMatrix; i++) {
            arrayWithMainDiagonalElements[tempIndex] = matrix[i][i];
            tempIndex++;
            arrayWithMainDiagonalElements[tempIndex] = matrix[i][horizontalSizeOfMatrix - i - 1];
            tempIndex++;
        }

        int sizeOfReturnedArray = 0;
        for (int i = 0; i < arrayWithMainDiagonalElements.length; i++) {
            sizeOfReturnedArray += arrayWithMainDiagonalElements[i] > 0 ? 1 : 0;
        }

        int[] returnedArray = new int[sizeOfReturnedArray];
        int tempIndexForReturnedArray = 0;
        for (int i = 0; i < arrayWithMainDiagonalElements.length; i++) {
            if (arrayWithMainDiagonalElements[i] > 0) {
                returnedArray[tempIndexForReturnedArray] = arrayWithMainDiagonalElements[i];
                tempIndexForReturnedArray++;
            }
        }

        return returnedArray;
    }
}
