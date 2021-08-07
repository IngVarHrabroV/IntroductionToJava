package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task11 {
    final static int CONCEIVED_NUMBER = 5;

    /**
     * Fill the matrix 10 on 20 with random numbers from 0 to 15.
     * Display the matrix and row numbers in which the number 5 occurs three and more times.
     *
     * @return matrix and array with row number
     */

    private static MatrixAndRowsNumbers createMatrixForTask11() {
        MatrixAndRowsNumbers matrixAndRowsNumbers = new MatrixAndRowsNumbers();

        final int unsuitableRow = -1;
        final int verticalSizeOfMatrix = 20;
        final int horizontalSizeOfMatrix = 10;
        final int maxValueForFill = 15;

        int[][] matrix = new int[verticalSizeOfMatrix][horizontalSizeOfMatrix];

        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            for (int j = 0; j < horizontalSizeOfMatrix; j++) {
                matrix[i][j] = (int) (Math.random() * (maxValueForFill + 1));
            }
        }

        int[] checkRowOnQuantityConceivedNumber = new int[verticalSizeOfMatrix];
        int tempIndex = 0;
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            int quantityConceivedNumberInRow = 0;
            for (int j = 0; j < horizontalSizeOfMatrix; j++) {
                if (matrix[i][j] == CONCEIVED_NUMBER) {
                    quantityConceivedNumberInRow++;
                }
            }

            if (quantityConceivedNumberInRow >= 3) {
                checkRowOnQuantityConceivedNumber[tempIndex] = i + 1;
            } else {
                checkRowOnQuantityConceivedNumber[tempIndex] = unsuitableRow;
            }

            tempIndex++;
        }

        int sizeOfArray = 0;
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            if (checkRowOnQuantityConceivedNumber[i] > unsuitableRow) {
                sizeOfArray++;
            }
        }

        int tempIndexForArrayWithRowNumbers = 0;
        int[] rowNumbersOccursConceivedNumberThreePlusTime = new int[sizeOfArray];
        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            if (checkRowOnQuantityConceivedNumber[i] > unsuitableRow) {
                rowNumbersOccursConceivedNumberThreePlusTime[tempIndexForArrayWithRowNumbers]
                        = checkRowOnQuantityConceivedNumber[i];
                tempIndexForArrayWithRowNumbers++;
            }
        }

        matrixAndRowsNumbers.createdMatrix = matrix;
        matrixAndRowsNumbers.rowsNumbersWithFive = rowNumbersOccursConceivedNumberThreePlusTime;

        return matrixAndRowsNumbers;
    }

    static class MatrixAndRowsNumbers {
        int[][] createdMatrix;
        int[] rowsNumbersWithFive;
    }

    public static void run() {
        System.out.println("Result of task 11:");
        MatrixAndRowsNumbers resultOfTask11 = createMatrixForTask11();
        System.out.println(StringHelper.matrixToString(resultOfTask11.createdMatrix));

        if (resultOfTask11.rowsNumbersWithFive.length == 0) {
            System.out.println("**!!No row which the number " + CONCEIVED_NUMBER + " occurs three and more times!!**");
        } else {
            System.out.println("Numbers row in which the number " + CONCEIVED_NUMBER + " occurs three and more times: "
                    + StringHelper.arrayToString(resultOfTask11.rowsNumbersWithFive));
        }
    }
}
