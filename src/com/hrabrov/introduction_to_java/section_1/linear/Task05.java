package com.hrabrov.introduction_to_java.section_1.linear;

public class Task05 {
    /**
     * Given a natural number T, which represents the duration of the elapsed time in seconds.
     *
     * @param a input value
     * @return value as HHhMMmSSs
     */

    public static String convertTime(long a) {
        long hours, mins, secs;
        hours = a / 3600;
        mins = (a % 3600) / 60;
        secs = (a % 3600) % 60;

        return hours + "h" + mins + "m" + secs + "s";
    }
}
