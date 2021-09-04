package Exams.EarlyExam;
import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();
        double pricePerPerson = 0.0;
        double totalPrice = 0.0;

        switch (month){
            case "march":
            case "april":
            case "may":
                if (partOfTheDay.equals("day")){
                    pricePerPerson = 10.50;
                    if (people >= 4){
                        pricePerPerson = pricePerPerson - 0.10 * pricePerPerson;
                        if (hours >= 5){
                            pricePerPerson = pricePerPerson - 0.50 * pricePerPerson;
                        }
                    }
                } else if (partOfTheDay.equals("night")){
                    pricePerPerson = 8.40;
                    if (people >= 4){
                        pricePerPerson = pricePerPerson - 0.10 * pricePerPerson;
                        if (hours >= 5){
                            pricePerPerson = pricePerPerson - 0.50 * pricePerPerson;
                        }
                    }
                }
                totalPrice = (pricePerPerson * people) * hours;
                System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
                System.out.printf("Total cost of the visit: %.2f%n", totalPrice);
                break;
            case "june":
            case "july":
            case "august":
                if (partOfTheDay.equals("day")){
                    pricePerPerson = 12.60;
                    if (people >= 4){
                        pricePerPerson = pricePerPerson - 0.10 * pricePerPerson;
                        if (hours >= 5){
                            pricePerPerson = pricePerPerson - 0.50 * pricePerPerson;
                        }
                    }
                } else if (partOfTheDay.equals("night")){
                    pricePerPerson = 10.20;
                    if (people >= 4){
                        pricePerPerson = pricePerPerson - 0.10 * pricePerPerson;
                        if (hours >= 5){
                            pricePerPerson = pricePerPerson - 0.50 * pricePerPerson;
                        }
                    }
                }
                totalPrice = (pricePerPerson * people) * hours;
                System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
                System.out.printf("Total cost of the visit: %.2f%n", totalPrice);
                break;
        }
    }
}
