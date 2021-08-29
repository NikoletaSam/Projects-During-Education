package ConditionalsFor.more;
import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());
        int age = 17;

        for (int i = 1800; i<=lastYear; i++){
            age++;
            if(i % 2 == 0){
                money = money - 12000;
            } else {
                money = money - (12000 + 50 * age);
            }
        }

        if (money >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            money = -money;
            System.out.printf("He will need %.2f dollars to survive.", money);
        }
    }
}
