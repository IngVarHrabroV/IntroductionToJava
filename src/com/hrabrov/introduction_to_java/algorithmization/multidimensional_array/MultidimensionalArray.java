package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class MultidimensionalArray {
    public static void run() {
        int[][] matrixForTask01 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultOfTask01 = Task01.foundOddColumnsWithGreaterFirstItem(matrixForTask01);
        System.out.println(matrixToString(resultOfTask01));
    }

    private static String matrixToString(int[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrixToString += matrix[i][j];
                matrixToString += (j == matrix[i].length - 1) ? "" : "\t";
            }
            matrixToString += "\n";
        }
        return matrixToString;
    }
}
