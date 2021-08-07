package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task14 {
    /**
     * Generate a random m on n matrix, containing of zeros and ones.
     * The number of ones in each column is equals the column number.
     *
     * @param verticalSizeOfMatrix input vertical size matrix (quantity column)
     * @param horizontalSizeOfMatrix input horizontal size matrix (quantity row)
     * @return multidimensional array like matrix
     */

    private static int[][] generateMatrixForTask14(int verticalSizeOfMatrix, int horizontalSizeOfMatrix) {
        if (checkValidateArgument(verticalSizeOfMatrix, horizontalSizeOfMatrix)) {
            final int firstNumberForFilling = 1;
            final int secondNumberForFilling = 0;

            int[][] matrix = new int[verticalSizeOfMatrix][horizontalSizeOfMatrix];

            for (int j = 0; j < matrix[0].length; j++) {
                int countFirstNumberForFilling = 0;
                for (int i = 0; i < matrix.length; i++) {
                    if (countFirstNumberForFilling != j + 1) {
                        int howManyFirstNumbersNeed = j + 1 - countFirstNumberForFilling;

                        if (howManyFirstNumbersNeed == matrix.length - i) {
                            matrix[i][j] = firstNumberForFilling;
                            countFirstNumberForFilling++;
                        } else {
                            matrix[i][j] = (int) (Math.random() * (firstNumberForFilling + 1));
                            if (matrix[i][j] == firstNumberForFilling) {
                                countFirstNumberForFilling++;
                            }
                        }

                    } else {
                        matrix[i][j] = secondNumberForFilling;
                    }
                }
            }

            return matrix;
        }

        return null;
    }

    private static boolean checkValidateArgument(int m, int n) {
        if (m < 2 || n < 2) {
            System.out.println("Parameters verticalSizeOfMatrix and " +
                    "horizontalSizeOfMatrix are must be larger than 1");
            return false;
        }

        if (m < n) {
            System.out.println("Quantity row (verticalSizeOfMatrix)" +
                    " are must be larger or equals than quantity column (horizontalSizeOfMatrix)");
            return false;
        }

        return true;
    }

    public static void run(int verticalSizeOfMatrix, int horizontalSizeOfMatrix) {
        System.out.println("Result of task 14:");
        int[][] resultOfTask14 = generateMatrixForTask14(verticalSizeOfMatrix, horizontalSizeOfMatrix);

        if (resultOfTask14 == null) {
            return;
        }

        System.out.println(StringHelper.matrixToString(resultOfTask14));
    }
}
