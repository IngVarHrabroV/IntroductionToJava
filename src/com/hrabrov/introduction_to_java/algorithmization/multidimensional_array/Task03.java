package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task03 {
    /**
     * Given matrix. Display row k and column p
     *
     * @param originalMatrix input multidimensional array
     * @param k              input row number for display
     * @param p              input column number for display
     * @return multidimensional array, where first index - row; second index - column
     */

    public static int[][] displaySelectedLineAndColumn(int[][] originalMatrix, int k, int p) {
        int[] selectedRow = new int[originalMatrix[k].length];
        int[] selectedColumn = new int[originalMatrix.length];

        for (int j = 0, tempIndexForSaveOfNumberRow = 0;
             j < originalMatrix[k].length;
             j++, tempIndexForSaveOfNumberRow++) {
            selectedRow[tempIndexForSaveOfNumberRow] = originalMatrix[k - 1][j];
        }


        for (int i = 0, tempIndexForSaveOfNumberColumn = 0;
             i < originalMatrix.length;
             i++, tempIndexForSaveOfNumberColumn++) {
            selectedColumn[tempIndexForSaveOfNumberColumn] = originalMatrix[i][p - 1];
        }

        return new int[][]{selectedRow, selectedColumn};
    }
}
