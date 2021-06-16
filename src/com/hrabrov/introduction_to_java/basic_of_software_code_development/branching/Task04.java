package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

import java.util.Arrays;

public class Task04 {
    /**
     * Given rectangular hole in wall with sides a, b and given brick with sides x, y, z.
     * Found, can brick fit rectangular hole?
     *
     * @param a input 1th side rectangular hole
     * @param b input 2th side rectangular hole
     * @param x input brick's width
     * @param y input brick's height
     * @param z input brick's depth
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
