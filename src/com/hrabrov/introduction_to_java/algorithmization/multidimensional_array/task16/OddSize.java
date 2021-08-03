package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

public class OddSize {
    //n = 2k + 1, k = 1, 2, 3, ...
    public static int[][] generateMagicSquare(int n) {
        int middleOfSideOfMagicSquare;
        middleOfSideOfMagicSquare = MiddleOfSideOfMatrix.find(n);

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
        middleOfSideOfAuxiliaryBigMatrix = MiddleOfSideOfMatrix.find(sizeOfAuxiliaryBigMatrix);
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
