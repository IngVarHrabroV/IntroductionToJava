package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Sorting {
    public static void run() {
        int[] firstArrayForTask01 = new int[]{24, 26, 19, 46};
        int[] secondArrayForTask01 = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] resultOfTask01 = Task01.concatenatingArrays(firstArrayForTask01, secondArrayForTask01, 3);
        if (resultOfTask01.length != firstArrayForTask01.length) {
            System.out.println("Result of task 01: " + arrayToString(resultOfTask01));
        }

    }

    private static String arrayToString(int[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }
}
