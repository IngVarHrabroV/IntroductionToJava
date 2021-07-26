package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task09 {
    /**
     * Задана матрица неотрицательных чисел.
     * Посчитать сумму элементов в каждом столбце.
     * Определить, какой столбец содержит максимальную сумму.
     * Given matrix with non-negative number.
     * Count sum elements in each column.
     * Find column with max sum.
     *
     * @param matrix input matrix with non-negative number
     * @return array wit  sum elements in each column and number for column with max sum
     */

    public static SumElementsAndNumberColumn findSumAndColumn(int[][] matrix) {
        SumElementsAndNumberColumn returnedObject = new SumElementsAndNumberColumn();

        int horizontalSizeOfMatrix = matrix[0].length;
        int[] sumElements = new int[horizontalSizeOfMatrix];
        int maxSum = -1;
        int numberColumnWithMaxSum = 0;

        for (int j = 0; j < horizontalSizeOfMatrix; j++) {
            int tempStorageForSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (checkValidateMatrixElement(matrix[i][j])) {
                    return returnedObject;
                }

                tempStorageForSum += matrix[i][j];
            }

            sumElements[j] = tempStorageForSum;

            if (tempStorageForSum == maxSum) {
                System.out.println("Multiple columns have a maximum sum. Rewrite matrix");
                return returnedObject;
            }

            if (tempStorageForSum > maxSum) {
                maxSum = tempStorageForSum;
                numberColumnWithMaxSum = j + 1;
            }
        }

        returnedObject.numberColumn = numberColumnWithMaxSum;
        returnedObject.sumElements = sumElements;

        return returnedObject;
    }

    private static boolean checkValidateMatrixElement(int a) {
        if (a < 0) {
            System.out.println("Matrix must non contain non-negative numbers.\n" +
                    a + " can't be place in matrix");
            return true;
        }

        return false;
    }

    static class SumElementsAndNumberColumn {
        int[] sumElements = new int[0];
        int numberColumn;
    }
}
