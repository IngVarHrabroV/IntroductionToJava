import com.hrabrov.introduction_to_java.basic_of_software_code_development.branching.BranchingRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.cicle.CycleRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.linearing_program.LinerRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start 1th block: branching");
        LinerRunner.run();
        System.out.println("End 1th block: branching \n");

        System.out.println("Start 2th block: linear");
        BranchingRunner.run();
        System.out.println("End 2th block: linear \n");

        System.out.println("Start 3th block: loops");
        CycleRunner.run();
        System.out.println("End 3th block: loops");
    }
}
