package com.hrabrov.introduction_to_java.algorithmization.sorting;

import com.hrabrov.introduction_to_java.algorithmization.sorting.task08.Fraction;
import com.hrabrov.introduction_to_java.algorithmization.sorting.task08.Task08;

public class SortingRunner {
    public static void run() {
        System.out.println("Start 3th block: sorts");
        Task01.run(RandomArray.create(4), RandomArray.create(3), 3);
        Task02.run(RandomArray.create(4,true), RandomArray.create(4, true));
        Task03.run(RandomArray.create(4, true));
        Task04.run(RandomArray.create(8));
        Task05.run(RandomArray.create(8));
        Task06.run(RandomArray.create(8));
        Task07.run(RandomArray.create(8, true), RandomArray.create(4, true));
        Task08.run(Fraction.getFractions(6));
        System.out.println("End 3th block: sorts\n");
    }
}
