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

        int[] numbersTwins = createArrayForTwins(startOfSegment);
        fillArray(startOfSegment, endOfSegment, numbersTwins);

        return numbersTwins;
    }

    private static int[] createArrayForTwins(int startOfSegment) {
        final int sizeOfArray = (startOfSegment - 1) * 2;
        return new int[sizeOfArray];
    }

    private static void fillArray(int startOfSegment, int endOfSegment, int[] arrayForFill) {
        for (int i = startOfSegment; i <= endOfSegment - 2; i++) {
            addNumberToArray(i, arrayForFill);
            addNumberToArray(i + 2, arrayForFill);
        }
    }

    private static void addNumberToArray(int number, int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 0) {
                originalArray[i] = number;
                return;
            }
        }
    }

    /**
     * See {@link #findNumbersTwins(int)} docs for more details
     */
    public static void run(int startOfSegment) {
        System.out.println("Result of task 13: ");

        if (!checkArgument(startOfSegment)) {
            System.out.println("N have to more, than 2.");
        }

        int[] resultOfTask13 = findNumbersTwins(startOfSegment);
        System.out.println(Helper.arrayToString(resultOfTask13));
    }

    private static boolean checkArgument(int checkingNumber) {
        return checkingNumber > 2;
    }
}
