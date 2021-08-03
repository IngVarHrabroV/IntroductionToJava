package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16;

import com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.StringHelper;

public class Task16 {
    /**
     * Generate magic square for matrix of size n.
     *
     * @param n input size of magic square
     * @return multidimensional array like magic square
     */

    private static int[][] generateMagicSquare(int n) {
        if (n % 2 != 0) {
            return OddSize.generateMagicSquare(n);
        } else if (n % 4 == 0) {
            return EvenEvenSize.generateMagicSquare(n);
        }

        return EvenOddSize.generateMagicSquare(n);
    }

    public static void run(int sizeOfMatrix) {
        System.out.println("Result of task 16:");
        int[][] resultOfTask16 = Task16.generateMagicSquare(sizeOfMatrix);
        System.out.println(StringHelper.matrixToString(resultOfTask16));
    }
}
