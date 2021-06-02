package com.hrabrov.introduction_to_java.section_1.linear;

public class LinerRunner {
    public static void run() {
        double resultOfTask01 = Task01.calculateFunction(8, 3, 5);
        System.out.println("Result task 01: " + resultOfTask01);

        double resultOfTask02 = Task02.calculateExpression(1.5, 2.6, 3.5);
        System.out.println("Result task 02: " + resultOfTask02);
    }
}
