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

        BigDecimal resultOfTask04 = Task04.multiplySquareTwoHundredNumbers(1, 7.7);
        System.out.println("Result task 04: " + resultOfTask04);

        double resultOfTask05 = Task05.sumMembersOfTheNumberRow(2, 0, 5);
        System.out.println("Result task 05: " + resultOfTask05);

        StringBuilder resultOfTask06 = Task06.numberEquivalentSymbol();
        System.out.println("Result task 06: " + resultOfTask06);

    }
}
