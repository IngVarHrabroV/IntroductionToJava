package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task04 {
    /**
     * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
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
        if (checkValidationArgument(n)) {

            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        matrix[i][j] = j + 1;
                    } else {
                        matrix[i][j] = n - j;
                    }
                }
            }

            return matrix;
        }
        return new int[0][0];
    }

    private static boolean checkValidationArgument(int n) {
        if (n < 1) {
            System.out.println("n can't be small, then 1");
            return false;
        }

        if (n % 2 != 0) {
            System.out.println("n can't be odd");
            return false;
        }

        return true;
    }
}
