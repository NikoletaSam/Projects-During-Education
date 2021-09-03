package NestedLoop.lab;
import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")){
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double currentBudget = 0.0;
            while (currentBudget < minimalBudget){
                double money = Double.parseDouble(scanner.nextLine());
                currentBudget += money;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
