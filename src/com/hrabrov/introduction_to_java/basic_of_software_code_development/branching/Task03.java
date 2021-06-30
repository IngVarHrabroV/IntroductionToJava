package com.hrabrov.introduction_to_java.basic_of_software_code_development.branching;

public class Task03 {
    /**
     * Given 3 dot: A(x1,y1), B(x2,y2); C(x3,y3).
     * Do 3 dots belong to one line?
     *
     * @param xA input x-coordinate for dot A
     * @param yA input y-coordinate for dot A
     * @param xB input x-coordinate for dot B
     * @param yB input y-coordinate for dot B
     * @param xC input x-coordinate for dot C
     * @param yC input y-coordinate for dot C
     * @return true or false, if dits belong to one line or no
     */

    public static String threeDotsOnOneLine(double xA, double yA,
                                            double xB, double yB,
                                            double xC, double yC) {
        if ((xA == xB && xA == xC) || (yA == yB && yA == yC)) {
            return "3 dots belong to one line!";
        } else {
            if ((xC - xA) / (xB - xA) == (yC - yA) / (yB - yA)) {
                return "3 dots belong to one line!";
            } else {
                return "3 dots NOT belong to one line!";
            }
        }
    }
}
