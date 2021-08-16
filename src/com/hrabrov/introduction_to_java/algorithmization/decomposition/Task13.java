package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.Helper;

public class Task13 {
    /**
     * Given number n, which more than 2. Find numbers-twins between n and 2 * n.
     *
     * @param startOfSegment input number
     * @return array with numbers-twins
     */

    private static int[] findNumbersTwins(int startOfSegment) {
        final int endOfSegment = startOfSegment * 2;
        final int EMPTY_ARRAY = 0;

        int[] numbersOfTwins = new int[]{EMPTY_ARRAY};
        numbersOfTwins = fillArray(startOfSegment, endOfSegment, numbersOfTwins);

        return numbersOfTwins;
    }

    private static int[] fillArray(int startOfSegment, int endOfSegment, int[] arrayForFill) {
        for (int i = startOfSegment; i <= endOfSegment - 2; i++) {
            arrayForFill = Helper.addToArray(i, arrayForFill);
            arrayForFill = Helper.addToArray(i + 2, arrayForFill);
        }

        return arrayForFill;
    }


    /**
     * See {@link #findNumbersTwins(int)} docs for more details
     */
    public static void run(int startOfSegment) {
        System.out.println("Result of task 13: ");

        if (checkArgument(startOfSegment)) {
            System.out.println("N have to more, than 2.");
            return;
        }

        int[] resultOfTask13 = findNumbersTwins(startOfSegment);
        System.out.println(Helper.arrayToString(resultOfTask13));
    }

    private static boolean checkArgument(int checkingNumber) {
        return checkingNumber <= 2;
    }
}
