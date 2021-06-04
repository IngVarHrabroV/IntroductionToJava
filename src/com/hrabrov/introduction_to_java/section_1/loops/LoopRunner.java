package com.hrabrov.introduction_to_java.section_1.loops;

public class LoopRunner {
    public static void run() {
        long resultOfTask01 = Task01.sumNumbersTo(4);
        System.out.println("Result task 01: " + resultOfTask01);

        String resultOfTask02 = Task02.foundFunctionValue(-1, 3,0.5);
        System.out.println("Result task 02: " + resultOfTask02);
    }
}
