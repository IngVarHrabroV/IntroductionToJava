package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task13 {
    /**
     * Given number n, which more than 2. Find numbers-twins between n and 2 * n.
     *
     * @param numberOfStartSegment input number
     * @return array with numbers-twins
     */

    private static int[] findNumbersTwins(int numberOfStartSegment) {
        final int endSegment = numberOfStartSegment * 2;

        int[] numbersTwins = createArrayForTwins(numberOfStartSegment);
        fillArray(numberOfStartSegment, endSegment, numbersTwins);

        return numbersTwins;
    }

    private static int[] createArrayForTwins(int numberOfStartSegment) {
        final int sizeOfArray = (numberOfStartSegment - 1) * 2;
        return new int[sizeOfArray];
    }

    private static void fillArray(int startSegment, int endSegment, int[] arrayForFill) {
        for (int i = startSegment; i <= endSegment - 2; i++) {
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
    public static void run(int startSegment) {
        System.out.println("Result of task 13: ");

        if (!checkArgument(startSegment)) {
            System.out.println("N have to more, than 2.");
        }

        int[] resultOfTask13 = findNumbersTwins(startSegment);
        System.out.println(Helper.arrayToString(resultOfTask13));
    }

    private static boolean checkArgument(int checkingNumber) {
        return checkingNumber > 2;
    }
}
