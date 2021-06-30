package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

public class Task05 {
    /**
     * Find function value:
     * if x <= 3 with then x^2 - 3 * x + 9,
     * if x > 3 with then 1 / (x^3 + 6)
     *
     * @param x input value function
     * @return function value
     */

    public static double calculateFunctionValue(double x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
