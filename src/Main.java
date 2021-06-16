import com.hrabrov.introduction_to_java.section_1.branching.*;
import com.hrabrov.introduction_to_java.section_1.linear.*;
import com.hrabrov.introduction_to_java.section_1.loops.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start 1th block: branching");
        LinerRunner.run();
        System.out.println("End 1th block: branching \n");

        System.out.println("Start 2th block: linear");
        BranchingRunner.run();
        System.out.println("End 2th block: linear \n");

        System.out.println("Start 3th block: loops");
        LoopRunner.run();
        System.out.println("End 3th block: loops");
    }
}
