package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task13 {
    /**
     * Sort matrix column in ascending or descending order of elements value.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return sorted matrices in ascending or descending order
     */

    private static int[][] ascendingSortMatrix(int[][] originalMatrix) {
        for (int j = 0; j < originalMatrix[0].length; j++) {
            for (int i = 0; i < originalMatrix.length; i++) {
                for (int k = i + 1; k < originalMatrix.length; k++) {
                    if (originalMatrix[i][j] > originalMatrix[k][j]) {
                        int temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[k][j];
                        originalMatrix[k][j] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }

    private static int[][] descendingSortMatrix(int[][] originalMatrix) {
        for (int j = 0; j < originalMatrix[0].length; j++) {
            for (int i = 0; i < originalMatrix.length; i++) {
                for (int k = i + 1; k < originalMatrix.length; k++) {
                    if (originalMatrix[i][j] < originalMatrix[k][j]) {
                        int temp = originalMatrix[i][j];
                        originalMatrix[i][j] = originalMatrix[k][j];
                        originalMatrix[k][j] = temp;
                    }
                }
            }
        }

        return originalMatrix;
    }

    public static void run(int[][] originalMatrix) {
        System.out.println("Result of task 13:");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(originalMatrix));

        int[][] resultOfTask13WithAscendingSort;
        resultOfTask13WithAscendingSort = Task13.ascendingSortMatrix(originalMatrix);
        System.out.println("Columns with ascending sort:");
        System.out.println(StringHelper.matrixToString(resultOfTask13WithAscendingSort));

        int[][] resultOfTask13WithDescendingSort;
        resultOfTask13WithDescendingSort = Task13.descendingSortMatrix(originalMatrix);
        System.out.println("Columns with descending sort:");
        System.out.println(StringHelper.matrixToString(resultOfTask13WithDescendingSort));
    }
}
