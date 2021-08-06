package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task03 {
    /**
     * Given matrix. Display row k and column p
     *
     * @param originalMatrix            input multidimensional array
     * @param rowNumberForDisplaying    input row number for display
     * @param columnNumberForDisplaying input column number for display
     * @return multidimensional array, where first index - row; second index - column
     */

    private static int[][] displaySelectedLineAndColumn(int[][] originalMatrix,
                                                        int rowNumberForDisplaying,
                                                        int columnNumberForDisplaying) {

        final int verticalSizeOfMatrix = originalMatrix.length;
        final int horizontalSizeOfMatrix = originalMatrix[0].length;

        if (rowNumberForDisplaying > verticalSizeOfMatrix
                || columnNumberForDisplaying > horizontalSizeOfMatrix) {
            return null;
        }

        int[] selectedRow = new int[horizontalSizeOfMatrix];
        int[] selectedColumn = new int[verticalSizeOfMatrix];

        for (int j = 0, tempIndexForSaveOfNumberRow = 0;
             j < horizontalSizeOfMatrix;
             j++, tempIndexForSaveOfNumberRow++) {
            selectedRow[tempIndexForSaveOfNumberRow] = originalMatrix[rowNumberForDisplaying - 1][j];
        }

        for (int i = 0, tempIndexForSaveOfNumberColumn = 0;
             i < verticalSizeOfMatrix;
             i++, tempIndexForSaveOfNumberColumn++) {
            selectedColumn[tempIndexForSaveOfNumberColumn] = originalMatrix[i][columnNumberForDisplaying - 1];
        }

        return new int[][]{selectedRow, selectedColumn};
    }

    /**
     * See {@link #displaySelectedLineAndColumn(int[][], int, int)} docs for more details
     */
    public static void run(int[][] originalMatrix, int rowNumberForDisplaying, int columnNumberForDisplaying) {
        System.out.println("Result of task 03:");
        System.out.println("Original matrix:\n" + StringHelper.matrixToString(originalMatrix));

        int[][] resultOfTask03 = Task03.displaySelectedLineAndColumn(
                originalMatrix,
                rowNumberForDisplaying,
                columnNumberForDisplaying);

        if (resultOfTask03 == null) {
            System.out.println("Matrix has no selected row or column");
            return;
        }

        System.out.println("Selected row: " + StringHelper.arrayToString(resultOfTask03[0]));
        System.out.println("Selected column: " + StringHelper.arrayToString(resultOfTask03[1]));
    }
}
