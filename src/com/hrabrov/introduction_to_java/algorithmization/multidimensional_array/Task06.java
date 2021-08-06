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
     * @param sizeOfMatrix input order for matrix
     * @return matrix
     */

    private static int[][] createMatrixForTask06(int sizeOfMatrix) {
        final int symbolForUnselectedElement = 0;
        final int symbolForSelectedElement = 1;

        ValidateMatrixSize validateMatrixSize = new ValidateMatrixSize();

        if (validateMatrixSize.toBeEvenAndValid(sizeOfMatrix)) {
            int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

            final int indexMiddleForMatrix = sizeOfMatrix / 2 - 1;

            for (int i = 0; i < sizeOfMatrix; i++) {
                for (int j = 0; j < sizeOfMatrix; j++) {
                    matrix[i][j] = symbolForUnselectedElement;

                    if (i <= indexMiddleForMatrix && j >= i && j < sizeOfMatrix - i) {
                        matrix[i][j] = symbolForSelectedElement;
                    } else if (j >= sizeOfMatrix - i - 1 && j <= i) {
                        matrix[i][j] = symbolForSelectedElement;
                    }
                }
            }

            return matrix;
        }

        return null;
    }

    /**
     * See {@link #createMatrixForTask06(int)} docs for more details
     */
    public static void run(int sizeOfMatrix) {
        System.out.println("Result of task 06: ");
        int[][] resultOfTask06 = Task06.createMatrixForTask06(sizeOfMatrix);

        if (resultOfTask06 == null) {
            return;
        }

        System.out.println(StringHelper.matrixToString(resultOfTask06));
    }
}
