package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task03 {
    /**
     * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
     * Given matrix. Display row k and column p
     *
     * @param originalMatrix input multidimensional array
     * @param k              input row number for display
     * @param p              input column number for display
     * @return multidimensional array, where first index - row; second index - column
     */

    public static int[][] displayLineAndColumn(int[][] originalMatrix, int k, int p) {
        int[][] rowAndColumn = new int[2][];

        rowAndColumn[0] = new int[originalMatrix[k].length];
        rowAndColumn[1] = new int[originalMatrix.length];

        int tempIndexForRow = 0;
        for (int j = 0; j < originalMatrix[k].length; j++) {
            rowAndColumn[0][tempIndexForRow] = originalMatrix[k - 1][j];
            tempIndexForRow++;
        }

        int tempIndexForColumn = 0;
        for (int i = 0; i < originalMatrix.length; i++) {
            rowAndColumn[1][tempIndexForColumn] = originalMatrix[i][p - 1];
            tempIndexForColumn++;
        }

        return rowAndColumn;
    }
}
