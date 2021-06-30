package com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program;

public class Task05 {
    /**
     * Given a natural number T, which represents the duration of the elapsed time in seconds.
     *
     * @param t input time in seconds
     * @return value as HHhMMmSSs
     */

    public static String convertTime(long t) {
        long hours;
        long mins;
        long secs;

        hours = t / 3600;
        mins = (t % 3600) / 60;
        secs = (t % 3600) % 60;

        return hours + "h " + mins + "m " + secs + "s";
    }
}
