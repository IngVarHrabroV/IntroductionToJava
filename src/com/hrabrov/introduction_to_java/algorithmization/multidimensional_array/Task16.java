package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task16 {
    /**
     * Generate magic square for matrix of size n.
     *
     * @param n input size of magic square
     * @return multidimensional array like magic square
     */

    public static int[][] generateMagicSquare(int n) {
        if (n % 2 != 0) {
            return generateMagicSquareForOddSize(n);
        } else if (n % 4 == 0) {
            return generateMagicSquareForEvenEvenSize(n);
        }

        return generateMagicSquareForEvenOddSize(n);
    }

    //n = 2k + 1, k = 1, 2, 3, ...
    private static int[][] generateMagicSquareForOddSize(int n) {
        int middleOfSideOfMagicSquare;
        middleOfSideOfMagicSquare = findMiddleOfSideOfMatrix(n);

        //create auxiliary matrix (bigMatrix)
        int howManyCellToAdd;
        howManyCellToAdd = (n - middleOfSideOfMagicSquare) * 2;
        int[][] auxiliaryBigMatrix;
        int sizeOfAuxiliaryBigMatrix;
        sizeOfAuxiliaryBigMatrix = n + howManyCellToAdd;
        auxiliaryBigMatrix = new int[sizeOfAuxiliaryBigMatrix][sizeOfAuxiliaryBigMatrix];

        for (int i = 0; i < sizeOfAuxiliaryBigMatrix; i++) {
            for (int j = 0; j < sizeOfAuxiliaryBigMatrix; j++) {
                auxiliaryBigMatrix[i][j] = 0;
            }
        }

        //fill in diagonal rows
        int middleOfSideOfAuxiliaryBigMatrix;
        middleOfSideOfAuxiliaryBigMatrix = findMiddleOfSideOfMatrix(sizeOfAuxiliaryBigMatrix);
        int numberForFillAuxiliaryBigMatrix = 1;
        int tempJ = 0;
        for (int i = middleOfSideOfAuxiliaryBigMatrix - 1; i < sizeOfAuxiliaryBigMatrix; i++) {
            int tempI = i;
            for (int j = tempJ; j <= i; j++) {
                auxiliaryBigMatrix[tempI][j] = numberForFillAuxiliaryBigMatrix;
                numberForFillAuxiliaryBigMatrix++;
                tempI -= 1;
            }
            tempJ++;
        }

        //transfer number from the terrace to the magic square
        int halfOfAddedCells;
        halfOfAddedCells = howManyCellToAdd / 2;
        for (int i = 0; i < sizeOfAuxiliaryBigMatrix; i++) {
            for (int j = 0; j < sizeOfAuxiliaryBigMatrix; j++) {
                //top terrace
                if (i < halfOfAddedCells) {
                    if (auxiliaryBigMatrix[i][j] != 0) {
                        auxiliaryBigMatrix[i + n][j] = auxiliaryBigMatrix[i][j];
                        auxiliaryBigMatrix[i][j] = 0;
                    }
                }
                //bottom terrace
                if (i + 1 > n + (halfOfAddedCells)) {
                    if (auxiliaryBigMatrix[i][j] != 0) {
                        auxiliaryBigMatrix[i - n][j] = auxiliaryBigMatrix[i][j];
                        auxiliaryBigMatrix[i][j] = 0;
                    }
                }
                //left terrace
                if (j < halfOfAddedCells) {
                    if (auxiliaryBigMatrix[i][j] != 0) {
                        auxiliaryBigMatrix[i][j + n] = auxiliaryBigMatrix[i][j];
                        auxiliaryBigMatrix[i][j] = 0;
                    }
                }
                //right terrace
                if (j + 1 > n + halfOfAddedCells) {
                    if (auxiliaryBigMatrix[i][j] != 0) {
                        auxiliaryBigMatrix[i][j - n] = auxiliaryBigMatrix[i][j];
                        auxiliaryBigMatrix[i][j] = 0;
                    }
                }
            }
        }

        //cut magic square from auxiliary big matrix
        int[][] magicSquare = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                magicSquare[i][j] = auxiliaryBigMatrix[i + halfOfAddedCells][j + halfOfAddedCells];
            }
        }

        return magicSquare;
    }

    //n = 4k, k = 1, 2, 3, ...
    private static int[][] generateMagicSquareForEvenEvenSize(int n) {
        int[][] firstAuxiliaryMatrix;
        int[][] secondAuxiliaryMatrix;

        firstAuxiliaryMatrix = new int[n][n];
        secondAuxiliaryMatrix = new int[n][n];

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
        int numberOfSubMatricesInRow;
        numberOfSubMatricesInRow = n / 4;

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

    //n = 4k + 2, k = 1, 2, 3, ...
    private static int[][] generateMagicSquareForEvenOddSize(int n) {
        int[][] magicSquare = new int[n][n];

        int sizeOfSubMatrix;
        sizeOfSubMatrix = findMiddleOfSideOfMatrix(n);

        int[][] numbersForFillSubMatrices;
        numbersForFillSubMatrices = generateMagicSquareForOddSize(sizeOfSubMatrix);

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

    private static int findMiddleOfSideOfMatrix(int n) {
        return (int) Math.ceil((double) n / 2);
    }
}
