package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task02 {
    /**
     * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     * Given square matrix. Display diagonal elements of the matrix on the screen.
     *
     * @param originalMatrix input multidimensional array like square matrix
     * @return array with diagonal elements
     */

    public static int[] chooseDiagonalElement(int[][] originalMatrix) {
        int[] arrayWithMatrixDiagonalElements;
        arrayWithMatrixDiagonalElements = new int[originalMatrix.length];

        int tempIndex = 0;
        for (int i = 0; i < originalMatrix.length; i++) {
            arrayWithMatrixDiagonalElements[tempIndex] = originalMatrix[i][i];
            tempIndex++;
        }

        return arrayWithMatrixDiagonalElements;
    }
}
