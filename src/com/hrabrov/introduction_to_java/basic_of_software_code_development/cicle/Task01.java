package com.hrabrov.introduction_to_java.basic_of_software_code_development.cicle;

public class Task01 {
    /**
     * Given x. Find the sum of all numbers from 1 to x
     *
     * @param x input positive integer value
     * @return sum of all numbers from 1 to x
     */

    public static long sumNumbersTo(long x) {
        long sum = 0;

        for(int i = 1; i <= x; i++) {
            sum += i;
        }

        return sum;

        //return (long) (Math.pow(x, 2) + x) / 2;
    }
}
