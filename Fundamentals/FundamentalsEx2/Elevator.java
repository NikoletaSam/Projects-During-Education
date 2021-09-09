package FundamentalsEx2;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil( (numOfPeople * 1.0) / capacityOfElevator);
        System.out.printf("%.0f", courses);
    }
}
