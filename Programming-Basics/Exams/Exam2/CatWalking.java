package Exams.Exam2;
import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalking = Integer.parseInt(scanner.nextLine());
        int numWalking = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalking = minutesWalking * numWalking;
        int spentCalories = totalMinutesWalking * 5;
        int minCalories = calories / 2;

        if (spentCalories >= minCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", spentCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", spentCalories);
        }
    }
}
