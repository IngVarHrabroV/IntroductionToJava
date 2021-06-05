package com.hrabrov.introduction_to_java.section_1.loops;

import java.util.Arrays;
import java.util.ArrayList;

public class Task02 {
    /**
     * Found value function on the segment [a,b] with increment h:
     * y = x, x > 2 || y = -x, x <= 2.
     *
     * @param a input value
     * @param b input value
     * @param h input value
     * @return value function
     */

    public static String foundFunctionValue(double a, double b, double h) {
        ArrayList<Double> arrayValueFunction = new ArrayList<>();
        for (double i = a; i <= b; i += h) {
            if (i == 0) {
                arrayValueFunction.add(0.0);
            } else {
                arrayValueFunction.add(i > 2 ? i : -1 * i);
            }
        }
        return Arrays.toString(arrayValueFunction.toArray());
    }
}
