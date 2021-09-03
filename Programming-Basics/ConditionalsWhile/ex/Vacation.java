package ConditionalsWhile.ex;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double herMoney = Double.parseDouble(scanner.nextLine());
        int daysSpent = 0;
        int totalDays = 0;

        while ( herMoney < neededMoney){
            String option = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (option.equals("spend")){
                herMoney -= money;
                daysSpent++;
                if(herMoney < 0){
                    herMoney = 0;
                }
            } else if (option.equals("save")){
                herMoney += money;
                daysSpent = 0;
            }
            totalDays++;

            if (daysSpent >= 5){
                break;
            }
        }

        if (herMoney >= neededMoney){
            System.out.println("You saved the money for " + totalDays + " days.");
        } else {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        }
    }
}
