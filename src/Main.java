import com.hrabrov.introduction_to_java.algorithmization.one_dimensional_array.OneDimensionalArray;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.branching.BranchingRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.cycle.CycleRunner;
import com.hrabrov.introduction_to_java.basic_of_software_code_development.linear_program.LinerRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****    Start basic of software code development module     ***** \n");
        //basicOFSoftwareCodeDevelopmentRunner();
        System.out.println("*****    End basic of software code development module    *****");

        System.out.println("*****    Start Algoritmization module     ***** \n");
        algoritmizationRunner();
        System.out.println("*****    End Algoritmization module    *****");
    }

    public static void basicOFSoftwareCodeDevelopmentRunner() {
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

    public static void algoritmizationRunner() {
        System.out.println("Start 1th block: one-dimensional arrays");
        OneDimensionalArray.run();
        System.out.println("End 1th block: one-dimensional arrays \n");
    }
}


