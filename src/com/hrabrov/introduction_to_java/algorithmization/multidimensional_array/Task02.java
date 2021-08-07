package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task02 {
    /**
     * Given square matrix. Display diagonal elements of the matrix on the screen.
     *
     * @param originalMatrix input multidimensional array like square matrix
     * @return array with diagonal elements
     */

    private static ArrayOfDiagonalElements chooseDiagonalElement(int[][] originalMatrix) {
        ArrayOfDiagonalElements arrayOfDiagonalElements = new ArrayOfDiagonalElements();

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

    /**
     * See {@link #chooseDiagonalElement(int[][])} docs for more details
     */
    public static void run(int[][] originalMatrix) {
        ArrayOfDiagonalElements resultOfTask02 = chooseDiagonalElement(originalMatrix);
        System.out.println("Result of task 02:");
        System.out.println("Original matrix:\n" + StringHelper.matrixToString(originalMatrix));
        System.out.println("Elements of left-right diagonal: "
                + StringHelper.arrayToString(resultOfTask02.firstDiagonal));
        System.out.println("Elements of right-left diagonal: "
                + StringHelper.arrayToString(resultOfTask02.secondDiagonal));
    }

    static class ArrayOfDiagonalElements {
        int[] firstDiagonal;
        int[] secondDiagonal;
    }
}
