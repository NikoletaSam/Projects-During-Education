package Exams.EarlyExam;
import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kgFood = Integer.parseInt(scanner.nextLine());
        int foodInGrams = kgFood * 1000;
        int totalEatenFood = 0;

        String command = scanner.nextLine();
        while (!command.equals("Adopted")){
            int eatenFood = Integer.parseInt(command);
            totalEatenFood += eatenFood;
            command = scanner.nextLine();
        }
        if (foodInGrams >= totalEatenFood){
            int leftovers = foodInGrams - totalEatenFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftovers);
        } else {
            int moreFoodNeeded = totalEatenFood - foodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", moreFoodNeeded);
        }
    }
}
