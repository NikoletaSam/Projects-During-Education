package Exams.Preparation;
import java.util.Scanner;

public class TravelAgency2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String packageType = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

            if (destination.equals("Bansko") || destination.equals("Borovets")){
                if (packageType.equals("noEquipment")){
                    double pricePerDay = 80;
                    if (VIP.equals("yes")){
                        pricePerDay = pricePerDay - 0.05 * pricePerDay;
                    }
                    if (days > 7){
                        double priceTotalDays = (days - 1) * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else if (days >= 1){
                        double priceTotalDays = days * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else {
                        System.out.println("Days must be positive number!");
                    }
                } else if (packageType.equals("withEquipment")){
                    double pricePerDay = 100;
                    if (VIP.equals("yes")){
                        pricePerDay = pricePerDay - 0.10 * pricePerDay;
                    }
                    if (days > 7){
                        double priceTotalDays = (days - 1) * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else if (days >= 1){
                        double priceTotalDays = days * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else {
                        System.out.println("Days must be positive number!");
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else if (destination.equals("Varna") || destination.equals("Burgas")){
                if (packageType.equals("noBreakfast")){
                    double pricePerDay = 100;
                    if (VIP.equals("yes")){
                        pricePerDay = pricePerDay - 0.07 * pricePerDay;
                    }
                    if (days > 7){
                        double priceTotalDays = (days - 1) * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else if (days >= 1){
                        double priceTotalDays = days * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else {
                        System.out.println("Days must be positive number!");
                    }
                } else if (packageType.equals("withBreakfast")){
                    double pricePerDay = 130;
                    if (VIP.equals("yes")){
                        pricePerDay = pricePerDay - 0.12 * pricePerDay;
                    }
                    if (days > 7){
                        double priceTotalDays = (days - 1) * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else if (days >= 1){
                        double priceTotalDays = days * pricePerDay;
                        System.out.printf("The price is %.2flv! Have a nice time!", priceTotalDays);
                    } else {
                        System.out.println("Days must be positive number!");
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
    }
}
