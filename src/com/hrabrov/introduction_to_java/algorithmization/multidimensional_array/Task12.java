package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task12 {
    /**
     * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     * Sort matrix row in ascending or descending order of elements value.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return sorted matrices in ascending or descending order
     */

    public static int[][] ascendingSortMatrix(int[][] originalMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                for (int k = j + 1; k < originalMatrix[i].length; k++) {
                    int temp;
                    if (originalMatrix[i][j] > originalMatrix[i][k]) {
                        temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[i][k];
                        originalMatrix[i][k] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }

    public static int[][] descendingSortMatrix(int[][] originalMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                for (int k = j + 1; k < originalMatrix[i].length; k++) {
                    int temp;
                    if (originalMatrix[i][j] < originalMatrix[i][k]) {
                        temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[i][k];
                        originalMatrix[i][k] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }
}
