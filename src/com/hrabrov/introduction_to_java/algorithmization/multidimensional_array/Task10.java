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
        int[] arrayWithMainDiagonalElements = new int[matrix.length];

        int tempIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            arrayWithMainDiagonalElements[tempIndex] = matrix[i][i];
            tempIndex++;
        }

        int returnedArraySize = 0;
        for (int i = 0; i < arrayWithMainDiagonalElements.length; i++) {
            returnedArraySize += arrayWithMainDiagonalElements[i] > 0 ? 1 : 0;
        }

        int[] returnedArray = new int[returnedArraySize];
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
