package ConditionalsWhile.more;
import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int amountInMl = bottles * 750;
        int counter = 0;
        int dishes = 0;
        int pots = 0;

        while (amountInMl >= 0){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            } else {
                counter++;
                if (counter % 3 != 0){
                    int numDishes = Integer.parseInt(input);
                    dishes += numDishes;
                    amountInMl = amountInMl - (numDishes * 5);
                } else {
                    int numPots = Integer.parseInt(input);
                    pots += numPots;
                    amountInMl -= numPots * 15;
                }
            }
        }

        if (amountInMl >= 0){
            System.out.println("Detergent was enough!");
            System.out.println(dishes + " dishes and " + pots + " pots were washed.");
            System.out.println("Leftover detergent " + amountInMl + " ml.");
        } else {
            amountInMl = -amountInMl;
            System.out.println("Not enough detergent, " + amountInMl + " ml. more necessary!");
        }
    }
}
