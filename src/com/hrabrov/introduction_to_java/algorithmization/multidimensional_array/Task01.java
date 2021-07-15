package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task01 {
    /**
     * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
     * больше последнего.
     * Given a matrix. Display all odd columns with the first item greater than last.
     *
     * @param originalMatrix input matrix array
     * @return matrix include odd columns with the first item greater than last
     */

    public static int[][] foundOddColumnsWithGreaterFirstItem(int[][] originalMatrix) {
        int[] firstArrayOfSecondLevel;
        firstArrayOfSecondLevel = originalMatrix[0];
        int[] lastArrayOfSecondLevel;
        lastArrayOfSecondLevel = originalMatrix[originalMatrix.length - 1];

        int minLengthArrayOfSecondLevel = originalMatrix[0].length;
        for (int i = 0; i < originalMatrix.length; i++) {
            minLengthArrayOfSecondLevel = Math.min(minLengthArrayOfSecondLevel, originalMatrix[i].length);
        }

        int countColumnsWithGreaterFirstItem = 0;
        for (int j = 0; j < minLengthArrayOfSecondLevel; j++) {
            if (firstArrayOfSecondLevel[j] > lastArrayOfSecondLevel[j]
                    && j % 2 == 0) {
                countColumnsWithGreaterFirstItem++;
            }
        }

        int[] arrayWithSuitableIndexes = new int[countColumnsWithGreaterFirstItem];
        int tempIndexForArrayWithSuitableIndexes = 0;

        for (int j = 0; j < minLengthArrayOfSecondLevel; j++) {
            if (firstArrayOfSecondLevel[j] > lastArrayOfSecondLevel[j]
                    && j % 2 == 0) {
                arrayWithSuitableIndexes[tempIndexForArrayWithSuitableIndexes] = j;
                tempIndexForArrayWithSuitableIndexes++;
            }
        }

        int[][] returnedMatrix = new int[originalMatrix.length][countColumnsWithGreaterFirstItem];

        for (int i = 0; i < originalMatrix.length; i++) {
            int temp = 0;
            for (int j = 0; j < countColumnsWithGreaterFirstItem; j++) {
                returnedMatrix[i][j] = originalMatrix[i][arrayWithSuitableIndexes[temp]];
                temp++;
            }
        }

        return returnedMatrix;
    }
}
