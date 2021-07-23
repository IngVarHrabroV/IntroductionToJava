package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void run() {
        int[][] matrixForTask01 = new int[][]{
                {25, 4, 3, 5, 12, 2, 2, 2, 2, 2, 2},
                {8, 7, 6, 6, 7},
                {23, 6, 5, 11, 2, 1, 1, 1}
        };
        int[][] resultOfTask01 = Task01.foundOddColumnsWithGreaterFirstItem(matrixForTask01);
        System.out.println("Result of task 01:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask01));
        System.out.println("Transformed matrix:\n" + matrixToString(resultOfTask01));

        int[][] matrixForTask02 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        Task02.arrayWithDiagonalElements resultOfTask02;
        resultOfTask02 = Task02.chooseDiagonalElement(matrixForTask02);
        System.out.println("Result of task 02:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask02));
        System.out.println("First diagonal elements: " + arrayToString(resultOfTask02.firstDiagonal));
        System.out.println("Second diagonal elements: " + arrayToString(resultOfTask02.secondDiagonal));

        int[][] matrixForTask03 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int[][] resultOfTask03 = Task03.displayLineAndColumn(matrixForTask03, 1, 4);
        System.out.println("Result of task 03:");
        System.out.println("Original matrix:\n" + matrixToString(matrixForTask03));
        System.out.println("Selected row: " + arrayToString(resultOfTask03[0]));
        System.out.println("Selected column: " + arrayToString(resultOfTask03[1]));

        System.out.println("Result of task 04: ");
        int[][] resultOfTask04 = Task04.createMatrixForTask04(8);
        System.out.println(matrixToString(resultOfTask04));

        System.out.println("Result of task 05: ");
        int[][] resultOfTask05 = Task05.createMatrixForTask05(3);
        if (resultOfTask05.length != 0) {
            System.out.println(matrixToString(resultOfTask05));
        }

        System.out.println("Result of task 06: ");
        int[][] resultOfTask06 = Task06.createMatrixForTask06(4);
        if (resultOfTask06.length != 0) {
            System.out.println(matrixToString(resultOfTask06));
        }

        System.out.println("Result of task 07: ");
        Task07.MatrixAndYourPositiveElements resultOfTask07;
        resultOfTask07 = Task07.createMatrixForTask07(6);
        System.out.println(matrixToString(resultOfTask07.matrix));
        System.out.println("Quantity positive elements = " + resultOfTask07.quantityPositiveElements);

        int[][] matrixForTask08 = new int[][]{
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        System.out.println("Result of task 08: ");
        System.out.println("Original matrix: ");
        System.out.println(matrixToString(matrixForTask08));
        System.out.println("Starting replace column");
        int firstNumber;
        int secondNumber;
        System.out.print("Enter number of first column for replace: ");
        firstNumber = inputIntNumber();
        System.out.print("Enter number of second column for replace: ");
        secondNumber = inputIntNumber();
        int[][] resultOfTask08 = Task08.replacedTwoColumn(matrixForTask08, firstNumber, secondNumber);
        System.out.println("Matrix with replaced columns: ");
        System.out.println(matrixToString(resultOfTask08));

        int[][] matrixForTask09 = new int[][]{
                {1, 25, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        Task09.SumElementsAndNumberColumn resultOfTask09;
        System.out.println("Result of task 09: ");
        System.out.println("Original matrix:");
        resultOfTask09 = Task09.findSumAndColumn(matrixForTask09);
        System.out.println(matrixToString(matrixForTask09));
        System.out.println("sum  of elements in  columns: " + arrayToString(resultOfTask09.sumElements));
        System.out.println("Column №" + resultOfTask09.numberColumn + " has max sum elements");

        int[][] matrixForTask10 = new int[][]{
                {12, 2, 3, -5},
                {4, -5, 6, 12},
                {7, 8, 9, 10},
                {12, 13, 14, 10}
        };
        System.out.println("Result of task 10:");
        System.out.println("Original matrix:");
        System.out.println(matrixToString(matrixForTask10));
        int[] resultOfTask10;
        resultOfTask10 = Task10.findPositiveElementOfTheMainDiagonal(matrixForTask10);
        System.out.println("Positive elements of the main diagonal: " +
                arrayToString(resultOfTask10));

        System.out.println("Result of task 11:");
        Task11.MatrixAndRowNumber resultOfTask11;
        resultOfTask11 = Task11.createMatrixForTask11();
        System.out.println(matrixToString(resultOfTask11.createdMatrix));
        if (resultOfTask11.rowNumber.length == 0) {
            System.out.println("**No row which the number 5 occurs three and more times!!**");
        } else {
            System.out.println("Numbers row in which the number 5 occurs three and more times: " +
                    arrayToString(resultOfTask11.rowNumber));
        }

        int[][] matrixForTask12 = new int[][]{
                {12, 14, 15, 17},
                {1, 3, 5, 4},
                {9, 34, 75, 13},
                {98, 16, 18, 64}
        };
        System.out.println("Result of task 12:");
        System.out.println("Original matrix:");
        System.out.println(matrixToString(matrixForTask12));
        int[][] resultOfTask12AscendingSort;
        resultOfTask12AscendingSort = Task12.ascendingSortMatrix(matrixForTask12);
        System.out.println("Rows with ascending sort:");
        System.out.println(matrixToString(resultOfTask12AscendingSort));
        int[][] resultOfTask12DescendingSort;
        resultOfTask12DescendingSort = Task12.descendingSortMatrix(matrixForTask12);
        System.out.println("Rows with descending sort:");
        System.out.println(matrixToString(resultOfTask12DescendingSort));

        int[][] matrixForTask13 = new int[][]{
                {12, 14, 15, 17},
                {1, 3, 5, 4},
                {9, 34, 75, 13},
                {98, 16, 18, 64}
        };
        System.out.println("Result of task 13:");
        System.out.println("Original matrix:");
        System.out.println(matrixToString(matrixForTask13));
        int[][] resultOfTask13AscendingSort;
        resultOfTask13AscendingSort = Task13.ascendingSortMatrix(matrixForTask13);
        System.out.println("Columns with ascending sort:");
        System.out.println(matrixToString(resultOfTask13AscendingSort));
        int[][] resultOfTask13DescendingSort;
        resultOfTask13DescendingSort = Task13.descendingSortMatrix(matrixForTask13);
        System.out.println("Columns with descending sort:");
        System.out.println(matrixToString(resultOfTask13DescendingSort));

        System.out.println("Result of task 14:");
        int[][] resultOfTask14 = Task14.generateMatrixForTask14(5, 4);
        System.out.println(matrixToString(resultOfTask14));

        int[][] matrixForTask15 = new int[][]{
                {10, 0, 12, 13, 14, 15},
                {16, 17, 18, 12, 20, 14},
                {-5, 41, 24, 14, 26, 27},
                {28, 29, 30, 31, 32, 19}
        };
        System.out.println("Result of task 15:");
        System.out.println("Original matrix:");
        System.out.println(matrixToString(matrixForTask15));
        System.out.println("Matrix with replaced elements:");
        int[][] resultOfTask15 = Task15.replacedElementsOfMatrix(matrixForTask15);
        System.out.println(matrixToString(resultOfTask15));

        System.out.println("Result of task 16:");
        int[][] resultOfTask16 = Task16.generateMagicSquare(8);
        System.out.println(matrixToString(resultOfTask16));
    }

    private static String matrixToString(int[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixToString += matrix[i][j] >= 0 ? " " : "";
                matrixToString += matrix[i][j];
                matrixToString += matrix[i][j] < 100 ? "\t" : "";
            }
            matrixToString += (i == matrix.length - 1) ? "" : "\n";
        }

        return matrixToString;
    }

    private static String matrixToString(double[][] matrix) {
        String matrixToString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String temp = String.format("%.3f", matrix[i][j]);
                matrixToString += temp;
                matrixToString += matrix[i][j] > 0 ? " " : "";
                matrixToString += (j == matrix[i].length - 1) ? "" : "\t";
            }
            matrixToString += (i == matrix.length - 1) ? "" : "\n";
        }

        return matrixToString;
    }

    private static String arrayToString(int[] array) {
        String arrayToString = "";

        for (int i = 0; i < array.length; i++) {
            arrayToString += array[i] + " ";
        }

        return arrayToString;
    }

    private static int inputIntNumber() {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print(">> ");

        while (!sc.hasNextInt()) {
            System.out.println("You can't enter " + sc.next());
            System.out.print("Try again >> ");
        }

        a = sc.nextInt();

        return a;
    }
}
