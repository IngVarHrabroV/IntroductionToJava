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
     * @param sizeOfMatrix input order for matrix
     * @return matrix
     */

    private static int[][] createMatrixForTask05(int sizeOfMatrix) {
        ValidateMatrixSize validateMatrixSize = new ValidateMatrixSize();

        if (validateMatrixSize.toBeEvenAndValid(sizeOfMatrix)) {
            int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

            for (int i = 0; i < sizeOfMatrix; i++) {
                for (int j = 0; j < sizeOfMatrix; j++) {
                    if (j > sizeOfMatrix - 1 - i) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = i + 1;
                    }
                }
            }

            return matrix;
        }

        return null;
    }

    /**
     * See {@link #createMatrixForTask05(int)} docs for more details
     */
    public static void run(int sizeOfMatrix) {
        System.out.println("Result of task 05: ");
        int[][] resultOfTask05 = Task05.createMatrixForTask05(sizeOfMatrix);
        if (resultOfTask05 == null) {
            return;
        }
        System.out.println(StringHelper.matrixToString(resultOfTask05));
    }
}
