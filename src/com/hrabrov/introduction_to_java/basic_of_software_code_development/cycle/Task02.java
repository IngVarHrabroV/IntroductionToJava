package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

public class Task02 {
    /**
     * Found value function on the segment [a,b] with increment h:
     * y = x, x > 2 && y = -x, x <= 2.
     *
     * @param a input start value segment
     * @param b input finish value segment
     * @param h input increment
     * @return value function
     */

    public static String foundFunctionValue(double a, double b, double h) {
        String valueFunction = "";

        for (double i = a; i <= b; i += h) {
            if (i == 0) {
                valueFunction += "0 ";
            } else {
                valueFunction += i <= 2 ? Double.toString(-i) + " " : Double.toString(i) + " ";
            }
        }

        return valueFunction;
    }
}
