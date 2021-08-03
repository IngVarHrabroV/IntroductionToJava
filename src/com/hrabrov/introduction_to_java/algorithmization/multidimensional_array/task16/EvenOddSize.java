package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

public class EvenOddSize {
    //n = 4k + 2, k = 1, 2, 3, ...
    public static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int sizeOfSubMatrix;
        sizeOfSubMatrix = MiddleOfSideOfMatrix.find(n);

        int[][] numbersForFillSubMatrices;
        numbersForFillSubMatrices = OddSize.generateMagicSquare(sizeOfSubMatrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < sizeOfSubMatrix && j < sizeOfSubMatrix) {
                    magicSquare[i][j] = numbersForFillSubMatrices[i][j];
                }

                int areaOfSubMatrix;
                areaOfSubMatrix = (int) Math.pow(sizeOfSubMatrix, 2);

                if (i < sizeOfSubMatrix && j >= sizeOfSubMatrix) {
                    magicSquare[i][j] = numbersForFillSubMatrices[i][j - sizeOfSubMatrix]
                            + 2 * areaOfSubMatrix;
                }

                if (i >= sizeOfSubMatrix && j < sizeOfSubMatrix) {
                    magicSquare[i][j] = numbersForFillSubMatrices[i - sizeOfSubMatrix][j]
                            + 3 * areaOfSubMatrix;
                }

                if (i >= sizeOfSubMatrix && j >= sizeOfSubMatrix) {
                    magicSquare[i][j] = numbersForFillSubMatrices[i - sizeOfSubMatrix][j - sizeOfSubMatrix]
                            + areaOfSubMatrix;
                }
            }
        }

        int tempStorageForRearrangingNumber;
        for (int i = 0; i < sizeOfSubMatrix; i++) {
            for (int j = 0; j < 3; j++) {
                if ((j == 0 && (i == 0 || i == sizeOfSubMatrix - 1))
                        || (j == 1 && i != 0 && i != sizeOfSubMatrix - 1)) {
                    tempStorageForRearrangingNumber = magicSquare[i][j];
                    magicSquare[i][j] = magicSquare[i + sizeOfSubMatrix][j];
                    magicSquare[i + sizeOfSubMatrix][j] = tempStorageForRearrangingNumber;
                }
            }
        }

        int halfOfQuantityColumnsForReplace = (sizeOfSubMatrix - 3) / 2;

        for (int k = halfOfQuantityColumnsForReplace * (-1); k < halfOfQuantityColumnsForReplace; k++) {
            for (int i = 0; i < sizeOfSubMatrix; i++) {
                tempStorageForRearrangingNumber = magicSquare[i][sizeOfSubMatrix + k];
                magicSquare[i][sizeOfSubMatrix + k] =
                        magicSquare[i + sizeOfSubMatrix][sizeOfSubMatrix + k];
                magicSquare[i + sizeOfSubMatrix][sizeOfSubMatrix + k] = tempStorageForRearrangingNumber;
            }
        }

        return magicSquare;
    }
}
