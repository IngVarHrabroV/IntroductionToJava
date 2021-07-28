package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class ValidateMatrixSize {
    public boolean toBeEvenAndValid(int n) {
        final int MIN_SIZE_OF_MATRIX = 2;

        if (n < MIN_SIZE_OF_MATRIX) {
            System.out.println("n can't be less, then " + MIN_SIZE_OF_MATRIX);
            return false;
        } else if (n % 2 != 0) {
            System.out.println("n can't be odd");
            return false;
        }

        return true;
    }
}
