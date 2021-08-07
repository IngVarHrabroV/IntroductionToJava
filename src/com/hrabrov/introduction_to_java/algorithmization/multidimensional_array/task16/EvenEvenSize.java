package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

public class EvenEvenSize {
    //n = 4k, k = 1, 2, 3, ...
    public static int[][] generateMagicSquare(int n) {
        final int[][] firstAuxiliaryMatrix = new int[n][n];
        final int[][] secondAuxiliaryMatrix = new int[n][n];

        int numberForFillFirstAuxiliaryMatrix = 1;
        int numberForFillSecondAuxiliaryMatrix = (int) Math.pow(n, 2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                firstAuxiliaryMatrix[i][j] = numberForFillFirstAuxiliaryMatrix;
                numberForFillFirstAuxiliaryMatrix++;

                secondAuxiliaryMatrix[i][j] = numberForFillSecondAuxiliaryMatrix;
                numberForFillSecondAuxiliaryMatrix--;
            }
        }

        //fill zeros on diagonal lines of 4 on 4 squares (small squares)
        final int sizeOfSquareSubMatrix = 4;
        final int numberOfSubMatricesInRow = n / sizeOfSquareSubMatrix;

        int amountOfSubMatricesInMatrix = (int) Math.pow(numberOfSubMatricesInRow, 2);

        int subMatrixRowNumber = 0;
        int subMatrixColumnNumberForChoiceDiagonalFromLeftToRight = 0;
        int subMatrixColumnNumberForChoiceDiagonalFromRightToLeft = 1;

        for (int k = 1; k <= amountOfSubMatricesInMatrix; k++) {
            for (int i = subMatrixRowNumber, temp = 1; i < subMatrixRowNumber + sizeOfSquareSubMatrix; i++, temp++) {
                firstAuxiliaryMatrix[i][subMatrixColumnNumberForChoiceDiagonalFromLeftToRight] = 0;
                subMatrixColumnNumberForChoiceDiagonalFromLeftToRight++;
                firstAuxiliaryMatrix[i]
                        [subMatrixColumnNumberForChoiceDiagonalFromRightToLeft * sizeOfSquareSubMatrix - temp] = 0;
            }
            subMatrixColumnNumberForChoiceDiagonalFromRightToLeft++;

            if (k % numberOfSubMatricesInRow == 0) {
                subMatrixRowNumber += sizeOfSquareSubMatrix;
                subMatrixColumnNumberForChoiceDiagonalFromLeftToRight = 0;
                subMatrixColumnNumberForChoiceDiagonalFromRightToLeft = 1;
            }
        }

        //union of matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = firstAuxiliaryMatrix[i][j] + secondAuxiliaryMatrix[i][j];
                if (temp == secondAuxiliaryMatrix[i][j]) {
                    firstAuxiliaryMatrix[i][j] = secondAuxiliaryMatrix[i][j];
                }
            }
        }

        return firstAuxiliaryMatrix;
    }
}
