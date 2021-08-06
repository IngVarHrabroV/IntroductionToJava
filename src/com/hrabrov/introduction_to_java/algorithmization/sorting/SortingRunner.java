package com.hrabrov.introduction_to_java.algorithmization.sorting;

import com.hrabrov.introduction_to_java.algorithmization.sorting.task08.Fraction;
import com.hrabrov.introduction_to_java.algorithmization.sorting.task08.Task08;

public class SortingRunner {
    public static void run() {
        int[] firstArrayForTask01 = new int[]{24, 26, 19, 46};
        int[] secondArrayForTask01 = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] resultOfTask01 = Task01.concatenatingArrays(firstArrayForTask01, secondArrayForTask01, 3);
        if (resultOfTask01.length != firstArrayForTask01.length) {
            System.out.println("Result of task 01: " + Helper.arrayToString(resultOfTask01));
        }

        int[] firstArrayForTask02 = new int[]{18, 91, 56, 60, 37, 91, 90};
        int[] secondArrayForTask02 = new int[]{82, 26, 17, 48, 22, 20, 56};
        int[] resultOfTask02 = Task02.createNonDecreasingSequenceFromTwo(firstArrayForTask02, secondArrayForTask02);
        System.out.println("Result of task 02: " + Helper.arrayToString(resultOfTask02));

        int[] arrayForTask03 = new int[]{36, 4, 29, 63, 73, 63, 91};
        int[] resultOfTask03 = Task03.selectionSort(arrayForTask03);
        System.out.println("Result of task 03: " + Helper.arrayToString(resultOfTask03));

        int[] arrayForTask04 = new int[]{62, 78, 86, 10, 91, 9, 70};
        Task04.SortedArrayAndQuantityPermutation resultOfTask04 =
                Task04.exchangeSort(arrayForTask04);
        System.out.println("Result of task 04:");
        System.out.println("\tSorted array: " + Helper.arrayToString(resultOfTask04.sortedArray));
        System.out.println("\tQuantity permutation: " + resultOfTask04.quantityPermutation);

        int[] arrayForTask05 = new int[]{66, 68, 71, 10, 10, 27, 47};
        int[] resultOfTask05 = Task05.insertionSort(arrayForTask05);
        System.out.println("Result of task 05: " + Helper.arrayToString(resultOfTask05));

        int[] arrayForTask06 = new int[]{94, -79, 76, -53, 85, -4};
        int[] resultOfTask06 = Task06.shellSort(arrayForTask06);
        System.out.println("Result of task 06:");
        System.out.println("\t - shell's sort: " + Helper.arrayToString(resultOfTask06));
        resultOfTask06 = Task06.gnomeSort(arrayForTask06);
        System.out.println("\t - gnome's sort: " + Helper.arrayToString(resultOfTask06));

        int[] firstArrayForTAsk07 = new int[]{17, 32, 40, 67, 83, 96, 99};
        int[] secondArrayForTAsk07 = new int[]{35, 55, 60, 67, 99};
        int[] resultOfTask07 = Task07.indexesForInsert(firstArrayForTAsk07, secondArrayForTAsk07);
        System.out.println("Indexes in new sequence for insertion: " + Helper.arrayToString(resultOfTask07));

        Fraction[] fractionsForTask08 = Fraction.getFractions(6);
        System.out.println(Helper.fractionsToString(fractionsForTask08));

        Fraction[] resultOfTask08 = Task08.arrangeFractions(fractionsForTask08);
        System.out.println(Helper.fractionsToString(resultOfTask08));


    }


}
