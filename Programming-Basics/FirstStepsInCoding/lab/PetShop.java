package FirstStepsInCoding.lab;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDogs = Integer.parseInt(scanner.nextLine());
        int numOfOtherAnimals = Integer.parseInt(scanner.nextLine());

        double priceDogFood = numOfDogs * 2.50;
        int priceOfOtherFood = numOfOtherAnimals * 4;
        double totalSum = priceDogFood + priceOfOtherFood;

        System.out.printf("%.2f lv.", totalSum);
    }
}
