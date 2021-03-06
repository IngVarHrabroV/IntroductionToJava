package com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program;

public class Task04 {
    /**
     * Given a real number: nnn.ddd. Return swap fractional and whole part;
     *
     * @param a input variable as nnn.ddd
     * @return number as ddd.nnn
     */

    public static double swapPartsNumber(double a) {
        double beforeDot;
        double afterDot;

        afterDot = a * 1000 % 1000;
        beforeDot = (int) a / 1000.0;

        return afterDot + beforeDot;
    }
}
