package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class Task01 {
    /**
     * Array a[n] contain natural number. Find sum of array's elements, which multiple number is k
     *
     * @param a input array with natural number
     * @param k input multiple
     * @return sum of all number multiple k
     */

    public static int sumMultipleNumber(int[] a, int k) {
        int sumNumber;

        sumNumber = 0;
        for (int i : a) {
            sumNumber += i % k == 0 ? i : 0;
        }

        return sumNumber;
    }

}
