package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task08 {
    /**
     * Given numeral matrix. Replace the position of any two columns.
     * User enter is column numbers from keyboard
     *
     * @param originalMatrix input numeral matrix
     * @param firstColumn    input number of the first column to replace
     * @param secondColumn   input number of the second column to replace
     * @return matrix with replaced columns
     */

    public static int[][] replacedTwoColumn(int[][] originalMatrix, int firstColumn, int secondColumn) {
        int matrixVerticalSize = originalMatrix.length;
        int matrixHorizontalSize = originalMatrix[0].length;

        if (checkValidationArgument(matrixHorizontalSize, firstColumn, secondColumn)) {
            int temp;
            for (int i = 0; i < matrixVerticalSize; i++) {
                temp = originalMatrix[i][firstColumn - 1];
                originalMatrix[i][firstColumn - 1] = originalMatrix[i][secondColumn - 1];
                originalMatrix[i][secondColumn - 1] = temp;
            }

            return originalMatrix;
        }

        return new int[0][0];
    }

    private static boolean checkValidationArgument(int matrixHorizontalSize, int firstColumn, int secondColumn) {
        if (secondColumn > matrixHorizontalSize || firstColumn > matrixHorizontalSize) {
            System.out.println("Number of column can't be larger than horizontal size matrix");
            System.out.println("Horizontal matrix size is " + matrixHorizontalSize);
            return false;
        }

        if (firstColumn < 1 || secondColumn < 1) {
            System.out.println("Number of column can't be less than 1");
            return false;
        }

        return true;
    }
}
