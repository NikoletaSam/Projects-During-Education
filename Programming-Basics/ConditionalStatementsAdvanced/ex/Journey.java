package ConditionalStatementsAdvanced.ex;
import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeOfVacation = "";
        String destination = "";
        double price = 0.0;

        switch (season){
            case "summer":
                if (budget <= 100){
                    price = budget * 0.30;
                    typeOfVacation = "Camp";
                    destination = "Bulgaria";
                } else if (budget <= 1000){
                    price = budget * 0.40;
                    typeOfVacation = "Camp";
                    destination = "Balkans";
                } else {
                    price = budget * 0.90;
                    typeOfVacation = "Hotel";
                    destination = "Europe";
                }
                System.out.printf("Somewhere in %s %n", destination);
                System.out.printf("%s - %.2f", typeOfVacation, price);
                break;
            case "winter":
                if (budget <= 100){
                    price = budget * 0.70;
                    typeOfVacation = "Hotel";
                    destination = "Bulgaria";
                } else if (budget <= 1000){
                    price = budget * 0.80;
                    typeOfVacation = "Hotel";
                    destination = "Balkans";
                } else {
                    price = budget * 0.90;
                    typeOfVacation = "Hotel";
                    destination = "Europe";
                }
                System.out.printf("Somewhere in %s %n", destination);
                System.out.printf("%s - %.2f", typeOfVacation, price);
                break;
        }
    }
}
