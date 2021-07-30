package com.hrabrov.introduction_to_java.algorithmization.sorting;

public class Sorting {
    public static void run() {
        int[] firstArrayForTask01 = new int[]{24, 26, 19, 46};
        int[] secondArrayForTask01 = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] resultOfTask01 = Task01.concatenatingArrays(firstArrayForTask01, secondArrayForTask01, 3);
        if (resultOfTask01.length != firstArrayForTask01.length) {
            System.out.println("Result of task 01: " + arrayToString(resultOfTask01));
        }

        int[] firstArrayForTask02 = new int[]{18, 91, 56, 60, 37, 91, 90};
        int[] secondArrayForTask02 = new int[]{82, 26, 17, 48, 22, 20, 56};
        int[] resultOfTask02 = Task02.createNonDecreasingSequenceFromTwo(firstArrayForTask02, secondArrayForTask02);
        System.out.println("Result of task 02: " + arrayToString(resultOfTask02));

        int[] arrayForTask03 = new int[]{36, 4, 29, 63, 73, 63, 91};
        int[] resultOfTask03 = Task03.selectionSort(arrayForTask03);
        System.out.println("Result of task 03: " + arrayToString(resultOfTask03));

        int[] arrayForTask04 = new int[]{62, 78, 86, 10, 91, 9, 70};
        Task04.SortedArrayAndQuantityPermutation resultOfTask04 =
                Task04.exchangeSort(arrayForTask04);
        System.out.println("Result of task 04:");
        System.out.println("\tSorted array: " + arrayToString(resultOfTask04.sortedArray));
        System.out.println("\tQuantity permutation: " + resultOfTask04.quantityPermutation);



    }

    private static String arrayToString(int[] array) {
        String stringForStoragingArrayValues = "";

        for (int i = 0; i < array.length; i++) {
            stringForStoragingArrayValues += array[i] + " ";
        }

        return stringForStoragingArrayValues;
    }
}
