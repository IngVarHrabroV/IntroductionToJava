package com.hrabrov.introduction_to_java.section_1;

import com.hrabrov.introduction_to_java.section_1.branching.*;
import com.hrabrov.introduction_to_java.section_1.branching.Task05;
import com.hrabrov.introduction_to_java.section_1.linear.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start 1th block");
        LinerRunner.run();
        System.out.println("End 1th block \n");
        System.out.println("Start 2th block");
        BranchingRunner.run();
        System.out.println("End 2th block \n");
    }
}
