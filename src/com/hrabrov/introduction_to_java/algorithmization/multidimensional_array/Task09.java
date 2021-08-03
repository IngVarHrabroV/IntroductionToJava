package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task09 {
    /**
     * Given matrix with non-negative number.
     * Count sum elements in each column.
     * Find column with max sum.
     *
     * @param matrix input matrix with non-negative number
     * @return array wit  sum elements in each column and number for column with max sum
     */

    private static SumOfColumnElementsAndNumberColumnWithTheMostGreaterSum findSumAndColumn(int[][] matrix) {
        SumOfColumnElementsAndNumberColumnWithTheMostGreaterSum sumsAndNumberColumn
                = new SumOfColumnElementsAndNumberColumnWithTheMostGreaterSum();

        int horizontalSizeOfMatrix = matrix[0].length;
        int[] sumElements = new int[horizontalSizeOfMatrix];
        int maxSum = -1;
        int numberColumnWithMaxSum = 0;

        for (int j = 0; j < horizontalSizeOfMatrix; j++) {
            int tempStorageForSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (checkValidateMatrixElement(matrix[i][j])) {
                    return null;
                }

                tempStorageForSum += matrix[i][j];
            }

            sumElements[j] = tempStorageForSum;

            if (tempStorageForSum == maxSum) {
                System.out.println("Multiple columns have a maximum sum. Rewrite matrix");
                return sumsAndNumberColumn;
            }

            if (tempStorageForSum > maxSum) {
                maxSum = tempStorageForSum;
                numberColumnWithMaxSum = j + 1;
            }
        }

        sumsAndNumberColumn.numberColumn = numberColumnWithMaxSum;
        sumsAndNumberColumn.sumElements = sumElements;

        return sumsAndNumberColumn;
    }

    private static boolean checkValidateMatrixElement(int a) {
        if (a < 0) {
            System.out.println("Matrix must non contain non-negative numbers.\n" +
                    a + " can't be place in matrix");
            return true;
        }

        return false;
    }

    static class SumOfColumnElementsAndNumberColumnWithTheMostGreaterSum {
        int[] sumElements;
        int numberColumn;
    }

    /**
     * See {@link #findSumAndColumn(int[][])} docs for more details
     */
    public static void run(int[][] matrix) {
        System.out.println("Result of task 09: ");
        System.out.println("Original matrix:");
        System.out.println(StringHelper.matrixToString(matrix));

        SumOfColumnElementsAndNumberColumnWithTheMostGreaterSum resultOfTask09 = Task09.findSumAndColumn(matrix);

        if (resultOfTask09  == null) {
            return;
        }

        System.out.println("sum  of elements in  columns: "
                + StringHelper.arrayToString(resultOfTask09.sumElements));
        System.out.println("Column number " + resultOfTask09.numberColumn + " has max sum elements");
    }
}
