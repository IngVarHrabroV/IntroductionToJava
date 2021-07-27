package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task14 {
    /**
     * Generate a random m on n matrix, containing of zeros and ones.
     * The number of ones in each columns is equals the column number.
     *
     * @param m input vertical size matrix (quantity column)
     * @param n input horizontal size matrix (quantity row)
     * @return multidimensional array like matrix
     */

    public static int[][] generateMatrixForTask14(int m, int n) {
        if (checkValidateArgument(m, n)) {
            int[][] matrix = new int[m][n];

            for (int j = 0; j < matrix[0].length; j++) {
                int countOne = 0;
                for (int i = 0; i < matrix.length; i++) {
                    if (countOne != j + 1) {
                        int howManyOneNeed;
                        howManyOneNeed = j + 1 - countOne;

                        if (howManyOneNeed == matrix.length - i) {
                            matrix[i][j] = 1;
                            countOne++;
                        } else {
                            matrix[i][j] = (int) (Math.random() * 2);
                            if (matrix[i][j] == 1) {
                                countOne++;
                            }
                        }

                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }

            return matrix;
        }

        return new int[0][0];
    }

    private static boolean checkValidateArgument(int m, int n) {
        if (m < 2 || n < 2) {
            System.out.println("Parameters m and n are must be larger than 1");
            return false;
        }

        if (m < n) {
            System.out.println("Quantity row (m) are must be larger or equals than quantity column (n)");
            return false;
        }

        return true;
    }
}
