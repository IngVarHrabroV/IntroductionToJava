package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class MultidimensionalArray {
    public static void run() {
        int[][] matrixForTask01 = new int[][]{
                {25, 4, 3, 5, 12, 2, 2, 2, 2, 2, 2},
                {8, 7, 6, 6, 7},
                {23, 6, 5, 11, 2, 1, 1, 1}
        };
        int[][] resultOfTask01 = Task01.foundOddColumnsWithGreaterFirstItem(matrixForTask01);
        System.out.println("Result of task 01:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask01));
        System.out.println("Transformed matrix:\n" + matrixToString(resultOfTask01));
    }

    public static String matrixToString(int[][] matrix) {
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
}
