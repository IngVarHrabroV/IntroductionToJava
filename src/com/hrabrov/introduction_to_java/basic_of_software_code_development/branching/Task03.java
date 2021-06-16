package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

public class Task03 {
    /**
     * Given 3 dot: A(x1,y1), B(x2,y2); C(x3,y3).
     * Do 3 dots belong to one line?
     *
     * @param x1 input x-coordinate for dot A
     * @param y1 input y-coordinate for dot A
     * @param x2 input x-coordinate for dot B
     * @param y2 input y-coordinate for dot B
     * @param x3 input x-coordinate for dot C
     * @param y3 input y-coordinate for dot C
     * @return true or false, if dits belong to one line or no
     */

    public static String threeDotsOnOneLine(double x1, double y1,
                                            double x2, double y2,
                                            double x3, double y3) {
        if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
            return "3 dots belong to one line!";
        } else {
            if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
                return "3 dots belong to one line!";
            } else {
                return "3 dots NOT belong to one line!";
            }
        }
    }
}
