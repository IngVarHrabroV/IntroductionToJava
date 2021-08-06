package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

public class Task07 {
    /**
     * Create square matrix of order N by the rule and count positive elements.
     * a[i, j] = sin[(i * i - j * j) / n]
     *
     * @param sizeOfMatrix input order for matrix
     * @return matrix and quantity positive elements
     */

    private static MatrixAndHerPositiveElements createMatrixForTask07(int sizeOfMatrix) {
        final int degree = 2;

        MatrixAndHerPositiveElements matrixAndHerPositiveElements = new MatrixAndHerPositiveElements();

        double[][] matrix = new double[sizeOfMatrix][sizeOfMatrix];
        int quantityPositiveElements = 0;

        double expressionValue;
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                expressionValue = (Math.pow(i, degree) - Math.pow(j, degree)) / sizeOfMatrix;
                matrix[i][j] = Math.sin(expressionValue);

                if (matrix[i][j] > 0) {
                    quantityPositiveElements++;
                }
            }
        }

        matrixAndHerPositiveElements.matrix = matrix;
        matrixAndHerPositiveElements.quantityPositiveElements = quantityPositiveElements;

        return matrixAndHerPositiveElements;
    }

    static class MatrixAndHerPositiveElements {
        double[][] matrix;
        int quantityPositiveElements;
    }

    /**
     * See {@link #createMatrixForTask07(int)} docs for more details
     */
    public static void run(int matrixOfSize) {
        System.out.println("Result of task 07: ");
        MatrixAndHerPositiveElements resultOfTask07 = Task07.createMatrixForTask07(matrixOfSize);
        System.out.println(StringHelper.matrixToString(resultOfTask07.matrix));
        System.out.println("Quantity positive elements = " + resultOfTask07.quantityPositiveElements);
    }
}
