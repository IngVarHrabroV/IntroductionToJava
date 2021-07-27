package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task13 {
    /**
     * Sort matrix column in ascending or descending order of elements value.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return sorted matrices in ascending or descending order
     */

    public static int[][] ascendingSortMatrix(int[][] originalMatrix) {

        for (int j = 0; j < originalMatrix[0].length; j++) {
            for (int i = 0; i < originalMatrix.length; i++) {
                for (int k = i + 1; k < originalMatrix.length; k++) {
                    if (originalMatrix[i][j] > originalMatrix[k][j]) {
                        int temp;
                        temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[k][j];
                        originalMatrix[k][j] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }

    public static int[][] descendingSortMatrix(int[][] originalMatrix) {
        for (int j = 0; j < originalMatrix[0].length; j++) {
            for (int i = 0; i < originalMatrix.length; i++) {
                for (int k = i + 1; k < originalMatrix.length; k++) {
                    if (originalMatrix[i][j] < originalMatrix[k][j]) {
                        int temp;
                        temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[k][j];
                        originalMatrix[k][j] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }
}
