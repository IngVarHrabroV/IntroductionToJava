package com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program;

public class Task06 {
    /**
     * We have area bounded coordinates:
     * -4, 0; -2, 0; -2, 4; 2, 4; 2, 0; 4, 0; 4, -3; -4, -3.
     * And dot with coordinate (x, y).
     * Find, dot is into area or not.
     *
     * @param x input value equals dot's x-coordinate
     * @param y input value equals dot's y-coordinate
     * @return true, if dot into area, else return false.
     */

    public static boolean dotInArea(double x, double y) {
        boolean dotIntoSquare;
        boolean dotIntoRectangle;

        dotIntoSquare = (x > -2 && x < 2) && (y > 0 && y < 4);
        dotIntoRectangle = (x > -4 && x < 4) && (y > -3 && y < 0);

        return dotIntoSquare || dotIntoRectangle;
    }
}
