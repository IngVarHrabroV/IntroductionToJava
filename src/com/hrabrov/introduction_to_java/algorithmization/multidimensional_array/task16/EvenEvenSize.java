package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

public class EvenEvenSize {
    //n = 4k, k = 1, 2, 3, ...
    public static int[][] generateMagicSquare(int n) {
        int[][] firstAuxiliaryMatrix =  new int[n][n];
        int[][] secondAuxiliaryMatrix = new int[n][n];

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
        int numberOfSubMatricesInRow = n / 4;

        int amountOfSubMatricesInMatrix;
        amountOfSubMatricesInMatrix = (int) Math.pow(numberOfSubMatricesInRow, 2);

        int subMatrixRowNumber = 0;
        int subMatrixColumnNumberForChoiceDiagonalFromLeftToRight = 0;
        int subMatrixColumnNumberForChoiceDiagonalFromRightToLeft = 1;

        for (int k = 1; k <= amountOfSubMatricesInMatrix; k++) {
            int tempA = 1;
            for (int i = subMatrixRowNumber; i < subMatrixRowNumber + 4; i++) {
                firstAuxiliaryMatrix[i][subMatrixColumnNumberForChoiceDiagonalFromLeftToRight] = 0;
                subMatrixColumnNumberForChoiceDiagonalFromLeftToRight++;
                firstAuxiliaryMatrix[i][subMatrixColumnNumberForChoiceDiagonalFromRightToLeft * 4 - tempA] = 0;
                tempA++;
            }
            subMatrixColumnNumberForChoiceDiagonalFromRightToLeft++;

            if (k % numberOfSubMatricesInRow == 0) {
                subMatrixRowNumber += 4;
                subMatrixColumnNumberForChoiceDiagonalFromLeftToRight = 0;
                subMatrixColumnNumberForChoiceDiagonalFromRightToLeft = 1;
            }
        }

        //union of matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp;
                temp = firstAuxiliaryMatrix[i][j] + secondAuxiliaryMatrix[i][j];
                if (temp == secondAuxiliaryMatrix[i][j]) {
                    firstAuxiliaryMatrix[i][j] = secondAuxiliaryMatrix[i][j];
                }
            }
        }

        return firstAuxiliaryMatrix;
    }
}
