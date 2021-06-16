package com.hrabrov.introduction_to_java.basic_of_software_code_development.linearing_program;

public class Task04 {
    /**
     * Given a real number: nnn.ddd. Return swap fractional and whole part;
     *
     * @param a input variable as nnn.ddd
     * @return number as ddd.nnn
     */

    public static double swapPartsNumber(double a) {
        return a * 1000 % 1000 + (int) a / 1000.0;
    }
}
