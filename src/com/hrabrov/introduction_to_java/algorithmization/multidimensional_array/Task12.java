package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task12 {
    /**
     * Sort matrix row in ascending or descending order of elements value.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return sorted matrices in ascending or descending order
     */

    private static int[][] ascendingSortMatrix(int[][] originalMatrix) {
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

    private static int[][] descendingSortMatrix(int[][] originalMatrix) {
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

    public static void run(int[][] originalMatrix) {
        System.out.println("Result of task 12:");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(originalMatrix));

        int[][] resultOfTask12WithAscendingSort = Task12.ascendingSortMatrix(originalMatrix);
        System.out.println("Rows with ascending sort:");
        System.out.println(StringHelper.matrixToString(resultOfTask12WithAscendingSort));

        int[][] resultOfTask12WithDescendingSort = Task12.descendingSortMatrix(originalMatrix);
        System.out.println("Rows with descending sort:");
        System.out.println(StringHelper.matrixToString(resultOfTask12WithDescendingSort));
    }
}
