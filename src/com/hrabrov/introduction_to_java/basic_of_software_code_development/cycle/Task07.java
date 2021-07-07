package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

public class Task07 {
    /**
     * Given two natural number: m and n. Find all divider (without 0 and 1)
     * for each other natural number between m and n (inclusive).
     * m and n entering with keyboard.
     *
     * @param m input natural value
     * @param n input natural value
     * @return all divider for natural number between m and n.
     */

    public static String findDividerForAllNumbers(long m, long n) {
        if (checkValidityArgument(m, n)) {
            String tableWithNumbersAndDivider = "\n";

            for (long i = m; i <= n; i++) {
                tableWithNumbersAndDivider += findDivider(i);
                if (i != n) {
                    tableWithNumbersAndDivider += "\n";
                }
            }

            return tableWithNumbersAndDivider;
        }

        return "Invalid arguments";
    }

    public static boolean checkValidityArgument(long m, long n) {
        if (m > n) {
            System.out.println("m cannot be large then n");
            return false;
        } else if (m == n) {
            System.out.println("m cannot be equals n");
            return false;
        } else if (m < 0) {
            System.out.println("m cannot be less then 0, try again");
            return false;
        }
        return true;
    }

    public static String findDivider(long a) {
        String lineHeader;
        String dividerForNumber;

        lineHeader = "     " + a + " has next divider: ";
        dividerForNumber = lineHeader;

        for (long i = 2; i < a; i++) {
            dividerForNumber += a % i == 0 ? i + " " : "";
        }

        return dividerForNumber.equals(lineHeader) ? "     " + a + " hasn't divider" : dividerForNumber;
    }
}
