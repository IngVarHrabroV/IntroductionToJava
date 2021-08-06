package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

import java.util.Scanner;

public class Task08 {

    /**
     * Given numeral matrix. Replace the position of any two columns.
     * User enter is column numbers from keyboard
     *
     * @param originalMatrix input numeral multidimensional array
     * @return matrix with replaced columns
     */

    private static int[][] replaceTwoColumn(int[][] originalMatrix) {
        final int VERTICAL_SIZE_OF_MATRIX = originalMatrix.length;
        final int HORIZONTAL_SIZE_OF_MATRIX = originalMatrix[0].length;

        System.out.print("Enter number of first column for replace: ");
        final int NUMBER_FIRST_COLUMN = inputIntNumber();
        System.out.print("Enter number of second column for replace: ");
        final int NUMBER_SECOND_COLUMN = inputIntNumber();

        if (checkValidationArgument(HORIZONTAL_SIZE_OF_MATRIX, NUMBER_FIRST_COLUMN, NUMBER_SECOND_COLUMN)) {
            for (int i = 0; i < VERTICAL_SIZE_OF_MATRIX; i++) {
                int temp = originalMatrix[i][NUMBER_FIRST_COLUMN - 1];
                originalMatrix[i][NUMBER_FIRST_COLUMN - 1] = originalMatrix[i][NUMBER_SECOND_COLUMN - 1];
                originalMatrix[i][NUMBER_SECOND_COLUMN - 1] = temp;
            }

            return originalMatrix;
        }

        return null;
    }

    private static boolean checkValidationArgument(int matrixHorizontalSize, int firstColumn, int secondColumn) {
        if (secondColumn > matrixHorizontalSize || firstColumn > matrixHorizontalSize) {
            System.out.println("Number of column can't be larger than horizontal size matrix");
            System.out.println("Horizontal matrix size is " + matrixHorizontalSize);
            return false;
        }

        if (firstColumn < 1 || secondColumn < 1) {
            System.out.println("Number of column can't be less than 1");
            return false;
        }

        return true;
    }

    /**
     * See {@link #replaceTwoColumn(int[][])} docs for more details
     */
    public static void run(int[][] originalMatrix) {
        System.out.println("Result of task 08: ");
        System.out.println("Original matrix: ");
        System.out.println(StringHelper.matrixToString(originalMatrix));

        System.out.println("Starting replace column");
        int[][] resultOfTask08 = Task08.replaceTwoColumn(originalMatrix);

        if (resultOfTask08 == null) {
            return;
        }

        System.out.println("Matrix with replaced columns: ");
        System.out.println(StringHelper.matrixToString(resultOfTask08));
    }

    private static int inputIntNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");

        while (!sc.hasNextInt()) {
            System.out.println("You can't enter " + sc.next());
            System.out.print("Try again >> ");
        }

        return sc.nextInt();
    }
}
