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
            if (i > 2) {
                arrayValueFunction.add(i);
            } else {
                if (i != 0) {
                    arrayValueFunction.add(-1 * i);
                } else {
                    arrayValueFunction.add(0.0);
                }
            }
        }
        return Arrays.toString(arrayValueFunction.toArray());
    }
}
