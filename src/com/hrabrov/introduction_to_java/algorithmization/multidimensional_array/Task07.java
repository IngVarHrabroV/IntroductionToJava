package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task07 {
    /**
     * Create square matrix of order N by the rule and count positive elements.
     * a[i, j] = sin[(i * i - j * j) / n]
     *
     * @param n input order for matrix
     * @return matrix and quantity positive elements
     */

    public static MatrixAndHerPositiveElements createMatrixForTask07(int n) {
        MatrixAndHerPositiveElements matrixAndHerPositiveElements = new MatrixAndHerPositiveElements();

        double[][] matrix = new double[n][n];
        int quantityPositiveElements = 0;

        double expressionValue;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                expressionValue = (Math.pow(i, 2) - Math.pow(j, 2)) / n;
                matrix[i][j] = Math.sin(expressionValue);

                if (matrix[i][j] > 0) {
                    quantityPositiveElements++;
                }
            }
        }

        matrixAndHerPositiveElements.matrix = matrix;
        matrixAndHerPositiveElements.quantityPositiveElements = quantityPositiveElements;

        return matrixAndHerPositiveElements;
    }

    static class MatrixAndHerPositiveElements {
        double[][] matrix;
        int quantityPositiveElements;
    }
}
