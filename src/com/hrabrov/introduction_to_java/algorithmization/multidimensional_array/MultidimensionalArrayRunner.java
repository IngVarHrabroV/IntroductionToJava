package com.hrabrov.introduction_to_java.algorithmization.multidimensional_array;

import com.hrabrov.introduction_to_java.algorithmization.multidimensional_array.task16.Task16;

public class MultidimensionalArrayRunner {
    public static void run() {
        System.out.println("Start 2th block: multidimensional arrays");
        Task01.run(RandomMatrix.create());
        Task02.run(RandomMatrix.create(true));
        Task03.run(RandomMatrix.create(), 2, 3);
        Task04.run(2);
        Task05.run(4);
        Task06.run(8);
        Task07.run(5);
        Task08.run(RandomMatrix.create());
        Task09.run(RandomMatrix.create());
        Task10.run(RandomMatrix.create(true));
        Task11.run();
        Task12.run(RandomMatrix.create());
        Task13.run(RandomMatrix.create());
        Task14.run(5, 4);
        Task15.run(RandomMatrix.create());
        Task16.run(6);
        System.out.println("End 2th block: multidimensional arrays");
    }
}
