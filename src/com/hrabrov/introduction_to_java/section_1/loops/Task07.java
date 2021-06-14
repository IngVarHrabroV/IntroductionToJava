package com.hrabrov.introduction_to_java.section_1.loops;

public class Task07 {
    /**
     * Given two natural number: m and n. Find all divider (without 0 and 1) for each other natural number between m and n.
     * m and n enter with keyboard.
     *
     * @param m input natural value
     * @param n input natural value
     * @return all divider for natural number between m and n.
     */

    public static StringBuilder findDividerForAllNumbers(long m, long n) {
        checkValidityArgument(m, n);

        StringBuilder tableWithNumbersAndDivider = new StringBuilder("\n");

        for (long i = m; i <= n; i++) {
            tableWithNumbersAndDivider.append(findDivider(i));
            if (i != n) {
                tableWithNumbersAndDivider.append("\n");
            }
        }

        return tableWithNumbersAndDivider;
    }

    public static void checkValidityArgument(long m, long n) {
        if (m > n) {
            throw new IllegalArgumentException("m cannot be large then n");
        } else if (m == n) {
            throw new IllegalArgumentException("m cannot be equals n");
        } else if (m < 0) {
            throw new IllegalArgumentException("m cannot be less then 0, try again");
        }
    }

    public static String findDivider(long a) {
        String lineHeader = a + " has next divider: ";
        String dividerForNumber = lineHeader;

        for (long i = 2; i < a; i++) {
            dividerForNumber += a % i == 0 ? i + " " : "";
        }

        return dividerForNumber.equals(lineHeader) ? a + " hasn't divider" : dividerForNumber;
    }
}
