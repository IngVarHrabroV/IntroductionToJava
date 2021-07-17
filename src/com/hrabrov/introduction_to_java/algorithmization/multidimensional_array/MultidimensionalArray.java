package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void run() {
        /*int[][] matrixForTask01 = new int[][]{
                {25, 4, 3, 5, 12, 2, 2, 2, 2, 2, 2},
                {8, 7, 6, 6, 7},
                {23, 6, 5, 11, 2, 1, 1, 1}
        };
        int[][] resultOfTask01 = Task01.foundOddColumnsWithGreaterFirstItem(matrixForTask01);
        System.out.println("Result of task 01:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask01));
        System.out.println("Transformed matrix:\n" + matrixToString(resultOfTask01));

        int[][] matrixForTask02 = new int[][]{
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] resultOfTask02 = Task02.chooseDiagonalElement(matrixForTask02);
        System.out.println("Result of task 02:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask02));
        System.out.println("Diagonal elements:" + Arrays.toString(resultOfTask02));

        int[][] matrixForTask03 = new int[][]{
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15}
        };
        int[][] resultOfTask03 = Task03.displayLineAndColumn(matrixForTask03, 1, 4);
        System.out.println("Result of task 03:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask03));
        System.out.println("Selected row: " + Arrays.toString(resultOfTask03[0]));
        System.out.println("Selected column: " + Arrays.toString(resultOfTask03[1]));

        System.out.println("Result of task 04: ");
        int[][] resultOfTask04 = Task04.createMatrixForTask04(8);
        System.out.println(matrixToString(resultOfTask04));

        System.out.println("Result of task 05: ");
        int[][] resultOfTask05 = Task05.createMatrixForTask05(3);
        System.out.println(matrixToString(resultOfTask05));

        System.out.println("Result of task 06: ");
        int[][] resultOfTask06 = Task06.createMatrixForTask06(4);
        System.out.println(matrixToString(resultOfTask06));*/

        System.out.println("Result of task 07: ");
        Task07.MatrixAndYourPositiveElements resultOfTask07;
        resultOfTask07 = Task07.createMatrixForTask07(6);
        System.out.println(matrixToString(resultOfTask07.matrix));
        System.out.println("Quantity positive elements = " + resultOfTask07.quantityPositiveElements);
    }

    private static String matrixToString(int[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixToString += matrix[i][j];
                matrixToString += (j == matrix[i].length - 1) ? "" : "\t";
            }
            matrixToString += (i == matrix.length - 1) ? "" : "\n";
        }
        return matrixToString;
    }

    private static String matrixToString(double[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String temp = String.format("%.3f", matrix[i][j]);
                matrixToString += temp;
                matrixToString += matrix[i][j] > 0 ? " " : "";
                matrixToString += (j == matrix[i].length - 1) ? "" : "\t";
            }
            matrixToString += (i == matrix.length - 1) ? "" : "\n";
        }
        return matrixToString;
    }
}
