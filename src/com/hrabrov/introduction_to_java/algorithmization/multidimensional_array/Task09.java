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

        int horizontalMatrixSize = matrix[0].length;
        int[] sumElements = new int[horizontalMatrixSize];
        int indexForArrayWithSumElements = 0;
        int maxSum = -1;
        int numberColumnWithMaxSum = 0;

        for (int j = 0; j < horizontalMatrixSize; j++) {
            int tempForSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (checkValidateMatrixElement(matrix[i][j])) {
                    return returnedObject;
                }
                tempForSum += matrix[i][j];
            }

            sumElements[indexForArrayWithSumElements] = tempForSum;

            if (tempForSum > maxSum) {
                maxSum = tempForSum;
                numberColumnWithMaxSum = indexForArrayWithSumElements + 1;
            }

            indexForArrayWithSumElements++;
        }

        returnedObject.numberColumn = numberColumnWithMaxSum;
        returnedObject.sumElements = sumElements;

        return returnedObject;
    }

    public static boolean checkValidateMatrixElement(int a) {
        if (a < 0) {
            System.out.println("Matrix must contain non-negative numbers.\n" +
                    a + " can't be place in matrix");
            return true;
        }
        return false;
    }

    static class SumElementsAndNumberColumn {
        int[] sumElements;
        int numberColumn;
    }
}
