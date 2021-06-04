package com.hrabrov.introduction_to_java.section_1.branching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task04 {
    /**
     * Given rectangular hole in wall with sides a, b and given brick with sides x, y, z. Can brick fit rectangular hole?
     *
     * @param a input value
     * @param b input value
     * @param x input value
     * @param y input value
     * @param z input value
     * @return String, that ask for question
     */

    public static String brickCanFit(double a, double b, double x, double y, double z) {
        double[] hole = {a, b};
        double[] brick = {x, y, z};

        Arrays.sort(hole);
        Arrays.sort(brick);

        if (hole[0] > brick[0] && hole[1] > brick[1]) {
            return "Yes, brick can fit in rectangular hole";
        } else {
            return "No, brick can't fit in rectangular hole";
        }
    }
}
