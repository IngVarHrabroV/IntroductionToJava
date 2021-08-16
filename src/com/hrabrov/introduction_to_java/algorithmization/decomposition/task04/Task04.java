package com.hrabrov.introduction_to_java.algorithmization.decomposition.task04;

import com.hrabrov.introduction_to_java.algorithmization.sorting.Helper;

public class Task04 {
    /**
     * Given n dots on plane. Find, which dots have max distance
     *
     * @param coordinates input X and Y coordinate like [x1, y1, x2, y2, ..., xn, yn]
     * @return coordinates of two dots
     */

    private static Dot[] findMaxDistance(int[] coordinates) {
        final double startMaxDistance = 0.0;
        Dot[] dots = createDots(coordinates);
        Dot[] dotsWithMaxDistance = new Dot[2];

        double maxDistance = startMaxDistance;
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double distance = calculateDistance(dots[i], dots[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    dotsWithMaxDistance[0] = dots[i];
                    dotsWithMaxDistance[1] = dots[j];
                }
            }
        }
        return dotsWithMaxDistance;
    }

    private static double calculateDistance(Dot a, Dot b) {
        if (a.x == b.x) {
            return Math.abs(a.y - b.y);
        }

        if (a.y == b.y) {
            return Math.abs(a.x - b.x);
        }

        return calculateByTheorem(a, b);
    }

    private static double calculateByTheorem(Dot a, Dot b) {
        final double firstLegSquared = Math.pow((a.x - b.x), 2);
        final double secondLegSquared = Math.pow((a.y - b.y), 2);

        return Math.sqrt(firstLegSquared + secondLegSquared);
    }

    private static Dot[] createDots(int[] coordinates) {
        final int sizeOfDotsArray = coordinates.length / 2;
        Dot[] dots = new Dot[sizeOfDotsArray];

        for (int i = 0; i < sizeOfDotsArray; i++) {
            dots[i] = new Dot(coordinates[i * 2], coordinates[i * 2 + 1]);
        }

        return dots;
    }

    /**
     * See {@link #calculateDistance(Dot, Dot)} docs for more details
     */
    public static void run(int[] coordinates) {
        System.out.println("Result of task 04:");
        System.out.println("Created array: " + Helper.arrayToString(coordinates));

        if (!isEven(coordinates.length)) {
            System.out.println("You have to enter pairs of numbers, for creating coordinates");
            return;
        }

        Dot[] resultOfTask04 = findMaxDistance(coordinates);
        System.out.println("Max distance between dots with coordinate ("
                + resultOfTask04[0].x + ";" + resultOfTask04[0].y + ") and ("
                + resultOfTask04[1].x + ";" + resultOfTask04[1].y + ") and equals = "
                + String.format("%.3f", calculateDistance(resultOfTask04[0], resultOfTask04[1])));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
