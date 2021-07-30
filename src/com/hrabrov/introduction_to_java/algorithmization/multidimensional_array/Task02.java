package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task02 {
    /**
     * Given square matrix. Display diagonal elements of the matrix on the screen.
     *
     * @param originalMatrix input multidimensional array like square matrix
     * @return array with diagonal elements
     */

    public static arrayOfDiagonalElements chooseDiagonalElement(int[][] originalMatrix) {
        arrayOfDiagonalElements arrayOfDiagonalElements = new arrayOfDiagonalElements();

        int sizeOfMatrix = originalMatrix.length;

        arrayOfDiagonalElements.firstDiagonal = new int[sizeOfMatrix];
        arrayOfDiagonalElements.secondDiagonal = new int[sizeOfMatrix];

        for (int i = 0, tempIndex = 0; i < originalMatrix.length; i++, tempIndex++) {
            arrayOfDiagonalElements.firstDiagonal[tempIndex] = originalMatrix[i][i];
        }

        for (int i = 0, tempIndex = 0; i < originalMatrix.length; i++, tempIndex++) {
            arrayOfDiagonalElements.secondDiagonal[tempIndex] = originalMatrix[i][sizeOfMatrix - i - 1];
        }

        return arrayOfDiagonalElements;
    }

    static class arrayOfDiagonalElements {
        int[] firstDiagonal;
        int[] secondDiagonal;
    }
}
