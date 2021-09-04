package Exams.Exam2;
import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0.0;

        switch (gender){
            case 'm':
                if (sport.equals("Gym")){
                    price = 42;
                } else if (sport.equals("Boxing")){
                    price = 41;
                } else if (sport.equals("Yoga")){
                    price = 45;
                } else if (sport.equals("Zumba")){
                    price = 34;
                } else if (sport.equals("Dances")){
                    price = 51;
                } else if (sport.equals("Pilates")){
                    price = 39;
                }
                if (age <= 19){
                    price = price - price * 0.20;
                }
                break;
            case 'f':
                if (sport.equals("Gym")){
                    price = 35;
                } else if (sport.equals("Boxing")){
                    price = 37;
                } else if (sport.equals("Yoga")){
                    price = 42;
                } else if (sport.equals("Zumba")){
                    price = 31;
                } else if (sport.equals("Dances")){
                    price = 53;
                } else if (sport.equals("Pilates")){
                    price = 37;
                }
                if (age <= 19){
                    price = price - price * 0.20;
                }
                break;
        }

        if (price <= money){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            double moneyMore = price - money;
            System.out.printf("You don't have enough money! You need $%.2f more.", moneyMore);
        }
    }
}
