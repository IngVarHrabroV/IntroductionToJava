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
     * @param sizeOfMatrix input order for matrix
     * @return matrix
     */

    private static int[][] createMatrixForTask04(int sizeOfMatrix) {
        ValidateMatrixSize validateMatrixSize = new ValidateMatrixSize();

        if (validateMatrixSize.toBeEvenAndValid(sizeOfMatrix)) {
            int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

            for (int i = 0; i < sizeOfMatrix; i++) {
                for (int j = 0; j < sizeOfMatrix; j++) {
                    matrix[i][j] = isEvenIndex(i) ? j + 1 : sizeOfMatrix - j;
                }
            }

            return matrix;
        }

        return null;
    }

    private static boolean isEvenIndex(int value) {
        return value% 2 == 0;
    }

    /**
     * See {@link #createMatrixForTask04(int)} docs for more details
     */
    public static void run(int sizeOfMatrix) {
        System.out.println("Result of task 04: ");
        int[][] resultOfTask04 = createMatrixForTask04(sizeOfMatrix);

        if (resultOfTask04 == null) {
            return;
        }

        System.out.println(StringHelper.matrixToString(resultOfTask04));
    }
}
