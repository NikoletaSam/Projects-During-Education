package ConditionalsWhile.ex;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;
        int counter = 0;
        int herMoney = 0;

        while (coinsChange != 0){
            if (coinsChange >= 200){
                herMoney = 200;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 100){
                herMoney = 100;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 50){
                herMoney = 50;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 20){
                herMoney = 20;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 10){
                herMoney = 10;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 5){
                herMoney = 5;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 2){
                herMoney = 2;
                coinsChange -= herMoney;
                counter++;
            } else if (coinsChange >= 1){
                herMoney = 1;
                coinsChange -= herMoney;
                counter++;
            } else {
                break;
            }
        }

        System.out.println(counter);
    }
}
