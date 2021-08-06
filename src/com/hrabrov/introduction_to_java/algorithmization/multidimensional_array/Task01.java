package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task01 {
    /**
     * Given a matrix. Display all odd columns with first item more greater than last.
     *
     * @param matrix input multidimensional array
     * @return matrix include odd columns with the first item greater than last
     */

    private static int[][] findOddColumnsWhereFirstItemGreatest(int[][] matrix) {
        int[] numbersFromFirstRowOfMatrix = matrix[0];
        int[] numbersFromLastRowOfMatrix = matrix[matrix.length - 1];

        int horizontalSizeOfMatrix = matrix[0].length;

        int quantityOfColumnsWhereFirstItemGreaterThenLast = 0;
        for (int j = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                quantityOfColumnsWhereFirstItemGreaterThenLast++;
            }
        }

        if (quantityOfColumnsWhereFirstItemGreaterThenLast == 0) {
            return null;
        }

        int[] indexesOfColumnsWhereFirstItemGreaterThenLast
                = new int[quantityOfColumnsWhereFirstItemGreaterThenLast];

        for (int j = 0, itemSelected = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                indexesOfColumnsWhereFirstItemGreaterThenLast[itemSelected] = j;
                itemSelected++;
            }
        }

        int[][] matrixWhereFirstItemGreaterThenLast;
        matrixWhereFirstItemGreaterThenLast
                = new int[matrix.length][quantityOfColumnsWhereFirstItemGreaterThenLast];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < quantityOfColumnsWhereFirstItemGreaterThenLast; j++) {
                matrixWhereFirstItemGreaterThenLast[i][j]
                        = matrix[i][indexesOfColumnsWhereFirstItemGreaterThenLast[j]];
            }
        }

        return matrixWhereFirstItemGreaterThenLast;
    }

    /**
     * See {@link #findOddColumnsWhereFirstItemGreatest(int[][])} docs for more details
     */
    public static void run(int[][] matrix) {
        int[][] resultOfTask01 = findOddColumnsWhereFirstItemGreatest(matrix);
        System.out.println("Result of task 01:");
        System.out.println("Original matrix:\n" + StringHelper.matrixToString(matrix));

        if (resultOfTask01 == null) {
            System.out.println("Matrix hasn't odd column, where first item more greater than last ");
            return;
        }
        System.out.println("Transformed matrix:\n" + StringHelper.matrixToString(resultOfTask01));
    }
}
