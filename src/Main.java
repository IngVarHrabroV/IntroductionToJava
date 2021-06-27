import com.hrabrov.introduction_to_java.basic_of_software_code_development.branching.BranchingRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle.CycleRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program.LinerRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start 1th block: linear program");
        LinerRunner.run();
        System.out.println("End 1th block: linear program \n");

        System.out.println("Start 2th block: branching");
        BranchingRunner.run();
        System.out.println("End 2th block: branching \n");

        System.out.println("Start 3th block: cycle");
        CycleRunner.run();
        System.out.println("End 3th block: cycle");
    }
}
