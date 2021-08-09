package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task03 {
    /**
     * Calculate the area of a regular hexagon with side a using the triangle area method.
     *
     * @param sizeOfSide input size of side
     * @return area of a regular hexagon
     */

    private static double calculateHexagonArea(int sizeOfSide) {
        return 6 * calculateTriangleArea(sizeOfSide);
    }

    private static double calculateTriangleArea(int sizeOfSide) {
        return 1.5 * Math.sqrt(3) * Math.pow(sizeOfSide, 2);
    }

    /**
     * See {@link #calculateHexagonArea(int)} docs
     */
    public static void run(int sizeOfSide) {
        System.out.println("Result of task 03: " + String.format("%.3f", calculateHexagonArea(sizeOfSide)));
    }
}
