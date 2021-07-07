package com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void run() {
        int resultOfTask01 = Task01.sumMultipleNumber(new int[]{3, 4, 5, 6, 8}, 3);
        System.out.println("Result task 01: " + resultOfTask01);

        ArrayWithReplacement resultOfTask02 = Task02.replacementNumber(new double[]{3.54, 3.67, 4.25}, 3.55);
        System.out.println(
                "Result of task 02: "
                + "replacement array = " + Arrays.toString(resultOfTask02.sequenceOfReal) + ", "
                + "number of replace = " + resultOfTask02.replacement);

        Quantity resultOfTask03 = Task03.checkArrayElements(10);
        System.out.println(
                "Result of task 03:"
                + " quantity of negative number = " + resultOfTask03.negativeQuantity
                + "; quantity of positive number = " + resultOfTask03.positiveQuantity
                + "; quantity of number equals zero = " + resultOfTask03.zeroQuantity);

        double[] resultOfTask04 = Task04.swapElements(new double[]{4.25, 4.26, 4.27, 4.28});
        System.out.println("Result of task 04: " + Arrays.toString(resultOfTask04));

        String resultOfTask05 = Task05.selectElement(new int[]{-5, 2, 5, 6, -3, -42});
        System.out.println("Result of task 05: " + resultOfTask05);

        double resultOfTask06 = Task06.sumPrimeNumber(new double[]{0.98, 0, -0.61, 0.38, 0.23, 0.51, -0.73, -0.04});
        System.out.println("Result of task 06: " + resultOfTask06);

        double resultOfTask07 = Task07.maxValueFromSequence(new double[]{0.049, 0.950, 0.634, 0.374, 0.099, -0.933});
        System.out.println("Result of task 07: "
                + (resultOfTask07 != 0.0 ? resultOfTask07 : "the number of members in the sequence must be even" ));

        int[] resultOfTask08 = Task08.excludeMinValue(new int[]{-5, -5, -3, -1, 0, 9, 9, 1, 4, 5, -5});
        System.out.println("Result of task 08: " + Arrays.toString(resultOfTask08));

        int resultOfTask09 = Task09.mostCommonNumber(new int[]{1,1,1,1,2,2,2,2});
        System.out.println("Result of task 09: " + resultOfTask09);

        int[] resultOfTask10 = Task10.zeroIntoSecondElement(new int[]{719, 303, 853, 745, 196, 895, 175, 292, 611, 893});
        System.out.println("Result of task 10: " + Arrays.toString(resultOfTask10));
    }
}
