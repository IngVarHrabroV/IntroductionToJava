package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

public class OneDimensionalArray {
    public static void run() {
        int[] arrayForTask01 = new int[]{3, 4, 5, 6, 8};
        int resultOfTask01 = Task01.sumMultipleNumber(arrayForTask01, 3);
        System.out.println("Result task 01: " + resultOfTask01);

        double[] arrayForTask02 = new double[]{3.54, 3.67, 4.25};
        Task02.ArrayAndCountReplacement resultOfTask02 = Task02.replacementNumber(arrayForTask02, 3.55);
        System.out.println(
                "Result of task 02: "
                + "replacement array = " + arrayToString(resultOfTask02.sequenceOfReal) + ", "
                + "number of replace = " + resultOfTask02.replacement);

        Task03.Quantity resultOfTask03 = Task03.checkArrayElements(10);
        System.out.println(
                "Result of task 03:"
                + " quantity of negative number = " + resultOfTask03.negativeQuantity
                + "; quantity of positive number = " + resultOfTask03.positiveQuantity
                + "; quantity of number equals zero = " + resultOfTask03.zeroQuantity);

        double[] arrayForTask04 = new double[]{4.25, 4.26, 4.27, 4.28};
        double[] resultOfTask04 = Task04.swapElements(arrayForTask04);
        System.out.println("Result of task 04: " + arrayToString(resultOfTask04));

        int[] arrayForTask05 = new int[]{-5, 2, 5, 6, -3, -42};
        int[] resultOfTask05 = Task05.selectElement(arrayForTask05);
        System.out.println("Result of task 05: " + arrayToString(resultOfTask05));

        double[] arrayForTask06 = new double[]{0.98, 0, -0.61, 0.38, 0.23, 0.51, -0.73, -0.04};
        double resultOfTask06 = Task06.sumPrimeNumber(arrayForTask06);
        System.out.println("Result of task 06: " + resultOfTask06);

        double[] arrayForTask07 = new double[]{0.049, 0.950, 0.634, 0.374, 0.099, -0.933};
        double resultOfTask07 = Task07.maxValueFromSequence(arrayForTask07);
        System.out.println("Result of task 07: "
                + (resultOfTask07 != 0.0 ? resultOfTask07 : "the number of members in the sequence must be even" ));

        int[] arrayForTask08 = new int[]{-5, -5, -3, -1, 0, 9, 9, 1, 4, 5, -5};
        int[] resultOfTask08 = Task08.excludeMinValue(arrayForTask08);
        System.out.println("Result of task 08: " + arrayToString(resultOfTask08));

        int[] arrayForTask09 = new int[]{1,1,1,1,2,2,2,2};
        int resultOfTask09 = Task09.mostCommonNumber(arrayForTask09);
        System.out.println("Result of task 09: " + resultOfTask09);

        int[] arrayForTask10 = new int[]{719, 303, 853, 745, 196, 895, 175, 292, 611, 893};
        int[] resultOfTask10 = Task10.zeroIntoSecondElement(arrayForTask10);
        System.out.println("Result of task 10: " + arrayToString(resultOfTask10));
    }

    private static String arrayToString(int[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }

    private static String arrayToString(double[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }
}
