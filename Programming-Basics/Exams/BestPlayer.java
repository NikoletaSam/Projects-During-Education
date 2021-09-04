package Exams;
import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int mostGoals = 0;
        String bestPlayer = "";

        while (!name.equals("END")){
            int numGoals = Integer.parseInt(scanner.nextLine());
            if (numGoals > mostGoals){
                mostGoals = numGoals;
                bestPlayer = name;
            }
            if (numGoals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player! %n", bestPlayer);
        if (mostGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGoals);
        } else {
            System.out.printf("He has scored %d goals.", mostGoals);
        }
    }
}
