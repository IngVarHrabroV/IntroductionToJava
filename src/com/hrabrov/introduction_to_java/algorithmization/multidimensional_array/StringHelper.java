package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class StringHelper {
    public String matrixToString(int[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixToString += matrix[i][j] >= 0 ? " " : "";
                matrixToString += matrix[i][j];
                matrixToString += matrix[i][j] < 100 ? "\t" : "";
            }
            matrixToString += (i == matrix.length - 1) ? "" : "\n";
        }

        return matrixToString;
    }

    public String matrixToString(double[][] matrix) {
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

    public String arrayToString(int[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }
}
