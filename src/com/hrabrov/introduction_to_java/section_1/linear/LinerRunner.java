package com.hrabrov.introduction_to_java.section_1.linear;

public class LinerRunner {
    public static void run() {
        double resultOfTask01 = Task01.calculateFunction(8, 3, 5);
        System.out.println("Result task 01: " + resultOfTask01);

        double resultOfTask02 = Task02.calculateExpression(1.5, 2.6, 3.5);
        System.out.println("Result task 02: " + resultOfTask02);

        double resultOfTask03 = Task03.calculateTrigonometryExpression(45, 30);
        System.out.println("Result task 03: " + resultOfTask03);

        double resultOfTask04 = Task04.swapPartsNumber(123.456);
        System.out.println("Result task 04: " + resultOfTask04);

        String resultOfTask05 = Task05.convertTime(653333);
        System.out.println("Result task 05: " + resultOfTask05);

        boolean resultOfTask06 = Task06.dotInArea(1, 1);
        System.out.println("Result task 06: " + resultOfTask06);
    }
}
