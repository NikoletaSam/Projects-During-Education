package FundamentalsEx1;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (day){
            case "Friday":
                if (typeOfTheGroup.equals("Students")){
                    price = people * 8.45;
                    if (people >= 30){
                        price = price - 0.15 * price;
                    }
                } else if (typeOfTheGroup.equals("Business")){
                    price = people * 10.90;
                    if (people >= 100){
                        price = price - 10 * 10.90;
                    }
                } else if (typeOfTheGroup.equals("Regular")){
                    price = people * 15;
                    if (people >= 10 && people <= 20){
                        price = price - 0.05 * price;
                    }
                }
                break;
            case "Saturday":
                if (typeOfTheGroup.equals("Students")){
                    price = people * 9.80;
                    if (people >= 30){
                        price = price - 0.15 * price;
                    }
                } else if (typeOfTheGroup.equals("Business")){
                    price = people * 15.60;
                    if (people >= 100){
                        price = price - 10 * 15.60;
                    }
                } else if (typeOfTheGroup.equals("Regular")){
                    price = people * 20;
                    if (people >= 10 && people <= 20){
                        price = price - 0.05 * price;
                    }
                }
                break;
            case "Sunday":
                if (typeOfTheGroup.equals("Students")){
                    price = people * 10.46;
                    if (people >= 30){
                        price = price - 0.15 * price;
                    }
                } else if (typeOfTheGroup.equals("Business")){
                    price = people * 16;
                    if (people >= 100){
                        price = price - 10 * 16;
                    }
                } else if (typeOfTheGroup.equals("Regular")){
                    price = people * 22.50;
                    if (people >= 10 && people <= 20){
                        price = price - 0.05 * price;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
