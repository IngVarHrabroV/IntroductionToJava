package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class StringHelper {
    public static String matrixToString(int[][] matrix) {
        String stringForStorageOfMatrixValues = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                stringForStorageOfMatrixValues += matrix[i][j] >= 0 ? " " : "";
                stringForStorageOfMatrixValues += matrix[i][j];
                stringForStorageOfMatrixValues += matrix[i][j] < 100 ? "\t" : "";
            }
            stringForStorageOfMatrixValues += (i == matrix.length - 1) ? "" : "\n";
        }

        return stringForStorageOfMatrixValues;
    }

    public static String matrixToString(double[][] matrix) {
        String stringForStorageOfMatrixValues = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String temp = String.format("%.3f", matrix[i][j]);
                stringForStorageOfMatrixValues += temp;
                stringForStorageOfMatrixValues += matrix[i][j] > 0 ? " " : "";
                stringForStorageOfMatrixValues += (j == matrix[i].length - 1) ? "" : "\t";
            }
            stringForStorageOfMatrixValues += (i == matrix.length - 1) ? "" : "\n";
        }

        return stringForStorageOfMatrixValues;
    }

    public static String arrayToString(int[] array) {
        String stringForStorageOfArrayValues = "";

        for (int i = 0; i < array.length; i++) {
            stringForStorageOfArrayValues += array[i] + " ";
        }

        return stringForStorageOfArrayValues;
    }
}
