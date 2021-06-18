package com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CycleRunner {
    public static void run() {
        String resultOfTask01 = Task01.sumNumbersTo(4);
        System.out.println("Result task 01: " + resultOfTask01);

        String resultOfTask02 = Task02.foundFunctionValue(-1, 3,0.5);
        System.out.println("Result task 02: " + resultOfTask02);

        String resultOfTask03 = Task03.sumSquareHundredNumbers(368869976L, 1);
        System.out.println("Result task 03: " + resultOfTask03);

        String resultOfTask04 = Task04.multiplySquareTwoHundredNumbers(1, 1);
        System.out.println("Result task 04: " + resultOfTask04);

        double resultOfTask05 = Task05.sumMembersOfTheNumberRow(2, 0, 5);
        System.out.println("Result task 05: " + resultOfTask05);

        StringBuilder resultOfTask06 = Task06.numberEquivalentSymbol();
        System.out.println("Result task 06: " + resultOfTask06);

        System.out.println("Start task 07:");
        StringBuilder resultOfTask07 = Task07.findDividerForAllNumbers(enterLongFromConsole("m"), enterLongFromConsole("n"));
        System.out.println("Result task 07: " + resultOfTask07);

        ArrayList<Integer> resultOfTask08 = Task08.identicalNumeralsForTwoNumbers(1.1111111162, 34516789.5443);
        System.out.println("Result task 08: " + Arrays.toString(resultOfTask08.toArray()));
    }

    public static long enterLongFromConsole(String x) {
        Scanner sc = new Scanner(System.in);
        long a;

        System.out.print("Enter " + x + " >> ");
        while (!sc.hasNextLong()){
            System.out.println("You cannot enter " + sc.next());
            System.out.print("Enter " + x + " >> ");
        }

        a = sc.nextLong();
        return a;
    }
}
