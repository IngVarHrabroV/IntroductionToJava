package com.hrabrov.introduction_to_java.section_1.branching;

public class Task01 {
    /**
     * Given two angles of a triangle. Determine, does a triangle exists, if so, is it right triangle?
     *
     * @param alpha input 1th angle
     * @param beta  input 2th angle
     * @return string with answer
     */
    public static String triangleISThere(double alpha, double beta) {
        String answer;
        if (alpha + beta < 180) {
            answer = (alpha == 90 || beta == 90 || alpha + beta == 90) ? "Yes, triangle exists, it's right triangle" : "Yes, triangle exists, it isn't right triangle";
        } else {
            answer = "No, triangle don't exist";
        }
        return answer;
    }
}
