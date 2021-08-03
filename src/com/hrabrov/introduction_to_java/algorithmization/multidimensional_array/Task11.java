package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task11 {
    /**
     * Fill the matrix 10 on 20 with random numbers from 0 to 15.
     * Display the matrix and row numbers in which the number 5 occurs three and more times.
     *
     * @return matrix and array with row number
     */

    private static MatrixAndRowsNumbers createMatrixForTask11() {
        MatrixAndRowsNumbers matrixAndRowsNumbers = new MatrixAndRowsNumbers();

        int verticalSizeOfMatrix = 20;
        int horizontalSizeOfMatrix = 10;

        int[][] matrix = new int[verticalSizeOfMatrix][horizontalSizeOfMatrix];

        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            for (int j = 0; j < horizontalSizeOfMatrix; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }

        int[] checkRowOnQuantityFive = new int[verticalSizeOfMatrix];
        int tempIndex = 0;
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            int quantityFiveInRow = 0;
            for (int j = 0; j < horizontalSizeOfMatrix; j++) {
                if (matrix[i][j] == 5) {
                    quantityFiveInRow++;
                }
            }

            if (quantityFiveInRow >= 3) {
                checkRowOnQuantityFive[tempIndex] = i + 1;
            } else {
                checkRowOnQuantityFive[tempIndex] = -1;
            }

            tempIndex++;
        }

        int arraySize = 0;
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            if (checkRowOnQuantityFive[i] > -1) {
                arraySize++;
            }
        }

        int tempIndexForArrayWithRowNumbers = 0;
        int[] arrayWithRowNumbersOccursFiveThreePlusTime = new int[arraySize];
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            if (checkRowOnQuantityFive[i] > -1) {
                arrayWithRowNumbersOccursFiveThreePlusTime[tempIndexForArrayWithRowNumbers] =
                        checkRowOnQuantityFive[i];
                tempIndexForArrayWithRowNumbers++;
            }
        }

        matrixAndRowsNumbers.createdMatrix = matrix;
        matrixAndRowsNumbers.rowsNumbersWithFive = arrayWithRowNumbersOccursFiveThreePlusTime;

        return matrixAndRowsNumbers;
    }

    static class MatrixAndRowsNumbers {
        int[][] createdMatrix;
        int[] rowsNumbersWithFive;
    }

    public static void run() {
        System.out.println("Result of task 11:");
        MatrixAndRowsNumbers resultOfTask11 = Task11.createMatrixForTask11();
        System.out.println(StringHelper.matrixToString(resultOfTask11.createdMatrix));
        if (resultOfTask11.rowsNumbersWithFive.length == 0) {
            System.out.println("**!!No row which the number 5 occurs three and more times!!**");
        } else {
            System.out.println("Numbers row in which the number 5 occurs three and more times: "
                    + StringHelper.arrayToString(resultOfTask11.rowsNumbersWithFive));
        }
    }
}
