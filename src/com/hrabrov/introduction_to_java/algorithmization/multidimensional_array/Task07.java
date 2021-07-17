package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task07 {
    /**
     * Сформировать квадратную матрицу порядка N по правилу
     * и подсчитать количество положительных элементов в ней.
     * Create square matrix of order N by the rule and count positive elements.
     *
     * a[i, j] = sin[(i * i - j * j) / n]
     *
     * @param n input order for matrix
     * @return matrix and quantity positive elements
     */

    public static MatrixAndYourPositiveElements createMatrixForTask07(int n) {
        MatrixAndYourPositiveElements returnedObject = new MatrixAndYourPositiveElements();

        double[][] matrix = new double[n][n];
        int quantityPositiveElements = 0;

        double tempVariable;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempVariable = (Math.pow(i, 2) - Math.pow(j, 2)) / n;
                matrix[i][j] = Math.sin(tempVariable);

                if (matrix[i][j] > 0) {
                    quantityPositiveElements++;
                }
            }

        }

        returnedObject.matrix = matrix;
        returnedObject.quantityPositiveElements = quantityPositiveElements;

        return returnedObject;
    }

      static class MatrixAndYourPositiveElements {
        double[][] matrix;
        int quantityPositiveElements;
    }
}