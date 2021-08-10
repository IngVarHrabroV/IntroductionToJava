package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task05 {
    /**
     * Find number, which less than only the largest number
     *
     * @param array input array with number
     * @return required number
     */

    private static int findNumber(int[] array) {
        sortingArrayToAscending(array);

        final int sizeOfArray = array.length;
        final int indexOfPenultimateElement = sizeOfArray - 2;

        return array[indexOfPenultimateElement];
    }

    private static void sortingArrayToAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * See {@link #findNumber(int[])} docs for more details
     */
    public static void run(int[] array) {
        int resultOfTask05 = findNumber(array);
        System.out.println("Result of task 05: " + resultOfTask05);
    }
}
