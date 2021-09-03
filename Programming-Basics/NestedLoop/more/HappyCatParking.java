package NestedLoop.more;
import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double taxPerOddDay = 0.0;
        double taxPerEvenDay = 0.0;
        double totalMoney = 0.0;

        for (int day = 1; day <= numDays; day++){
            for (int hours = 1; hours <= hoursPerDay; hours++){

                if (day % 2 == 0 && hours % 2 != 0){
                    tax = 2.50;
                    taxPerEvenDay += tax;
                } else if (day % 2 != 0 && hours % 2 == 0){
                    tax = 1.25;
                    taxPerOddDay += tax;
                } else {
                    tax = 1;
                    taxPerEvenDay += tax;
                    taxPerOddDay += tax;
                }


            }

            if (day % 2 != 0){
                System.out.printf("Day: %d - %.2f leva %n", day, taxPerOddDay);
                totalMoney += taxPerOddDay;
            } else {
                System.out.printf("Day: %d - %.2f leva %n", day, taxPerEvenDay);
                totalMoney += taxPerEvenDay;
            }


            taxPerEvenDay = 0;
            taxPerOddDay = 0;
        }
        System.out.printf("Total: %.2f leva", totalMoney);
    }
}
