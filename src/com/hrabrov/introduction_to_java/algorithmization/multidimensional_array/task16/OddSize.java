package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

public class OddSize {
    //n = 2k + 1, k = 1, 2, 3, ...
    public static int[][] generateMagicSquare(int n) {
        final int middleOfSideOfMagicSquare = MiddleOfSideOfMatrix.find(n);

        //create auxiliary matrix (bigMatrix)
        final int howManyCellToAdd = (n - middleOfSideOfMagicSquare) * 2;

        final int sizeOfAuxiliaryBigMatrix = n + howManyCellToAdd;
        int[][] auxiliaryBigMatrix = new int[sizeOfAuxiliaryBigMatrix][sizeOfAuxiliaryBigMatrix];

        for (int i = 0; i < sizeOfAuxiliaryBigMatrix; i++) {
            for (int j = 0; j < sizeOfAuxiliaryBigMatrix; j++) {
                auxiliaryBigMatrix[i][j] = 0;
            }
        }

        //fill in diagonal rows
        final int middleOfSideOfAuxiliaryBigMatrix = MiddleOfSideOfMatrix.find(sizeOfAuxiliaryBigMatrix);
        int numberForFillAuxiliaryBigMatrix = 1;
        for (int i = middleOfSideOfAuxiliaryBigMatrix - 1, tempJ = 0; i < sizeOfAuxiliaryBigMatrix; i++, tempJ++) {
            for (int j = tempJ, tempI = i; j <= i; j++, tempI--) {
                auxiliaryBigMatrix[tempI][j] = numberForFillAuxiliaryBigMatrix;
                numberForFillAuxiliaryBigMatrix++;
            }
        }

        //transfer number from the terrace to the magic square
        final int halfOfAddedCells = howManyCellToAdd / 2;
        for (int i = 0; i < sizeOfAuxiliaryBigMatrix; i++) {
            for (int j = 0; j < sizeOfAuxiliaryBigMatrix; j++) {
                if (auxiliaryBigMatrix[i][j] != 0) {
                    //top terrace
                    if (i < halfOfAddedCells) {
                        auxiliaryBigMatrix[i + n][j] = auxiliaryBigMatrix[i][j];
                    }
                    //left terrace
                    if (j < halfOfAddedCells) {
                        auxiliaryBigMatrix[i][j + n] = auxiliaryBigMatrix[i][j];
                    }
                    //bottom terrace
                    if (i + 1 > n + halfOfAddedCells) {
                        auxiliaryBigMatrix[i - n][j] = auxiliaryBigMatrix[i][j];
                    }
                    //right terrace
                    if (j + 1 > n + halfOfAddedCells) {
                        auxiliaryBigMatrix[i][j - n] = auxiliaryBigMatrix[i][j];
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
}
