package com.hrabrov.introduction_to_java.section_1.loops;

public class Task05 {
    /**
     * Given the number row and number e.  General term have  view:
     * a-n = 1 / 2 ^ n + 1 / 3 ^ n
     * Find the sum of the members of the number row, the modulus of which is greater than or equal to e.
     *
     * @param e      input value
     * @param nFirst input first index member in number row
     * @param nEnd   input last index member in number row
     * @return sum of the members
     */

    public static double sumMembersOfTheNumberRow(double e, int nFirst, int nEnd) {
        double returnValue = 0;

        for (int i = nFirst; i <= nEnd; i++) {
            returnValue += adsNumberN(i) >= e ? adsNumberN(i) : 0;
        }

        return returnValue;
    }

    public static double adsNumberN(int n) {
        double numberN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        return Math.abs(numberN);
    }
}
