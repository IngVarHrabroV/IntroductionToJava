package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task16 {
    /**
     * Построить магический квадрат для матрицы размера n.
     * Generate magic square for matrix of size n.
     *
     * @param n input size of magic square
     * @return multidimensional array like magic square
     */

    public static int[][] generateMagicSquareForOddSize(int n) {
        int midRowOrColumnForMagicSquare;
        midRowOrColumnForMagicSquare = midRowOrColumn(n);

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
        midRowOrColumnForBigMatrix = midRowOrColumn(sizeBigMatrix);
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

    private static int midRowOrColumn(int n) {
        return (int) Math.ceil((double) n / 2);
    }
}
