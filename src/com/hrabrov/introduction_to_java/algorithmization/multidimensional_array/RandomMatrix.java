package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class RandomMatrix {
    final static int MAX_SIZE_OF_SIDE = 10;
    final static int MIN_SIZE_OF_SIDE = 2;
    final static int MAX_ABS_SIZE_OF_NUMBER = 99;
    final static int WRONG_SIZE = -1;

    /**
     * This is creating matrix, which has size between 2 and 10,  and has numbers between -99 and 99
     *
     * @param isSquare input true if matrix square, input false if matrix non-square
     * @return matrix, which contain random numbers
     */
    public static int[][] create(boolean isSquare) {
        int verticalSizeOfMatrix = WRONG_SIZE;
        int horizontalSizeOfMatrix = WRONG_SIZE;

        while (verticalSizeOfMatrix < MIN_SIZE_OF_SIDE) {
            verticalSizeOfMatrix = (int) (Math.random() * (MAX_SIZE_OF_SIDE + 1));
        }

        if (isSquare) {
            horizontalSizeOfMatrix = verticalSizeOfMatrix;
        } else {
            while (horizontalSizeOfMatrix < MIN_SIZE_OF_SIDE) {
                horizontalSizeOfMatrix = (int) (Math.random() * (MAX_SIZE_OF_SIDE + 1));
            }
        }

        return fillMatrix(verticalSizeOfMatrix, horizontalSizeOfMatrix);
    }

    public static int[][] create() {
        int verticalSizeOfMatrix = WRONG_SIZE;
        int horizontalSizeOfMatrix = WRONG_SIZE;

        while (verticalSizeOfMatrix < MIN_SIZE_OF_SIDE) {
            verticalSizeOfMatrix = (int) (Math.random() * (MAX_SIZE_OF_SIDE + 1));
        }

        while (horizontalSizeOfMatrix < MIN_SIZE_OF_SIDE) {
            horizontalSizeOfMatrix = (int) (Math.random() * (MAX_SIZE_OF_SIDE + 1));
        }

        return fillMatrix(verticalSizeOfMatrix, horizontalSizeOfMatrix);
    }

    private static int[][] fillMatrix(int verticalSizeOfMatrix, int horizontalSizeOfMatrix) {
        final double BORDER_FOR_CHOSEN_POSITIVE_OR_NEGATIVE_NUMBER = 0.5;

        int[][] randomMatrix = new int[verticalSizeOfMatrix][horizontalSizeOfMatrix];

        for (int i = 0; i < verticalSizeOfMatrix; i++) {
            for (int j = 0; j < horizontalSizeOfMatrix; j++) {
                double numberSign = Math.random();
                if (numberSign < BORDER_FOR_CHOSEN_POSITIVE_OR_NEGATIVE_NUMBER) {
                    numberSign = -1;
                } else {
                    numberSign = 1;
                }

                randomMatrix[i][j] = (int) (Math.random() * (MAX_ABS_SIZE_OF_NUMBER + 1) * numberSign);
            }
        }
        return randomMatrix;
    }
}
