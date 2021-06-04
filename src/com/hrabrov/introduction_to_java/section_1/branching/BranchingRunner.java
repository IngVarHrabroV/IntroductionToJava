package com.hrabrov.introduction_to_java.section_1.branching;

public class BranchingRunner {
    public static void run() {
        String resultOfTask01 = Task01.triangleISThere(90, 60);
        System.out.println("Result task 01: " + resultOfTask01);

        String resultOfTask02 = Task02.maxMinValue(-86.134, -851343, 34242, 32452.6943);
        System.out.println("Result task 02: " + resultOfTask02);

        String resultOfTask03 = Task03.threeDotsOnOneLine(0, 5, 5, 2, 10, -1);
        System.out.println("Result task 03: " + resultOfTask03);

        String resultOfTask04 = Task04.brickCanFit(1.999999999999999, 8.6, 6,2,3);
        System.out.println("Result task 04: " + resultOfTask04);
    }
}
