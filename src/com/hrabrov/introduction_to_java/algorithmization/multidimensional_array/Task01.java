package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task01 {
    /**
     * Given a matrix. Display all odd columns with first item greater than last.
     *
     * @param matrix input multidimensional array
     * @return matrix include odd columns with the first item greater than last
     */

    private static int[][] findOddColumnsWhereFirstItemGreatest(int[][] matrix) {
        final int MIN_NECESSARY_QUANTITY_COLUMNS = 1;

        int[] numbersFromFirstRowOfMatrix = matrix[0];
        int[] numbersFromLastRowOfMatrix = matrix[matrix.length - 1];

        int horizontalSizeOfMatrix = matrix[0].length;

        int quantityOfColumnsWhereFirstItemGreaterThenLast = 0;
        for (int j = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && isOddColumn(j)) {
                quantityOfColumnsWhereFirstItemGreaterThenLast++;
            }
        }

        if (quantityOfColumnsWhereFirstItemGreaterThenLast < MIN_NECESSARY_QUANTITY_COLUMNS) {
            return null;
        }

        int[] indexesOfColumnsWhereFirstItemGreaterThenLast
                = new int[quantityOfColumnsWhereFirstItemGreaterThenLast];

        for (int j = 0, itemSelected = 0; j < horizontalSizeOfMatrix; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && isOddColumn(j)) {
                indexesOfColumnsWhereFirstItemGreaterThenLast[itemSelected] = j;
                itemSelected++;
            }
        }

        int[][] matrixWhereFirstItemGreaterThenLast
                = new int[matrix.length][quantityOfColumnsWhereFirstItemGreaterThenLast];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < quantityOfColumnsWhereFirstItemGreaterThenLast; j++) {
                matrixWhereFirstItemGreaterThenLast[i][j]
                        = matrix[i][indexesOfColumnsWhereFirstItemGreaterThenLast[j]];
            }
        }

        return matrixWhereFirstItemGreaterThenLast;
    }

    private static boolean isOddColumn(int value) {
        return value % 2 == 0;
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
