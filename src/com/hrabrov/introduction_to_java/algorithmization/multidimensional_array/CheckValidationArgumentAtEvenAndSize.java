package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class CheckValidationArgumentAtEvenAndSize {
    public boolean check(int n) {
        if (n < 2) {
            System.out.println("n can't be less, then 2");
            return false;
        } else if (n % 2 != 0) {
            System.out.println("n can't be odd");
            return false;
        }

        return true;
    }
}
