package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task15 {
    /**
     * Find the largest element of matrix and replace all odd elements with it.
     *
     * @param originalMatrix input multidimensional array like matrix
     * @return matrix with replaced elements
     */

    private static int[][] replacedElementsOfMatrix(int[][] originalMatrix) {
        int largestElement = originalMatrix[0][0];

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                largestElement = Math.max(largestElement, originalMatrix[i][j]);
            }
        }

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                if (isOdd(originalMatrix[i][j]) && originalMatrix[i][j] != 0) {
                    originalMatrix[i][j] = largestElement;
                }
            }
        }

        return originalMatrix;
    }

    private static boolean isOdd(int valueForCheck) {
        return valueForCheck % 2 != 0;
    }

    public static void run(int[][] originalMatrix) {
        System.out.println("Result of task 15:");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(originalMatrix));

        System.out.println("Matrix with replaced elements:");
        int[][] resultOfTask15 = Task15.replacedElementsOfMatrix(originalMatrix);
        System.out.println(StringHelper.matrixToString(resultOfTask15));
    }
}
