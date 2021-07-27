package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task01 {
    /**
     * Given a matrix. Display all odd columns with the first item greater than last.
     *
     * @param matrix input multidimensional array
     * @return matrix include odd columns with the first item greater than last
     */

    public static int[][] foundOddColumnsWhereFirstItemGreatest(int[][] matrix) {
        int[] numbersFromFirstRowOfMatrix;
        numbersFromFirstRowOfMatrix = matrix[0];
        int[] numbersFromLastRowOfMatrix;
        numbersFromLastRowOfMatrix = matrix[matrix.length - 1];

        int maxLengthOfRow;
        maxLengthOfRow = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            maxLengthOfRow = Math.min(maxLengthOfRow, matrix[i].length);
        }

        int quantityOfColumnsWhereFirstItemGreatest = 0;
        for (int j = 0; j < maxLengthOfRow; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                quantityOfColumnsWhereFirstItemGreatest++;
            }
        }

        int[] arrayWithIndexesOfColumnsWhereFirstItemGreatest;
        arrayWithIndexesOfColumnsWhereFirstItemGreatest = new int[quantityOfColumnsWhereFirstItemGreatest];

        for (int j = 0, itemSelected = 0; j < maxLengthOfRow; j++) {
            if (numbersFromFirstRowOfMatrix[j] > numbersFromLastRowOfMatrix[j]
                    && j % 2 == 0) {
                arrayWithIndexesOfColumnsWhereFirstItemGreatest[itemSelected] = j;
                itemSelected++;
            }
        }

        int[][] matrixWhereFirstItemGreatest;
        matrixWhereFirstItemGreatest = new int[matrix.length][quantityOfColumnsWhereFirstItemGreatest];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < quantityOfColumnsWhereFirstItemGreatest; j++) {
                matrixWhereFirstItemGreatest[i][j] = matrix[i][arrayWithIndexesOfColumnsWhereFirstItemGreatest[j]];
            }
        }

        return matrixWhereFirstItemGreatest;
    }
}
