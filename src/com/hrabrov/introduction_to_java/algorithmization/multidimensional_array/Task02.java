package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task02 {
    /**
     * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     * Given square matrix. Display diagonal elements of the matrix on the screen.
     *
     * @param originalMatrix input multidimensional array like square matrix
     * @return array with diagonal elements
     */

    public static arrayOfDiagonalElements chooseDiagonalElement(int[][] originalMatrix) {
        arrayOfDiagonalElements arrayOfDiagonalElements = new arrayOfDiagonalElements();

        int sizeMatrix = originalMatrix.length;

        arrayOfDiagonalElements.firstDiagonal = new int[sizeMatrix];
        arrayOfDiagonalElements.secondDiagonal = new int[sizeMatrix];

        for (int i = 0, tempIndex = 0; i < originalMatrix.length; i++, tempIndex++) {
            arrayOfDiagonalElements.firstDiagonal[tempIndex] = originalMatrix[i][i];
        }

        for (int i = 0, tempIndex = 0; i < originalMatrix.length; i++, tempIndex++) {
            arrayOfDiagonalElements.secondDiagonal[tempIndex] = originalMatrix[i][sizeMatrix - i - 1];
        }

        return arrayOfDiagonalElements;
    }

    static class arrayOfDiagonalElements {
        int[] firstDiagonal;
        int[] secondDiagonal;
    }
}
