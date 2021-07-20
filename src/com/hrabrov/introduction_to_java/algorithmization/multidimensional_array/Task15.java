package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task15 {
    /**
     * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
     * Find the largest element of matrix and replace all odd elements with it.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return matrix with replaced elements
     */

    public static int[][] replacedElementsOfMatrix(int[][] originalMatrix) {
        int largestElement;
        largestElement = originalMatrix[0][0];

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                largestElement = Math.max(largestElement, originalMatrix[i][j]);
            }
        }

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                if (originalMatrix[i][j] % 2 != 0 && originalMatrix[i][j] != 0) {
                    originalMatrix[i][j] = largestElement;
                }
            }
        }

        return originalMatrix;
    }
}
