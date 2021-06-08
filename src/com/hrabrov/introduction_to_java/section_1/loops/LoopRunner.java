package com.hrabrov.introduction_to_java.section_1.loops;

import java.math.BigDecimal;

public class LoopRunner {
    public static void run() {
        long resultOfTask01 = Task01.sumNumbersTo(4);
        System.out.println("Result task 01: " + resultOfTask01);

        String resultOfTask02 = Task02.foundFunctionValue(-1, 3,0.5);
        System.out.println("Result task 02: " + resultOfTask02);

        double resultOfTask03 = Task03.sumSquareHundredNumbers(1, 1);
        System.out.println("Result task 03: " + resultOfTask03);

        BigDecimal resultOfTask4 = Task04.multiplySquareTwoHundredNumbers(1, 1);
        System.out.println("Result task 04: " + resultOfTask4);
    }
}
