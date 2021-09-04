package Exams.Preparation;
import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        double worOut = 0;
        double protein = 0;

        for (int i = 1; i <= people; i++){
            String activity = scanner.nextLine();

            if (activity.equals("Back")){
                back++;
                worOut++;
            } else if (activity.equals("Chest")){
                chest++;
                worOut++;
            } else if (activity.equals("Legs")){
                legs++;
                worOut++;
            } else if (activity.equals("Abs")){
                abs++;
                worOut++;
            } else if (activity.equals("Protein shake")){
                proteinShake++;
                protein++;
            } else if (activity.equals("Protein bar")){
                proteinBar++;
                protein++;
            }
        }
        double workOutPercentage = (worOut / people) * 100;
        double proteinPercentage = (protein / people) * 100;

        System.out.printf("%d - back %n", back);
        System.out.printf("%d - chest %n", chest);
        System.out.printf("%d - legs %n", legs);
        System.out.printf("%d - abs %n", abs);
        System.out.printf("%d - protein shake %n", proteinShake);
        System.out.printf("%d - protein bar %n", proteinBar);
        System.out.printf("%.2f", workOutPercentage);
        System.out.println("% - work out");
        System.out.printf("%.2f", proteinPercentage);
        System.out.println("% - protein");
    }
}
