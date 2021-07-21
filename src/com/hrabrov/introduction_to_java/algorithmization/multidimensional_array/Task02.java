package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task02 {
    /**
     * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     * Given square matrix. Display diagonal elements of the matrix on the screen.
     *
     * @param originalMatrix input multidimensional array like square matrix
     * @return array with diagonal elements
     */

    public static arrayWithDiagonalElements chooseDiagonalElement(int[][] originalMatrix) {
        arrayWithDiagonalElements arrayWithDiagonalElements = new arrayWithDiagonalElements();

        int sizeMatrix = originalMatrix.length;

        arrayWithDiagonalElements.firstDiagonal = new int[sizeMatrix];
        arrayWithDiagonalElements.secondDiagonal = new int[sizeMatrix];

        int tempIndex = 0;
        for (int i = 0; i < originalMatrix.length; i++) {
            arrayWithDiagonalElements.firstDiagonal[tempIndex] = originalMatrix[i][i];
            tempIndex++;
        }

        tempIndex = 0;
        for (int i = 0; i < originalMatrix.length; i++) {
            arrayWithDiagonalElements.secondDiagonal[tempIndex] = originalMatrix[i][sizeMatrix - i - 1];
            tempIndex++;
        }

        return arrayWithDiagonalElements;
    }

    static class arrayWithDiagonalElements {
        int[] firstDiagonal;
        int[] secondDiagonal;
    }
}
