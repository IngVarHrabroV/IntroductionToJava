package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task05 {
    /**
     * Create a square matrix of order n according to a given patter (n is even)
     * {
     * {1,   1,   1, ..., 1, 1, 1}
     * {2,   2,   2, ..., 2, 2, 0}
     * {3,   3,   3, ..., 3, 0, 0}
     * {|     |   |   \   |  |  |}
     * {n-1, n-1, 0, ..., 0, 0, 0}
     * {n,   0,   0, ..., 0, 0, 0}
     * }
     *
     * @param n input order for matrix
     * @return matrix
     */

    public static int[][] createMatrixForTask05(int n) {
        CheckValidationArgumentAtEvenAndSize checkValidateArgument =
                new CheckValidationArgumentAtEvenAndSize();

        if (checkValidateArgument.check(n)) {
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > n - 1 - i) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = i + 1;
                    }
                }
            }

            return matrix;
        }

        return new int[0][0];
    }
}
