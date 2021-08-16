package com.hrabrov.introduction_to_java.algorithmization.decomposition;

import com.hrabrov.introduction_to_java.algorithmization.decomposition.helpers.Helper;
import com.hrabrov.introduction_to_java.algorithmization.decomposition.task04.Task04;

public class DecompositionRunner {
    public static void run() {
        System.out.println("Start 4th block: decomposition");
        Task01.run(9, 12);
        Task02.run(9, 9, 12, 15);
        Task03.run(3);
        Task04.run(Helper.takeIntArray(4));
        Task05.run(Helper.takeIntArray(3));
        Task06.run(9, 5, 11);
        Task07.run();
        Task08.run(Helper.takeIntArray(3), 1, 5);
        Task09.run(2, 3, 10, 10, true);
        Task10.run(86436713);
        Task11.run(121, 111);
        Task12.run(6, 30);
        Task13.run(13);
        Task14.run(2000);
        Task15.run(4);
        Task16.run(4);
        Task17.run(126);
        System.out.println("End 4th block: decomposition");
    }
}
