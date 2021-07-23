package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task11 {
    /**
     * Матрицу 10x20 заполнить случайными числами от 0 до 15.
     * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
     * Fill the matrix 10 on 20 with random numbers from 0 to 15.
     * Display the matrix and row numbers in which the number 5 occurs three and more times.
     *
     * @return matrix and array with row number
     */

    public static MatrixAndRowNumber createMatrixForTask11() {
        MatrixAndRowNumber returnedObject = new MatrixAndRowNumber();

        int[][] matrix = new int[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }

        int[] checkRowOnQuantityFive = new int[10]; //
        int tempIndex = 0;
        for (int i = 0; i < 10; i++) {
            int quantityFiveInRow = 0;
            for (int j = 0; j < 20; j++) {
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
        for (int i = 0; i < 10; i++) {
            if (checkRowOnQuantityFive[i] > -1) {
                arraySize++;
            }
        }

        int tempIndexForArrayWithRowNumbers = 0;
        int[] arrayWithRowNumbersOccursFiveThreePlusTime = new int[arraySize];
        for (int i = 0; i < 10; i++) {
            if (checkRowOnQuantityFive[i] > -1) {
                arrayWithRowNumbersOccursFiveThreePlusTime[tempIndexForArrayWithRowNumbers] =
                        checkRowOnQuantityFive[i];
                tempIndexForArrayWithRowNumbers++;
            }
        }

        returnedObject.createdMatrix = matrix;
        returnedObject.rowNumber = arrayWithRowNumbersOccursFiveThreePlusTime;

        return returnedObject;
    }

    static class MatrixAndRowNumber {
        int[][] createdMatrix;
        int[] rowNumber;
    }
}
