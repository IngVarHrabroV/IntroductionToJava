package com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program;

public class Task05 {
    /**
     * Given a natural number a, which represents the duration of the elapsed time in seconds.
     *
     * @param a input time in seconds
     * @return value as HHhMMmSSs
     */

    public static String convertTime(long a) {
        long hours;
        long mins;
        long secs;

        hours = a / 3600;
        mins = (a % 3600) / 60;
        secs = (a % 3600) % 60;

        return hours + "h" + mins + "m" + secs + "s";
    }
}
