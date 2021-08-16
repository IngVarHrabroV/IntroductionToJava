package com.hrabrov.introduction_to_java.algorithmization.decomposition;

public class Task09 {
    /**
     * Given sizes of sides of not self-intersecting quadrangle: x, y, z and t.
     * Angle is equal to 90 degrees between side x and y. Find area of the quadrangle.
     *
     * @param x        input size of side
     * @param y        input size of side
     * @param z        input size of side
     * @param t        input size of side
     * @param isConvex input true, if quadrangle is convex
     * @return area of the quadrangle
     */

    private static double findAreaOfQuadrangle(int x, int y, int z, int t, boolean isConvex) {
        final double hypotenuseBetweenXAndY = findHypotenuse(x ,y);

        final double areaOfRightTriangle = findAreaOfRightTriangle(x, y);
        final double areaOfSecondTriangle = findAreaOfAnyTriangle(hypotenuseBetweenXAndY, z, t);

        if (isConvex) {
            return areaOfRightTriangle + areaOfSecondTriangle;
        } else {
            return areaOfRightTriangle - areaOfSecondTriangle;
        }
    }

    private static double findAreaOfRightTriangle(int a, int b) {
        return (a * b) / 2.0;
    }

    private static double findAreaOfAnyTriangle(double hypotenuseBetweenXAndY, int a, int b) {
        final double perimeter = (a + b + hypotenuseBetweenXAndY) / 2;
        final double rootValue = perimeter * (perimeter - hypotenuseBetweenXAndY) * (perimeter - a) * (perimeter - b);

        return Math.sqrt(rootValue);
    }

    /**
     * See {@link #findAreaOfQuadrangle(int, int, int, int, boolean)} docs for more details
     */

    public static void run(int x, int y, int z, int t, boolean isConvex) {
        if (!checkOnExist(x, y, z, t)) {
            System.out.println("this quadrangle not exist");
            return;
        }

        double resultOfTask09 = findAreaOfQuadrangle(x, y, z, t, isConvex);

        if (resultOfTask09 < 0) {
            System.out.println("Not exist not convex quadrangle with enter size of side");
            return;
        }

        System.out.println("Result of task 09: " + String.format("%.3f", resultOfTask09));
    }

    private static double findHypotenuse(int firstLeg, int secondLeg) {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }


    private static boolean checkOnExist(int x, int y, int z, int t) {
        final double hypotenuse = findHypotenuse(x ,y);

        return z + t > hypotenuse;
    }
}
