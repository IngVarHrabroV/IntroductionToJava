package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task04 {
    /**
     * Create a square matrix of order n according to a given patter (n is even)
     * {
     * {1, 2,    3,   ..., n}
     * {n, n-1,  n-2, ..., 1}
     * {1, 2,    3,   ..., n}
     * {n, n-1,  n-2, ..., 1}
     * |   |     |     \  |
     * {n, n-1,  n-2, ..., 1}
     * }
     *
     * @param n input order for matrix
     * @return matrix
     */

    public static int[][] createMatrixForTask04(int n) {
        ValidateMatrixSize validateMatrixSize = new ValidateMatrixSize();

        if (validateMatrixSize.toBeEvenAndValid(n)) {
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = i % 2 == 0 ? j + 1 : n - j;
                }
            }

            return matrix;
        }

        return null;
    }
}
