package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task16 {
    /**
     * Построить магический квадрат для матрицы размера n.
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
        int midRowOrColumnForMagicSquare;
        midRowOrColumnForMagicSquare = findMidRowOrColumn(n);

        //create auxiliary matrix (bigMatrix)
        int howManyCellToAdd;
        howManyCellToAdd = (n - midRowOrColumnForMagicSquare) * 2;
        int[][] bigMatrix;
        int sizeBigMatrix;
        sizeBigMatrix = n + howManyCellToAdd;
        bigMatrix = new int[sizeBigMatrix][sizeBigMatrix];

        for (int i = 0; i < sizeBigMatrix; i++) {
            for (int j = 0; j < sizeBigMatrix; j++) {
                bigMatrix[i][j] = 0;
            }
        }

        //fill in diagonal rows
        int midRowOrColumnForBigMatrix;
        midRowOrColumnForBigMatrix = findMidRowOrColumn(sizeBigMatrix);
        int numberForFillBigMatrix = 1;
        int tempJ = 0;
        for (int i = midRowOrColumnForBigMatrix - 1; i < sizeBigMatrix; i++) {
            int tempI = i;
            for (int j = tempJ; j <= i; j++) {
                bigMatrix[tempI][j] = numberForFillBigMatrix;
                numberForFillBigMatrix++;
                tempI -= 1;
            }
            tempJ++;
        }

        //transfer number from the terrace to the magic square
        for (int i = 0; i < sizeBigMatrix; i++) {
            for (int j = 0; j < sizeBigMatrix; j++) {
                //top terrace
                if (i < howManyCellToAdd / 2) {
                    if (bigMatrix[i][j] != 0) {
                        bigMatrix[i + n][j] = bigMatrix[i][j];
                        bigMatrix[i][j] = 0;
                    }
                }
                //bottom terrace
                if (i + 1 > n + (howManyCellToAdd / 2)) {
                    if (bigMatrix[i][j] != 0) {
                        bigMatrix[i - n][j] = bigMatrix[i][j];
                        bigMatrix[i][j] = 0;
                    }
                }
                //left terrace
                if (j < howManyCellToAdd / 2) {
                    if (bigMatrix[i][j] != 0) {
                        bigMatrix[i][j + n] = bigMatrix[i][j];
                        bigMatrix[i][j] = 0;
                    }
                }
                //right terrace
                if (j + 1 > n + (howManyCellToAdd / 2)) {
                    if (bigMatrix[i][j] != 0) {
                        bigMatrix[i][j - n] = bigMatrix[i][j];
                        bigMatrix[i][j] = 0;
                    }
                }
            }
        }

        //cut magic square from auxiliary matrix
        int[][] magicSquare = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                magicSquare[i][j] = bigMatrix[i + howManyCellToAdd / 2][j + howManyCellToAdd / 2];
            }
        }

        return magicSquare;
    }

    //n = 4k, k = 1, 2, 3, ...
    private static int[][] generateMagicSquareForEvenEvenSize(int n) {
        int[][] auxiliaryMatrixOne;
        int[][] auxiliaryMatrixTwo;

        auxiliaryMatrixOne = new int[n][n];
        auxiliaryMatrixTwo = new int[n][n];

        int numberForFillAuxiliaryMatrixOne = 1;
        int numberForFillAuxiliaryMatrixTwo = (int) Math.pow(n, 2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                auxiliaryMatrixOne[i][j] = numberForFillAuxiliaryMatrixOne;
                numberForFillAuxiliaryMatrixOne++;
                auxiliaryMatrixTwo[i][j] = numberForFillAuxiliaryMatrixTwo;
                numberForFillAuxiliaryMatrixTwo--;
            }
        }

        //fill zeros on diagonal lines of 4 on 4 squares (small squares)
        int amountSmallSquaresInRow;
        amountSmallSquaresInRow = n / 4;

        int amountSmallSquaresInMatrix;
        amountSmallSquaresInMatrix = (int) Math.pow(amountSmallSquaresInRow, 2);

        int numberRowWithSmallSquares = 0;
        int columnNumberForFirstDiagonalInRowOfSmallSquares = 0; // this is need for left-right diagonal
        int columnNumberForSecondDiagonalInRowOfSmallSquares = 1;
        for (int k = 1; k <= amountSmallSquaresInMatrix; k++) {
            int tempA = 1;
            for (int i = numberRowWithSmallSquares; i < numberRowWithSmallSquares + 4; i++) {
                auxiliaryMatrixOne[i][columnNumberForFirstDiagonalInRowOfSmallSquares] = 0;
                columnNumberForFirstDiagonalInRowOfSmallSquares++;
                auxiliaryMatrixOne[i][columnNumberForSecondDiagonalInRowOfSmallSquares * 4 - tempA] = 0;
                tempA++;
            }
            columnNumberForSecondDiagonalInRowOfSmallSquares++;

            if (k % amountSmallSquaresInRow == 0) {
                numberRowWithSmallSquares += 4;
                columnNumberForFirstDiagonalInRowOfSmallSquares = 0;
                columnNumberForSecondDiagonalInRowOfSmallSquares = 1;
            }
        }

        //matrix alignment
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp;
                temp = auxiliaryMatrixOne[i][j] + auxiliaryMatrixTwo[i][j];
                if (temp == auxiliaryMatrixTwo[i][j]) {
                    auxiliaryMatrixOne[i][j] = auxiliaryMatrixTwo[i][j];
                }
            }
        }

        return auxiliaryMatrixOne;
    }

    //n = 4k + 2, k = 1, 2, 3, ...
    private static int[][] generateMagicSquareForEvenOddSize(int n) {
        int[][] magicSquare = new int[n][n];

        int sizeSmallSquare;
        sizeSmallSquare = findMidRowOrColumn(n);

        int[][] numbersForFirstSmallSquare;
        numbersForFirstSmallSquare = generateMagicSquareForOddSize(sizeSmallSquare);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < sizeSmallSquare && j < sizeSmallSquare) {
                    magicSquare[i][j] = numbersForFirstSmallSquare[i][j];
                }

                int smallSquareArea;
                smallSquareArea = (int) Math.pow(sizeSmallSquare, 2);
                if (i < sizeSmallSquare && j >= sizeSmallSquare) {
                    magicSquare[i][j]
                            = numbersForFirstSmallSquare[i][j - sizeSmallSquare] + 2 * smallSquareArea;
                }

                if (i >= sizeSmallSquare && j < sizeSmallSquare) {
                    magicSquare[i][j]
                            = numbersForFirstSmallSquare[i - sizeSmallSquare][j] + 3 * smallSquareArea;
                }

                if (i >= sizeSmallSquare && j >= sizeSmallSquare) {
                    magicSquare[i][j]
                            = numbersForFirstSmallSquare[i - sizeSmallSquare][j - sizeSmallSquare] + smallSquareArea;
                }
            }
        }

        int tempStorageForRearrangingNumber;

        for (int i = 0; i < sizeSmallSquare; i++) {
            for (int j = 0; j < 3; j++) {
                if (((i == 0 || i == sizeSmallSquare - 1) && j == 0)
                        || (i != 0 && i != sizeSmallSquare - 1 && j == 1)) {
                    tempStorageForRearrangingNumber = magicSquare[i][j];
                    magicSquare[i][j] = magicSquare[i + sizeSmallSquare][j];
                    magicSquare[i + sizeSmallSquare][j] = tempStorageForRearrangingNumber;
                }
            }
        }

        int halfQuantityCenterColumnForReplace = (sizeSmallSquare - 3) / 2;

        for (int k = halfQuantityCenterColumnForReplace * (-1); k < halfQuantityCenterColumnForReplace; k++) {
            for (int i = 0; i < sizeSmallSquare; i++) {
                tempStorageForRearrangingNumber = magicSquare[i][sizeSmallSquare + k];
                magicSquare[i][sizeSmallSquare + k] =
                        magicSquare[i + sizeSmallSquare][sizeSmallSquare + k];
                magicSquare[i + sizeSmallSquare][sizeSmallSquare + k] = tempStorageForRearrangingNumber;
            }
        }

        return magicSquare;
    }

    private static int findMidRowOrColumn(int n) {
        return (int) Math.ceil((double) n / 2);
    }
}
