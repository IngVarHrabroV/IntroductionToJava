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

        int quantityOfColumnsWhereFirstItemMoreGreaterThenLast = 0;
        for (int j = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                quantityOfColumnsWhereFirstItemMoreGreaterThenLast++;
            }
        }

        if (quantityOfColumnsWhereFirstItemMoreGreaterThenLast == 0) {
            return null;
        }

        int[] indexesOfColumnsWhereFirstItemMoreGreaterThenLast
                = new int[quantityOfColumnsWhereFirstItemMoreGreaterThenLast];

        for (int j = 0, itemSelected = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                indexesOfColumnsWhereFirstItemMoreGreaterThenLast[itemSelected] = j;
                itemSelected++;
            }
        }

        int[][] matrixWhereFirstItemMoreGreaterThenLast;
        matrixWhereFirstItemMoreGreaterThenLast
                = new int[matrix.length][quantityOfColumnsWhereFirstItemMoreGreaterThenLast];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < quantityOfColumnsWhereFirstItemMoreGreaterThenLast; j++) {
                matrixWhereFirstItemMoreGreaterThenLast[i][j]
                        = matrix[i][indexesOfColumnsWhereFirstItemMoreGreaterThenLast[j]];
            }
        }

        return matrixWhereFirstItemMoreGreaterThenLast;
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
