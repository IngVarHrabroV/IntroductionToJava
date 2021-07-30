package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task06 {
    /**
     * Create a square matrix of order n according to a given patter (n is even)
     * {
     * {1, 1, 1, ..., 1, 1, 1}
     * {0, 1, 1, ..., 1, 1, 0}
     * {0, 0, 1, ..., 1, 0, 0}
     * {|  |  |   \   |  |  |}
     * {0, 1, 1, ..., 1, 1, 0}
     * {1, 1, 1, ..., 1, 1, 1}
     * }
     *
     * @param n input order for matrix
     * @return matrix
     */

    public static int[][] createMatrixForTask06(int n) {
        ValidateMatrixSize validateMatrixSize = new ValidateMatrixSize();

        if (validateMatrixSize.toBeEvenAndValid(n)) {
            int[][] matrix = new int[n][n];

            int indexMiddleOfMatrix;
            indexMiddleOfMatrix = n / 2 - 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;

                    if (i <= indexMiddleOfMatrix && j >= i && j < n - i) {
                        matrix[i][j] = 1;
                    } else if (j >= n - i - 1 && j <= i) {
                        matrix[i][j] = 1;
                    }
                }
            }

            return matrix;
        }

        return null;
    }
}
