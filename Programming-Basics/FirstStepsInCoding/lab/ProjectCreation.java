package FirstStepsInCoding.lab;
import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numOfProjects = Integer.parseInt(scanner.next());
        int totalHours = numOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHours, numOfProjects);
    }
}
