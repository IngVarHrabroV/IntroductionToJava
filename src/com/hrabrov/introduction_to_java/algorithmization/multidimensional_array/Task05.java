package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task05 {
    /**
     * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
     * Create a square matrix of order n according to a given patter (n is even)
     * {
     * {1,   1,   1, ..., 1, 1, 1}
     * {2,   2,   2, ..., 2, 2, 0}
     * {3,   3,   3, ..., 3, 0, 0}
     *  |     |   |   \   |  |  |
     * {n-1, n-1, 0, ..., 0, 0, 0}
     * {n,   0,   0, ..., 0, 0, 0}
     * }
     *
     * @param n input order for matrix
     * @return matrix
     */

    public static int[][] createMatrixForTask05(int n) {
        if (checkValidationArgument(n)) {
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

    private static boolean checkValidationArgument(int n) {
        if (n % 2 != 0) {
            System.out.println("n can't be odd");
            return false;
        }

        if (n < 1) {
            System.out.println("n can't be small, then 1");
            return false;
        }

        return true;
    }
}
