package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task08 {
    /**
     * Given array. Find sums all three consecutive elements start k element  and  end m element
     * (k is starting three consecutive, n is ending three consecutive):
     * D[d1, d2, d3, d4, d5, ..., dn-2, dn-1, dn], where k is d1-element, m is dn-element. Find all sums like:
     * d1 + d2 + d3, d2 + d3 + d4; d3 + d4 + d5, ..., dn-2, dn-1, dn.
     *
     * @param array         input array with number
     * @param startElement  input start element for calculate
     * @param finishElement input finish element for calculate
     */

    private static int[] sumsAllThreeConsecutiveElements(int[] array, int startElement, int finishElement) {
        final int indexOfStartElement = startElement - 1;
        final int indexOfFinishElement = finishElement - 1;
        final int quantityOfSumsThreeConsecutiveElements = finishElement - startElement - 1;
        int[] sumsOfAllThreeConsecutiveElements = new int[quantityOfSumsThreeConsecutiveElements];

        for (int i = indexOfStartElement, index = 0; i <= indexOfFinishElement - 2; i++, index++) {
            sumsOfAllThreeConsecutiveElements[index] = findSumThreeConsecutiveElements(array, i);
        }

        return sumsOfAllThreeConsecutiveElements;
    }

    private static int findSumThreeConsecutiveElements(int[] array, int indexOfCurrentElement) {
        final int quantityConsecutiveElements = 3;
        final int indexOfLastConsecutiveElement = indexOfCurrentElement + quantityConsecutiveElements - 1;

        int sumOfConsecutiveElements = 0;
        for (int i = indexOfCurrentElement; i <= indexOfLastConsecutiveElement; i++) {
            sumOfConsecutiveElements += array[i];
        }

        return sumOfConsecutiveElements;
    }

    /**
     * See {@link #sumsAllThreeConsecutiveElements(int[], int, int)} docs for more details
     */
    public static void run(int[] array, int startElement, int finishElement) {
        System.out.println("Result of task 08:");

        if (startElement < 1 || finishElement > array.length) {
            System.out.println("Entered incorrect value start or finish elements");
            return;
        }

        if (finishElement < startElement + 2) {
            System.out.println("Between start and finish elements have to be one number");
            return;
        }

        System.out.println(arrayToString(sumsAllThreeConsecutiveElements(array, startElement, finishElement)));
    }

    private static String arrayToString(int[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }
}
