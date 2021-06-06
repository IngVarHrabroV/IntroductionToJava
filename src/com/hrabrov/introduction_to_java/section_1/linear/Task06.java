package com.hrabrov.introduction_to_java.section_1.linear;

public class Task06 {
    /**
     * We have area with coordinates:
     * -4, 0; -2, 0; -2, 4; 2, 4; 2, 0; 4, 0; 4, -3; -4, -3.
     * Return true, if dot with coordinate x, y into this area, else return false.
     */

    public static boolean dotInArea(double x, double y) {
        boolean dotIntoSquare = (x < 2 && x > -2) && (y < 4 && y > 0);
        boolean dotIntoRectangle = (x < 4 && x > -4) && (y > -3 && y < 0);

        return dotIntoSquare || dotIntoRectangle;
    }
}