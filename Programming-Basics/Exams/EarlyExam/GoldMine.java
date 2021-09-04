package Exams.EarlyExam;
import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocations = Integer.parseInt(scanner.nextLine());
        double totalGoldPerDay = 0.0;
        double averageGoldPerDay = 0.0;

        for (int i = 1; i <= numLocations; i++){
            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int numDaysAtLocation = Integer.parseInt(scanner.nextLine());

            for (int day = 1; day <= numDaysAtLocation; day++){
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGoldPerDay += goldPerDay;
            }
            averageGoldPerDay = totalGoldPerDay / numDaysAtLocation;
            if (averageGoldPerDay >= expectedGoldPerDay){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                double goldNeeded = expectedGoldPerDay - averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n", goldNeeded);
            }
            totalGoldPerDay = 0;
        }
    }
}
